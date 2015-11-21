package at.jku.weiner.cpreprocess.mytests;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.junit.Assert;
import org.junit.Test;

import at.jku.weiner.cpreprocess.utils.MyValueConverter;

public class TestMyCodeLine {

	@Test
	public void testToValue() {
		final MyValueConverter c = new MyValueConverter();
		final IValueConverter<String> converter = c.MyCodeLine();
		Assert.assertNotNull(converter);
		Assert.assertEquals("", converter.toValue(" 	", null));
		Assert.assertEquals("abc", converter.toValue(" 	abc	\n", null));
		Assert.assertEquals("abc", converter.toValue("abc", null));
	}

	@Test(expected = ValueConverterException.class)
	public void testToValueNullPointer() {
		final MyValueConverter c = new MyValueConverter();
		final IValueConverter<String> converter = c.MyCodeLine();
		Assert.assertNotNull(converter);
		converter.toValue(null, null);
	}

	@Test(expected = ValueConverterException.class)
	public void testToValueException() {
		final MyValueConverter c = new MyValueConverter();
		final IValueConverter<String> converter = c.MyCodeLine();
		Assert.assertNotNull(converter);
		converter.toValue("", null);
	}

}