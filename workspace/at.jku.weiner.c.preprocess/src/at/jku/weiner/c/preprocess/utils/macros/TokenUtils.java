package at.jku.weiner.c.preprocess.utils.macros;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import at.jku.weiner.c.preprocess.parser.antlr.internal.InternalPreprocessLexer;
import at.jku.weiner.c.preprocess.utils.MyLog;

final class TokenUtils {
	
	protected static Token getWSToken() {
		final Token token = new CommonToken(
				InternalPreprocessLexer.RULE_WHITESPACE, " ");
		return token;
	}
	
	protected static boolean isWhitespaceAt(final int i, final List<Token> list) {
		final Token token = list.get(i);
		final boolean result = TokenUtils.isWhitespace(token);
		return result;
	}
	
	protected static boolean isWhitespace(final Token token) {
		final int type = token.getType();
		final boolean result = (type == InternalPreprocessLexer.RULE_WHITESPACE);
		return result;
	}

	protected static void printList(final String start,
			final List<ArrayList<Token>> tokens) {
		for (int i = 0; i < tokens.size(); i++) {
			final ArrayList<Token> list = tokens.get(i);
			TokenUtils.print(start, list);
		}
	}

	protected static void print(final String start, final List<Token> tokens) {
		final StringBuffer buffer = new StringBuffer(start);
		for (int i = 0; i < tokens.size(); i++) {
			final Token token = tokens.get(i);
			final String text = token.getText();
			buffer.append(text);
			// buffer.append("i='" + i + "', token='" + text + "' ");
		}
		buffer.append("'");
		MyLog.trace(buffer.toString());
	}

}
