package phoneFinder;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PhoneFinder {

	public ArrayList<String> phoneFinder(String path) throws FileNotFoundException {
		String edited;
		ArrayList<String> files = new ArrayList<String>();
		File dir = new File(path);
		Pattern p = Pattern.compile(("(\\d{3})\\)?\\.*-*\\s*\\d{3}\\.*-*\\s*\\d{4}"));
		for (File file : dir.listFiles()) {
			Scanner s = new Scanner(file);
			while (s.hasNextLine()) {
				Matcher m = p.matcher(s.nextLine());
				if (m.find()) {
					files.add(file.getName());
					edited = m.group();
					edited = edited.replaceAll("\\W+","");
					edited = edited.substring(0, 6) + "." + edited.substring(6, edited.length());
					files.add(edited);
				}
			}
			s.close();
		}
		return files;

	}

	public static void main(String[] args) throws FileNotFoundException {

		PhoneFinder pf = new PhoneFinder();
		System.out.println(pf.phoneFinder("website/"));

	}

}
