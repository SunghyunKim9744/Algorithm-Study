package 고득점Kit.해시.전화번호목록;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sh {
	
	public static void main(String[] args) {
		
		String[] phone_book1 = { "119", "97674223", "1195524421" };
		String[] phone_book2 = { "123", "456", "789" };
		String[] phone_book3 = { "12", "123", "1235", "567", "88" };
		System.out.println(solution(phone_book1));
		System.out.println(solution(phone_book2));
		System.out.println(solution(phone_book3));
		
	}

	// 1:41 ~ 1:54
	// (0.02ms, 52.6MB) - > (2.13ms, 57.4MB)
	// 효율성 
	// 1.85 - > 2.13
//	public static boolean solution(String[] phone_book) {
//		boolean answer = true;
//		
//		for(int i=0; i<phone_book.length; i++) {
//			String shortStr = phone_book[i];
//			for(int j=0; j<phone_book.length; j++) {
//				String longStr = phone_book[j];
//				if(i != j && shortStr.length() <= longStr.length() && longStr.substring(0,shortStr.length()).equals(shortStr))
//					return false;
//			}
//		}
//		
//		return answer;
//	}
	
	// (0.05ms, 52MB) - > (20.11ms, 59.2MB)
	// 효율성
	// 18.82 - > 20.11
//	public static boolean solution(String[] phone_book) {
//		boolean answer = true;
//		
//		Map<String,Integer> map = new HashMap<>();
//		
//		for(int i=0; i<phone_book.length; i++)
//			map.put(phone_book[i],0);
//		
//		for(Entry<String,Integer> entry : map.entrySet()) {
//			String shortStr = entry.getKey();
//			for(int i=0; i<phone_book.length; i++) {
//				if(!phone_book[i].equals(shortStr) && 
//						shortStr.length() < phone_book[i].length() && 
//						phone_book[i].substring(0,shortStr.length()).equals(shortStr))
//					return false;
//			}
//		}
//		
//		return answer;
//	}
	
	// 만약, 무슨 문자열이 얼마나 반복 되는지를 알아야 한다면
	//  (0.05ms, 52MB) - > (27.85ms, 60.5MB)
	// 효율성
	// 22.11 - > 27.85
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++)
			map.put(phone_book[i],0);
		
		for(Entry<String,Integer> entry : map.entrySet()) {
			String shortStr = entry.getKey();
			for(int i=0; i<phone_book.length; i++) {
				if(!phone_book[i].equals(shortStr) && 
						shortStr.length() < phone_book[i].length() && 
						phone_book[i].substring(0,shortStr.length()).equals(shortStr))
					map.put(shortStr, map.get(shortStr)+1);
				if(entry.getValue()>=1)
					return false;
			}
		}
		
		return answer;
	}
}
