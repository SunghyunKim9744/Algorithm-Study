package 고득점Kit.해시.전화번호목록;

import java.util.HashMap;
import java.util.Map;

public class GY {

	public static void main(String[] args) {

		String[] phone_book1 = { "119", "97674223", "1195524421" };
		String[] phone_book2 = { "123", "456", "789" };
		String[] phone_book3 = { "12", "123", "1235", "567", "88" };
		String[] phone_book4 = { "12", "1112", "111113" }; // true 나와야함
		System.out.println(solution(phone_book1));
		System.out.println(solution(phone_book2));
		System.out.println(solution(phone_book3));
		System.out.println(solution(phone_book4));

	}

	// 11번 케이스 통과 못함
	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		int shortLength = 20;

		for (String s : phone_book)
			if (s.length() <= shortLength) {
				shortLength = s.length();
			}

//		int number = 0;
//		for (String s : phone_book) {
//			if (s.length() == shortLength) {
//				number++;
//			}
//		}
//
//		int[] prefix = new int[number];
//		int prefixIndex = 0;
//		for (int i = 0; i < phone_book.length; i++) {
//			if (phone_book[i].length() == shortLength) {
//				prefix[prefixIndex] = i;
//				prefixIndex++;
//			}
//		}

		Map<String, Integer> map = new HashMap<>();
		for (String s : phone_book) {
			String key = s.substring(0, shortLength);
			System.out.println(key);
			map.put(key, map.getOrDefault(key, 0) + 1);
			if (map.get(key) == 2)
				return false;
		}

		return answer;
	}
}
