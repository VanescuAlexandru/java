package maxvalue;

import java.util.regex.*;

public class MaxValueInString {

	public int maxValueInString(String s) {
		int max = 0;
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			if (Integer.parseInt(m.group()) > max)
				max = Integer.parseInt(m.group());
		}

		return max;

	}

	public static void main(String[] args) {
		MaxValueInString max = new 	MaxValueInString();
		System.out.println(max.maxValueInString(""));
		
	}

}
