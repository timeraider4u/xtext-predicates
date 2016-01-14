package at.jku.weiner.c.parser.utils;

import java.util.HashSet;
import java.util.Iterator;

public final class ScopeTypes {
	private final HashSet<String> types = new HashSet<String>();

	public void addType(final String type) {
		this.types.add(type);
	}

	public void clear() {
		this.types.clear();
	}

	public void removeType(final String type) {
		this.types.remove(type);
	}

	public boolean containsType(final String type) {
		final boolean result = this.types.contains(type);
		return result;
	}
	
	public String debug() {
		final StringBuffer buffer = new StringBuffer("");
		final Iterator<String> it = this.types.iterator();
		int i = 0;
		boolean first = true;
		while (it.hasNext()) {
			final String elem = it.next();
			if (!first) {
				buffer.append(" ");
			}
			buffer.append("elem('");
			buffer.append(i);
			buffer.append("')='");
			buffer.append(elem);
			buffer.append("'");
			i++;
			first = false;
		}
		return buffer.toString();
	}
	
}