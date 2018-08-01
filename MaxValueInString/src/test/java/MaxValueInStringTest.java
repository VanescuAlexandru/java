package maxvalue;

import org.junit.*;

public class MaxValueInStringTest {

	private MaxValueInString maxValueInString;

	public MaxValueInStringTest() {
		maxValueInString = new MaxValueInString();
	}
	
	@Test
	public void maxValueInString() {
		
		Assert.assertEquals(15, maxValueInString.maxValueInString("a15b"));
		Assert.assertEquals(31, maxValueInString.maxValueInString("a15b31dsa"));
		Assert.assertEquals(0, maxValueInString.maxValueInString(""));
		Assert.assertEquals(0, maxValueInString.maxValueInString("sadasd"));
		Assert.assertEquals(321, maxValueInString.maxValueInString("321a315b32a1"));
		
		
	}

}
