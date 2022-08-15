package b.arrays.dimensions;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[4][5];
		matrix[2][3] = 3;
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i])); 
		}

	}

}
