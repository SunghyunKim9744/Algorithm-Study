package 자료구조.정렬.comparable정리;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GY {

	// comparable
	// 기본 정렬기준을 구현하는 데 사용
	// 주어진 객체(o)를 자신과 비교
	// compareTo 오버라이드
	// 현재객체 < o : 음수 리턴 ==> 자리 바뀌지 않음
	// 현재객체 == o : 0리턴
	// 현재객체 > o : 양수 리턴 ==> 자리 바꿈

	// 양수를 리턴하면 자리를 바꾸고 음수를 리턴하면 자리를 바꾸지 않음을 이용하여 내림차순/오름차순을 결정

	public static void main(String[] args) {

		List<Person> list = new LinkedList<>();

		list.add(new Person(170, 56));
		list.add(new Person(190, 54));
		list.add(new Person(130, 87));
		list.add(new Person(120, 47));
		list.add(new Person(210, 72));
		System.out.println("정렬 전");
		for (Person p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list);

		System.out.println();
		System.out.println("정렬 후");

		for (Person p : list)
			System.out.println(p.height + " " + p.weight);

	}

}

class Person implements Comparable<Person> {

	int height;
	int weight;

	public Person(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {
		// 키에 대해 오름차순
//		return (this.height - o.height);

		// Integer.compare 사용 : 오름차순으로 유지될 수 있도록 값을 비교하는 메서드
//		return Integer.compare(this.height, o.height);
		// 내림차순으로 하고싶다면 매개변수의 자리를 바꾸면 된다.
//		return Integer.compare(o.height, this.height);

		// 또 다른 방법
//		if (this.height == o.height)
//			return 0;
//		else if (this.height < o.height)
//			return -1; // 현재객체 < o : 음수리턴 : 자리 바뀌지 않음 ==> 오름차순
//		else
//			return 1; // 현재객체 > o : 양수리턴 : 자리 바뀜 ==> 오름차순

		// 삼항연산자 사용
		return (this.height > o.height) ? 1 : ((this.height == o.height) ? 0 : -1);

	}

}
