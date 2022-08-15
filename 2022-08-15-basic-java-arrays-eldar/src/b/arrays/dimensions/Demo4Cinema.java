package b.arrays.dimensions;

public class Demo4Cinema {

	public static void main(String[] args) {
		
		char[][] cinema = new char[10][15];
		for (int row = 0; row < cinema.length; row++) {
			for (int seat = 0; seat < cinema[row].length; seat++) {
				cinema[row][seat] = 'O';
			}
		}
		
		print(cinema);
		cinema[0][0] = 'X';
		print(cinema);

		cinema[cinema.length-1][cinema[0].length-1] = 'X';
		print(cinema);

	}
	
	static void print(char[][] cinema) {
		System.out.println("===== CINEMA ======");
		for (int row = 0; row < cinema.length; row++) {
			for (int seat = 0; seat < cinema[row].length; seat++) {
				System.out.print(cinema[row][seat] + " ");
			}
			System.out.println();
		}
	}

}
