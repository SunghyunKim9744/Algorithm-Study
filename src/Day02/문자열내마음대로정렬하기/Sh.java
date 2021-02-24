package Day02.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Sh {
	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		String[] answer = solution(strings,n);
		
		
		
	}

//	public static String[] solution(String[] strings, int n) {
//		String[] answer = {};
//
//		// 선택정렬로 정렬하기.
//		for (int i = 0; i < strings.length - 1; i++) {
//			for (int j = i + 1; j < strings.length; j++) {
//				// 인덱스 값의 사전순으로 정렬(인덱스에 위치한 글자가 다를 경우)
//				if (strings[i].charAt(n) > strings[j].charAt(n)) {
//					String temp = strings[i];
//					strings[i] = strings[j];
//					strings[j] = temp;
//				} 
//				// 인덱스 값의 사전순으로 정렬(인덱스에 위치한 글자가 같을 경우)
//				else if (strings[i].charAt(n) == strings[j].charAt(n)) {
//					int index = 0;
//					// 인덱스를 0부터 해서 다른 글자가 나올때까지 반복
//					while (strings[i].charAt(index) == strings[j].charAt(index))
//						index++;
//					// 정렬
//					if (strings[i].charAt(index) > strings[j].charAt(index)) {
//						String temp = strings[i];
//						strings[i] = strings[j];
//						strings[j] = temp;
//					}
//				}
//			}
//		}
//		return strings;
//	}
	
	// 정렬 기준 설정하는 방법
//	public static String[] solution(String[] strings, int n) {
//		String[] answer = {};
//		Arrays.sort(strings,new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.charAt(n) != o2.charAt(n))
//					return o1.charAt(n)-o2.charAt(n);
//				else {
//					int index = 0;
//                    while(o1.charAt(index) == o2.charAt(index))
//                        index++;
//                    return o1.charAt(index)-o2.charAt(index);
//				}
//			}
//		});
//		return strings;
//	}
	
	// 정렬 기준 설정하는 방법
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		Arrays.sort(strings,(s1,s2)->{
			if(s1.charAt(n) != s2.charAt(n))
				return s1.charAt(n)-s2.charAt(n);
			else
                return s1.compareTo(s2);
			
		});
		return strings;
	}
}
