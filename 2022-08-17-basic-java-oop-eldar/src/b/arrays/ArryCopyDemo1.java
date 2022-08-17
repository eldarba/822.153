package b.arrays;

import java.util.Arrays;

public class ArryCopyDemo1 {

	public static void main(String[] args) {
		
		{
			int[] arr1 = { 2, 4, 6, 8 };
			int[] arr2 = new int[arr1.length];
			
			System.arraycopy(arr1, 0, arr2, 0, arr1.length);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==============");
		}

		{
			int[] arr1 = { 2, 4, 6, 8 };
			int[] arr2 = new int[arr1.length + 2];
			
			System.arraycopy(arr1, 0, arr2, 0, arr1.length);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==============");
		}

		{
			int[] arr1 = { 2, 4, 6, 8 };
			int[] arr2 = new int[arr1.length + 2];
			
			System.arraycopy(arr1, 0, arr2, 0, 2);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==============");
		}
		{
			int[] arr1 = { 2, 4, 6, 8 };
			int[] arr2 = new int[arr1.length + 2];
			
			System.arraycopy(arr1, 0, arr2, 2, 2);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==============");
		}
		{
			int[] arr1 = { 2, 4, 6, 8 };
			int[] arr2 = new int[arr1.length + 2];
			
			System.arraycopy(arr1, 2, arr2, 2, 2);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==============");
		}


	}

}
