package phoneFinder;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PhoneFinder {

	public ArrayList<String> matcher(String string) {
		String edited;
		ArrayList<String> words = new ArrayList<String>();
		Pattern p = Pattern.compile(("(\\d{3})\\)?\\.*-*\\s*\\d{3}\\.*-*\\s*\\d{4}"));
		Matcher m = p.matcher(string);
		if (m.find()) {
			edited = m.group();
			edited = edited.replaceAll("\\W+", "");
			edited = edited.substring(0, 6) + "." + edited.substring(6, edited.length());
			words.add(edited);
		}

		return words;
	}

	public ArrayList<String> phoneFinder(String path) throws FileNotFoundException {
		ArrayList<String> files = new ArrayList<String>();
		File dir = new File(path);
		String line;
		int printMaster;

		for (File file : dir.listFiles()) {
			printMaster = 0;
			Scanner s = new Scanner(file);
			while (s.hasNextLine()) {
				line = s.nextLine();

				if (matcher(line).toString() != "[]")

				{

					if (printMaster != 1) {
						files.add(file.getName());
						printMaster = 1;
					}
					files.add(matcher(line).toString());

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
