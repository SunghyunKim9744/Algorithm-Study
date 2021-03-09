package 자료구조.정렬.comparable정리;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GY2 {

	public static void main(String[] args) {

		List<Person2> list = new LinkedList<>();

		list.add(new Person2(170, 56));
		list.add(new Person2(170, 54));
		list.add(new Person2(130, 87));
		list.add(new Person2(170, 47));
		list.add(new Person2(210, 72));
		System.out.println("정렬 전");
		for (Person2 p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list);

		System.out.println("정렬 후");

		for (Person2 p : list)
			System.out.println(p.height + " " + p.weight);

	}

}

class Person2 implements Comparable<Person2> {

	int height;
	int weight;

	public Person2(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person2 o) {
		// 2개의 정렬 기준
		// 키를 오름차순으로 정렬 후 키가 같은 경우 몸무게 내림차순으로 정렬

		if (this.height < o.height)
			return -1;
		else if (this.height == o.height)
			if (this.weight < o.weight)
				return 1;

		return 1;
	}

}