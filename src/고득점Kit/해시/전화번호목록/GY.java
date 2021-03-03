package 고득점Kit.해시.전화번호목록;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		int shortLength = 20;

		for (String s : phone_book)
			if (s.length() <= shortLength) {
				shortLength = s.length();
			}

		Map<String, Integer> map = new HashMap<>();
		List<String> list = new LinkedList<>();
		for (String s : phone_book) {
			String key = s.substring(0, shortLength);
			map.put(key, map.getOrDefault(key, 0) + 1);
			if (map.get(key) == 2)
				list.add(key);
		}

		for (String str : list)
			for (String number : phone_book)
				if (str.equals(number))
					return false;

		return answer;
	}
}
