package 자료구조.정렬.comparator정리;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GY_람다식 {

	// Comparator
	// 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
	// o1, o2 두 객체를 비교
	// 양수 : 왼쪽이 크다
	// 0 : 같다
	// 음수 : 오른쪽이 크다
	// compare 구현해야함

	public static void main(String[] args) {

		List<Person5> list = new LinkedList<>();

		list.add(new Person5(170, 56));
		list.add(new Person5(190, 54));
		list.add(new Person5(130, 87));
		list.add(new Person5(120, 47));
		list.add(new Person5(210, 72));
		System.out.println("정렬 전");
		for (Person5 p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list);

		System.out.println();
		System.out.println("정렬 후(기본 정렬 방식) : 키에 대해 오름차순");

		for (Person5 p : list)
			System.out.println(p.height + " " + p.weight);

		// 기본
//		Collections.sort(list, (Person5 o1, Person5 o2) -> {
//			return o2.height - o1.height;
//		});

		// 구현부가 리턴문 하나면 중괄호 및 세미콜론 생략,, 자료형 생략 가능
		Collections.sort(list, (o1, o2) -> o2.height - o1.height);

		System.out.println();
		System.out.println("정렬 후(Comparator로 새로 정의한 방식)");

		for (Person5 p : list)
			System.out.println(p.height + " " + p.weight);

	}

}

class Person5 implements Comparable<Person5> {

	int height;
	int weight;

	public Person5(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person5 o) {
		return this.height - o.height;
	}
}
