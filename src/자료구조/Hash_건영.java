package 자료구조;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_건영 {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();// HashMap생성
		HashMap<String, String> map2 = new HashMap<>();// new에서 타입 파라미터 생략가능
		HashMap<String, String> map3 = new HashMap<>(map1);// map1의 모든 값을 가진 HashMap생성
		HashMap<String, String> map4 = new HashMap<>(10);// 초기 용량(capacity)지정
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f);// 초기 capacity,load factor지정
		HashMap<String, String> map6 = new HashMap<String, String>() {
			{// 초기값 지정
				put("a", "b");
			}
		};

		HashMap<Integer, String> map = new HashMap<>();// new에서 타입 파라미터 생략가능
		map.put(1, "사과"); // 값 추가
		map.put(2, "바나나");
		map.put(3, "포도");
		System.out.println("값 추가 후 : " + map.toString());

		map.remove(1); // key값 1 제거
		System.out.println("key가 1인 값 제거 후 : " + map.toString());
		map.clear(); // 모든 값 제거
		System.out.println("모든 값 제거 후 : " + map.toString());

		map.put(10, "사과");
		map.put(2, "바나나");
		map.put(4, "포도");
		System.out.println(map); // 전체 출력 : {1=사과, 2=바나나, 3=포도}
		System.out.println(map.get(1));// key값 1의 value얻기 : 사과

		// map을 출력하는 3가지 방법
		// keySet, entrySet은 정렬해서 반환하는거같은데??????
		// 1. KeySet() 활용
		for (Integer i : map.keySet()) { // 저장된 key값 확인
			System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		System.out.println();
		// 2. entrySet() 활용, Entry : Key - Value 값을 결합한 형태로 Set에 저장해 반환
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println();
		// 3. Iterator 활용
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println();// keySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key));
		}

	}

}
