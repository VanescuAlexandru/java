package phoneFinder;

import java.io.FileNotFoundException;

import org.junit.*;

public class PhoneFinderTest {

	private PhoneFinder phoneFinder;

	public PhoneFinderTest() {
		phoneFinder = new PhoneFinder();
	}

	@Test
	public void phoneFinder() throws FileNotFoundException {
		
		Assert.assertEquals("[blog.html, 123456.7890, idex7.html, 000111.2222]", phoneFinder.phoneFinder("website/").toString());
		
	}

}
