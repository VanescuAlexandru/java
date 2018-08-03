package phoneFinder;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PhoneFinder {

	public ArrayList<String> phoneNumberMatcher(String string) {// get a string as parameter and return the an array
																// list oh phone numbers from string
		ArrayList<String> phoneNumbers = new ArrayList<String>();
		Pattern p = Pattern.compile(("(\\d{3})\\)?\\.*-*\\s*\\d{3}\\.*-*\\s*\\d{4}"));// regex pattern for us phone
																						// number format
		Matcher m = p.matcher(string);// use 'matcher' and 'find' functions to match a substring, not the whole string
		if (m.find()) {// if there is a phone number, it will be formated in xxxxxx.xxxx
			String formatPhoneNumber;
			formatPhoneNumber = m.group();// get the matched substring
			formatPhoneNumber = formatPhoneNumber.replaceAll("\\W+", "");// remove everything except numbers
			formatPhoneNumber = formatPhoneNumber.substring(0, 6) + "."
					+ formatPhoneNumber.substring(6, formatPhoneNumber.length());// format a subtring of 10 digits
			phoneNumbers.add(formatPhoneNumber);// add the phone number in array list
		}

		return phoneNumbers;
	}

	public ArrayList<String> phoneFinder(String path) throws FileNotFoundException {// return an array list of html
																					// files that contains us fomat
																					// phone numbers, and the phone
																					// numbers
		ArrayList<String> files = new ArrayList<String>();// array list of files from a folder
		File dir = new File(path);// get the path to the folder
		String line;// used to iterate lines of text

		for (File file : dir.listFiles()) {// iterate files from a folder
			int printMaster = 0;// format the output "site, [phone],[phone], site, [phone]
			Scanner s = new Scanner(file);// open text files
			while (s.hasNextLine()) {// while text files is not empty
				line = s.nextLine();// read every line

				if (!phoneNumberMatcher(line).isEmpty())// if we matched a phone number in text file, we save the file's
														// name and phone number

				{

					if (printMaster != 1) {// format output
						files.add(file.getName());
						printMaster = 1;
					}
					files.add(phoneNumberMatcher(line).toString());

				}
			}
			s.close();//close the text file
		}
		return files;

	}

	public static void main(String[] args) throws FileNotFoundException {

		PhoneFinder pf = new PhoneFinder();
		System.out.println(pf.phoneFinder("website/"));


	}

}
