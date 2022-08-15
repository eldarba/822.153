package b.arrays.dimensions;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		int[][] matrix = new int[5][3];

		for (int i = 0; i < matrix.length; i++) {

			// System.out.println("start populating array " + i);
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 101);
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
//			 System.out.println(Arrays.toString(matrix[i]));

		}

	}

}
