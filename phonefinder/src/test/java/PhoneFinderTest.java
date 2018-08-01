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
		
		Assert.assertEquals("[blog.html, idex7.html]", phoneFinder.phoneFinder("website/").toString());
		
	}

}
