package at.jku.weiner.c.parser.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScopeTest {

	private ScopeTypes types = null;
	private ScopeTypes types2 = null;
	private ScopeSymbols symbols = null;
	private ScopeSymbols symbols2 = null;
	
	@Before
	public void setUp() throws Exception {
		this.types = new ScopeTypes(true);
		this.types2 = null;
		this.symbols = new ScopeSymbols("ScopeTest", true);
		this.symbols2 = null;
	}
	
	@After
	public void tearDown() throws Exception {

	}
	
	@Test
	public void testTypes() {
		Assert.assertFalse(this.types.containsType("test"));
		Assert.assertFalse(this.types.containsType("mytype"));
		this.types.addType("test");
		this.types.addType("mytype");
		this.types.addType("mytype");
		this.types.addType("mytype");
		Assert.assertTrue(this.types.containsType("test"));
		Assert.assertTrue(this.types.containsType("mytype"));
		final String actual = this.types.debug();
		Assert.assertEquals("elem('0')='test' elem('1')='mytype'", actual);
		this.types.removeType("mytype");
		this.types.removeType("test");
		Assert.assertFalse(this.types.containsType("mytype"));
		Assert.assertFalse(this.types.containsType("test"));
		final String actual2 = this.types.debug();
		Assert.assertEquals("", actual2);
	}
	
	@Test
	public void testTypesClone() {
		this.types.addType("test");
		this.types.addType("mytype");
		this.types2 = (ScopeTypes) this.types.clone();
		this.types.addType("abc");
		this.types2.addType("def");
		// types
		Assert.assertTrue(this.types.containsType("test"));
		Assert.assertTrue(this.types.containsType("mytype"));
		Assert.assertTrue(this.types.containsType("abc"));
		Assert.assertFalse(this.types.containsType("def"));
		// types2
		Assert.assertTrue(this.types2.containsType("test"));
		Assert.assertTrue(this.types2.containsType("mytype"));
		Assert.assertFalse(this.types2.containsType("abc"));
		Assert.assertTrue(this.types2.containsType("def"));
	}

	@Test
	public void testSymbols1() {
		final String actual0 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\nScope='ScopeTest', i='0', ''\n", actual0);
		this.symbols.addType(0);
		final String actual1 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\nScope='ScopeTest', i='0', ''\n", actual1);
		this.symbols.setTemp("abc");
		this.symbols.setTypeDefValue(true);
		this.symbols.addType(0);
		final String actual2 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\nScope='ScopeTest', i='0', 'elem('0')='abc''\n",
				actual2);
		this.symbols.setTemp("def");
		this.symbols.setTypeDefValue(true);
		this.symbols.addType(3);
		final String actual3 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', ''\n"
				+ "Scope='ScopeTest', i='3', 'elem('0')='def''\n", actual3);
		this.symbols.setTypeDefValue(false);
		this.symbols.addType(5);
		final String actual4 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', ''\n"
				+ "Scope='ScopeTest', i='3', 'elem('0')='def''\n"
				+ "Scope='ScopeTest', i='4', ''\n"
				+ "Scope='ScopeTest', i='5', ''\n", actual4);
		this.symbols.setTypeDefValue(true);
		this.symbols.setTemp("ghi");
		this.symbols.addType(2);
		final String actual5 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', 'elem('0')='ghi''\n", actual5);
		this.symbols.setTemp("jkl");
		this.symbols.setTypeDefValue(true);
		this.symbols.addType(2);
		final String actual6 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\n"
						+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
						+ "Scope='ScopeTest', i='1', ''\n"
						+ "Scope='ScopeTest', i='2', 'elem('0')='jkl' elem('1')='ghi''\n",
						actual6);
		this.symbols.setTemp("mno");
		this.symbols.setTypeDefValue(true);
		this.symbols.addType(3);
		final String actual7 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\n"
						+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
						+ "Scope='ScopeTest', i='1', ''\n"
						+ "Scope='ScopeTest', i='2', 'elem('0')='jkl' elem('1')='ghi''\n"
						+ "Scope='ScopeTest', i='3', 'elem('0')='mno''\n",
						actual7);
		Assert.assertTrue(this.symbols.containsType(2, "jkl"));
		Assert.assertTrue(this.symbols.containsType(2, "ghi"));
		final String actual8 = this.symbols.debug();
		Assert.assertEquals(
				"Scope='ScopeTest'\n"
						+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n"
						+ "Scope='ScopeTest', i='1', ''\n"
						+ "Scope='ScopeTest', i='2', 'elem('0')='jkl' elem('1')='ghi''\n",
						actual8);
		Assert.assertTrue(this.symbols.containsType(0, "abc"));
		final String actual9 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='abc''\n", actual9);
	}

	@Test
	public void testSymbols2() {
		Assert.assertFalse(this.symbols.containsType(2, "jkl"));
	}
	
	@Test
	public void testSymbols3() {
		this.symbols.setTypeDefValue(true);
		this.symbols.setTemp("test");
		this.symbols.addType(2);
		final String actual1 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', 'elem('0')='test''\n", actual1);
		Assert.assertTrue(this.symbols.containsType(4, "test"));
		Assert.assertFalse(this.symbols.containsType(1, "test"));
		final String actual2 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n", actual2);
	}
	
	@Test
	public void testSymbolsClone() {
		this.symbols.setTypeDefValue(true);
		this.symbols.setTemp("test");
		this.symbols.addType(2);
		final String actual1 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', 'elem('0')='test''\n", actual1);
		this.symbols2 = (ScopeSymbols) this.symbols.clone();
		final String actual1b = this.symbols2.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', 'elem('0')='test''\n", actual1b);
		Assert.assertTrue(this.symbols.containsType(4, "test"));
		Assert.assertFalse(this.symbols.containsType(1, "test"));
		final String actual2 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n", actual2);
		// symbols2
		final String actual3 = this.symbols2.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n"
				+ "Scope='ScopeTest', i='2', 'elem('0')='test''\n", actual3);
		Assert.assertFalse(this.symbols2.containsType(0, "test"));
		final String actual4 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n"
				+ "Scope='ScopeTest', i='1', ''\n", actual4);
		final String actual5 = this.symbols2.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', ''\n", actual5);
		this.symbols2.setTemp("def");
		this.symbols2.setTypeDefValue(true);
		this.symbols2.addType(0);
		this.symbols.setTypeDefValue(true);
		this.symbols.setTemp("test2");
		this.symbols.addType(0);
		final String actual6 = this.symbols.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='test2''\n", actual6);
		final String actual7 = this.symbols2.debug();
		Assert.assertEquals("Scope='ScopeTest'\n"
				+ "Scope='ScopeTest', i='0', 'elem('0')='def''\n", actual7);
	}
}
