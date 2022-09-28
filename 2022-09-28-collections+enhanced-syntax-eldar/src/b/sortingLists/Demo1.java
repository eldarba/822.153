package b.sortingLists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		{
			List<Integer> list = new ArrayList<>();
			list.add(5);
			list.add(1);
			list.add(3);
			list.add(2);
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}
		System.out.println("===============");
		{
			List<String> list = new ArrayList<>();
			list.add("bbb");
			list.add("bba");
			list.add("zzz");
			list.add("aaa");
			list.add("ddd");
			list.add("zzz");
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}

		System.out.println("===============");
		{
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(2022, 9, 28));
			list.add(LocalDate.of(2023, 9, 28));
			list.add(LocalDate.of(2021, 9, 28));
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}

		System.out.println("===============");
		{
			List<Person> list = new ArrayList<>();
			list.add(new Person(105, "bbb", 25));
			list.add(new Person(107, "aaa", 30));
			list.add(new Person(103, "ccc", 41));
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}

	}

}
