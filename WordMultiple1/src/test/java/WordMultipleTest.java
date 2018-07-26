package wordMultiple;

import org.junit.*;

public class WordMultipleTest {
	private WordMultiple wordMultiple;

	public WordMultipleTest() {

		wordMultiple = new WordMultiple();

	}

	@Test
	public void wordMultiple() {

		String[] strArray = new String[] { "a", "a", "b", "c", "a" };
		String[] strArray1 = new String[]  { "a", "a", "b", "b", "b" };
		String[] strArray2 = new String[] { "a", "a", "a", "a", "a" };
		String[] strArray3 = new String[] { "aa", "a", "b", "aa" };

		Assert.assertEquals("{a=true, b=false, c=false}", wordMultiple.wordMultiple(strArray).toString());
		Assert.assertEquals("{a=true, b=true}", wordMultiple.wordMultiple(strArray1).toString());
		Assert.assertEquals("{a=true}", wordMultiple.wordMultiple(strArray2).toString());
		Assert.assertEquals("{aa=true, a=false, b=false}", wordMultiple.wordMultiple(strArray3).toString());

	}

}
