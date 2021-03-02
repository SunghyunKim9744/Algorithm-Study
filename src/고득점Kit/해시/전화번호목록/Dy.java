package 고득점Kit.해시.전화번호목록;

import java.util.HashMap;
import java.util.Map;

//10:16 ~ 11: 15
public class Dy {
	
//	public boolean solution(String[] phone_book) {
//        boolean answer = true;
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for(int i=0; i<phone_book.length; i++) {
//			map.put(phone_book[i],1);
//			for(int j=0; j<phone_book.length; j++) {
//				if(phone_book[i].length() < phone_book[j].length()) {
//					String num = phone_book[j].substring(0,phone_book[i].length());
//					map.put(num,map.getOrDefault(num, 0)+1);
//					if(map.get(num)>2) {
//						map.put(num,2);
//					}
//				}
//			}
//		}
//		
//		
//		if(map.containsValue(2))
//			answer = false;
//		
//		return answer;
//    }
	
	
	public static void main(String[] args) {
		String[] phone_book = { "11", "1232", "1233" };
		System.out.println(solution(phone_book));
	}
	
	//통과 (24.51ms, 62.8MB) (25.14ms, 63.8MB)
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i],1);
		}
		
		for(int i=0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book[i].length(); j++) {
				if(map.get(phone_book[i].substring(0,j)) != null) {
					answer = false;
				}
			}
		}
		return answer;
	}
}
