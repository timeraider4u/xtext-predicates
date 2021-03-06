package at.jku.weiner.c.parser.utils;

import java.util.Stack;

import org.antlr.runtime.TokenStream;

import at.jku.weiner.log.MyLog;

public final class Scope {
	
	protected static final Stack<ScopeSymbols> scope = new Stack<ScopeSymbols>();
	
	public static final void createFirstScope(final String scopeName) {
		Scope.scope.clear();
		Scope.createNewScope(scopeName);
	}
	
	public static final void createNewScope(final String scopeName) {
		MyLog.debug(Scope.class, "createNewScope='" + scopeName + "'");
		final ScopeSymbols symbols = new ScopeSymbols(scopeName);
		Scope.scope.push(symbols);
		MyLog.trace(Scope.class, "Scope.size()='" + Scope.scope.size() + "'");
	}
	
	public static final void removeScope() {
		if (Scope.scope.size() > 0) {
			MyLog.debug(Scope.class, "removeScope='"
					+ Scope.scope.peek().getScopeName() + "'");
			Scope.scope.pop();
		}
		MyLog.trace(Scope.class, "Scope.size()='" + Scope.scope.size() + "'");
	}
	
	public static final void removeScope(final int expectedSize)
			throws Exception {
		Scope.removeScope();
		if (expectedSize != Scope.scope.size()) {
			final int actualSize = Scope.scope.size();
			Scope.scope.clear();
			
			final RuntimeException ex = new RuntimeException("expected size='"
					+ expectedSize + "', but was '" + actualSize + "'!");
			MyLog.error(Scope.class, ex);
		}
	}
	
	public static int size() {
		return Scope.scope.size();
	}
	
	public static final boolean isTypeName(final int backtracking,
			final TokenStream input) {
		String token = input.LT(1).getText();
		if ("(".equals(token)) {
			token = input.LT(2).getText();
		}
		MyLog.trace(Scope.class, "backtracking='" + backtracking
				+ "', token(choosen)='" + token + "'");
		return Scope.isTypeName(backtracking, token);
	}
	
	private static final boolean isTypeName(final int backtracking,
			final String name) {
		MyLog.debug(Scope.class, "searching for typeName='" + name
				+ "', scopeSize='" + Scope.scope.size() + "'");
		for (int i = 0; i < Scope.scope.size(); i++) {
			final ScopeSymbols symbols = Scope.scope.get(i);
			if (symbols.containsType(backtracking, name)) {
				MyLog.debug(Scope.class,
						"found in scope='" + symbols.getScopeName() + "'");
				MyLog.trace(Scope.class, symbols.debug());
				return true;
			}
			MyLog.debug(Scope.class,
					"no type found in scope='" + symbols.getScopeName() + "'");
		}
		MyLog.trace(Scope.class, "isTypeName='false'");
		return false;
	}
	
	public static final void setTemp(final TokenStream stream) {
		final String string = stream.LT(1).getText();
		Scope.scope.peek().setTemp(string);
	}
	
	public static final void setTypedef(final int backtracking,
			final boolean newTypeDef) {
		// if (!newTypeDef) {
		MyLog.trace(Scope.class, "clear peek scope, backtracking='"
				+ backtracking + "'");
		// Scope.scope.peek().clear(backtracking);
		// Log.log(Scope.scope.peek().debug());
		// }
		Scope.scope.peek().setTypeDefValue(newTypeDef);
	}
	
	public static final void addTypedefIfIsTypedef(final int backtracking) {
		Scope.scope.peek().addType(backtracking);
	}
	
	protected static final Stack<ScopeSymbols> scope2 = new Stack<ScopeSymbols>();
	
	public static final void saveState() {
		Scope.copyTo(Scope.scope, Scope.scope2);
	}
	
	public static final void restoreState() {
		Scope.copyTo(Scope.scope2, Scope.scope);
	}
	
	private static final void copyTo(final Stack<ScopeSymbols> source,
			final Stack<ScopeSymbols> target) {
		target.clear();
		for (int i = 0; i < source.size(); i++) {
			final ScopeSymbols symbol = (ScopeSymbols) source.get(i).clone();
			target.add(i, symbol);
		}
	}
}
