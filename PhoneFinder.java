package phoneFinder;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PhoneFinder {

	public static void main(String[] args) throws FileNotFoundException {
		File dir = new File("/home/alexandruv/Desktop/webiste/");
		//Pattern p = Pattern.compile(("\\+?1?\\s*\\(?-*\\.*(\\d{3})\\)?\\.*-*\\s*(\\d{3})\\.*-*\\s*(\\d{4})"));
		Pattern p = Pattern.compile(("(\\d{3})\\)?\\.*-*\\s*\\d{3}\\.*-*\\s*\\d{4}"));
		for (File file : dir.listFiles()) {
			Scanner s = new Scanner(file);
			while (s.hasNextLine()) {
				Matcher m = p.matcher(s.nextLine());
				if (m.find())
					System.out.println(file);
			}

			s.close();
		}

	}

}
