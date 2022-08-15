package b.arrays.dimensions;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int[][] matrix = new int[5][3];

		matrix[0][0] = (int) (Math.random() * 101);
		matrix[0][1] = (int) (Math.random() * 101);
		matrix[0][2] = (int) (Math.random() * 101);

		matrix[1][0] = (int) (Math.random() * 101);
		matrix[1][1] = (int) (Math.random() * 101);
		matrix[1][2] = (int) (Math.random() * 101);

		matrix[2][0] = (int) (Math.random() * 101);
		matrix[2][1] = (int) (Math.random() * 101);
		matrix[2][2] = (int) (Math.random() * 101);

		matrix[3][0] = (int) (Math.random() * 101);
		matrix[3][1] = (int) (Math.random() * 101);
		matrix[3][2] = (int) (Math.random() * 101);

		matrix[4][0] = (int) (Math.random() * 101);
		matrix[4][1] = (int) (Math.random() * 101);
		matrix[4][2] = (int) (Math.random() * 101);

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
