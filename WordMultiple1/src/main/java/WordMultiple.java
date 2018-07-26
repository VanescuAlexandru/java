package wordMultiple;

import java.util.*;

public class WordMultiple {

	public Map<String, Boolean> wordMultiple(String[] strings) {

		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String string : strings) {
			if (map.containsKey(string)) {
				map.put(string, true);
			} else {
				map.put(string, false);
			}
		}
		return map;
	}

	public static void main(String[] args) {

		WordMultiple wm = new WordMultiple();
		String[] strArray = new String[] { "", "", "", "", "" };
		System.out.println(wm.wordMultiple(strArray));

	}

}
