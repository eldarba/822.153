package app.core;

import java.util.StringTokenizer;

public class DemoTkenizer {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("aaa bbb ccc");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}
