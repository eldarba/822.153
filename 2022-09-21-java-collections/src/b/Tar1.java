package b;

import java.util.ArrayList;
import java.util.List;

public class Tar1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 11);
			list.add(r);
		}
		
		System.out.println(list);

	}

}
