package 자료구조.정렬.comparator정리;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GY_람다식2_다중정렬 {

	// Comparator
	// 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
	// o1, o2 두 객체를 비교
	// 양수 : 왼쪽이 크다
	// 0 : 같다
	// 음수 : 오른쪽이 크다
	// compare 구현해야함

	public static void main(String[] args) {

		List<Person6> list = new LinkedList<>();

		list.add(new Person6(170, 56));
		list.add(new Person6(170, 54));
		list.add(new Person6(170, 87));
		list.add(new Person6(120, 47));
		list.add(new Person6(210, 72));
		System.out.println("정렬 전");
		for (Person6 p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list);

		System.out.println();
		System.out.println("정렬 후(기본 정렬 방식) : 키에 대해 오름차순");

		for (Person6 p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list, (o1, o2) -> {
			// 키 내림차순
			if (o1.height < o2.height)
				return 1;
			else if (o1.height == o2.height)
				// 몸무게도 내림차순 (원래는 오름차순임)
				if (o1.weight < o2.weight)
					return -1;
			return -1;
		});

		System.out.println();
		System.out.println("정렬 후(Comparator로 새로 정의한 방식)");

		for (Person6 p : list)
			System.out.println(p.height + " " + p.weight);

	}

}

class Person6 implements Comparable<Person6> {

	int height;
	int weight;

	public Person6(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person6 o) {
		return this.height - o.height;
	}
	
}
