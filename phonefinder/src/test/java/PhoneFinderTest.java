package phoneFinder;

import java.io.FileNotFoundException;

import org.junit.*;

public class PhoneFinderTest {

	private PhoneFinder phoneFinder;
	//private PhoneFinder matcher;

	public PhoneFinderTest() {
		phoneFinder = new PhoneFinder();
		//matcher = new PhoneFinder();

	}

	@Test
	public void phoneFinder() throws FileNotFoundException {

		Assert.assertEquals(
				"[blog.html, [123456.7890], [777345.8790], [527236.2290], idex7.html, [000111.2222], index222.html, [000111.2222]]",
				phoneFinder.phoneFinder("website/").toString());
		Assert.assertEquals("[123456.7890]",phoneFinder.phoneNumberMatcher("(123) 456-7890").toString());
		Assert.assertEquals("[777345.8790]", phoneFinder.phoneNumberMatcher("(777) 345-8790").toString());
		Assert.assertEquals("[527236.2290]", phoneFinder.phoneNumberMatcher("(527) 236-2290 ").toString());
		Assert.assertEquals("[000111.2222]", phoneFinder.phoneNumberMatcher("000-111-2222").toString());
	}

}
