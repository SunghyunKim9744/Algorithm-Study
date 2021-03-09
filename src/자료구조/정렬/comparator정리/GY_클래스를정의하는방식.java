package 자료구조.정렬.comparator정리;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GY_클래스를정의하는방식 {

	// Comparator
	// 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
	// o1, o2 두 객체를 비교
	// 양수 : 왼쪽이 크다
	// 0 : 같다
	// 음수 : 오른쪽이 크다
	// compare 구현해야함

	public static void main(String[] args) {
		
		List<Person3> list = new LinkedList<>();

		list.add(new Person3(170, 56));
		list.add(new Person3(190, 54));
		list.add(new Person3(130, 87));
		list.add(new Person3(120, 47));
		list.add(new Person3(210, 72));
		System.out.println("정렬 전");
		for (Person3 p : list)
			System.out.println(p.height + " " + p.weight);

		Collections.sort(list);

		System.out.println();
		System.out.println("정렬 후(기본 정렬 방식) : 키에 대해 오름차순");

		for (Person3 p : list)
			System.out.println(p.height + " " + p.weight);
		
		Collections.sort(list, new MyComparator());
		
		System.out.println();
		System.out.println("정렬 후(Comparator로 새로 정의한 방식)");

		for (Person3 p : list)
			System.out.println(p.height + " " + p.weight);

	}


}
class Person3 implements Comparable<Person3>{
	
	int height;
	int weight;
	
	public Person3(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person3 o) {
		return this.height - o.height;
	}
}

class MyComparator implements Comparator<Person3>{

	@Override
	public int compare(Person3 o1, Person3 o2) {
		//키를 기준으로 내림차순 정렬
		return o2.height - o1.height;
	}
	
}
