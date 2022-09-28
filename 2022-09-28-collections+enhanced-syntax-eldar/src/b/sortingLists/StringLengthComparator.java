package b.sortingLists;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		int x = Integer.compare(str1.length(), str2.length());
		if (x != 0) {
			return x;
		} else {
			return str1.compareTo(str2);
		}
	} 

}
