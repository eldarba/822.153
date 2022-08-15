package b.arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		// array of 5 String element
		String[] names = new String[5];
		// populate array with names
		names[0] = "Dan";
		names[1] = "Lea";
		names[2] = "Ran";
		names[3] = "Danna";
		names[4] = "Moshe";
		
		// print all element using for loop
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ") " +  names[i]);
		}
		
		// print all elements using Arrays.toString(arr) method
		String str = Arrays.toString(names);
		System.out.println(str);

	}

}
