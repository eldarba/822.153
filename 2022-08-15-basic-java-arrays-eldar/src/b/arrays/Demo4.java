package b.arrays;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		
		{
			int[] arr = {2, 4, 6}; // array static initialization
			System.out.println(arr.length);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[3];
			// array dynamic initialization
			arr[0] = 2;
			arr[1] = 4;
			arr[2] = 6;
			System.out.println(Arrays.toString(arr));
		}
		
		

	}

}
