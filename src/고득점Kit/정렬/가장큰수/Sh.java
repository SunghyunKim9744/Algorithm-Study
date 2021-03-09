package 고득점Kit.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Sh {

	public static void main(String[] args) {
		int[] numbers1 = {40,403}, numbers2 = {151,15,1};

		System.out.println(solution(numbers1));
		System.out.println(solution(numbers2));
	}

	// 12:19 ~
//	public static String solution(int[] numbers) {
//		String answer = "";
//
//		String[] strNumbers = new String[numbers.length];
//
//		for (int i = 0; i < strNumbers.length; i++)
//			strNumbers[i] = String.valueOf(numbers[i]);
//
//		Comparator<String> comp = new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				int s1Len = s1.length();
//				int s2Len = s2.length();
//				if (s1Len == s2Len) {
//					for (int i = 0; i < s1Len; i++) {
//						char c1 = s1.charAt(i);
//						char c2 = s2.charAt(i);
//						if (c1 != c2)
//							return c2 - c1;
//					}
//				} else {
//					if (s1Len > s2Len) {
//				
//						for (int i = 0; i < s2Len; i++) {
//							char c1 = s1.charAt(i);
//							char c2 = s2.charAt(i);
//							if(c1 != c2)
//								return c2-c1;
//							if(i== s2Len-1) {
//								int index = 0;
//								int cnt = 1;
//								while(i+cnt < s1Len) {
//									c1 = s1.charAt(i+cnt);
//									c2 = s2.charAt(index%s2.length());
//									if(c1 != c2)
//										return c2-c1;
//									index++;
//								}
//							}
//						
//						}
//						return s1Len-s2Len;
//					} 
//					else {
//						
//						for (int i = 0; i < s1Len; i++) {
//							char c1 = s1.charAt(i);
//							char c2 = s2.charAt(i);
//							if(c1 != c2)
//								return c2-c1;
//							if(i== s1Len-1) {
//								int index = 0;
//								int cnt = 1;
//								while(i+cnt < s1Len) {
//									c1 = s1.charAt(index%s1.length());
//									c2 = s2.charAt(i+cnt);
//									if(c1 != c2)
//										return c2-c1;
//									index++;
//								}
//							}
//						}
//						return s2Len-s1Len;
//					}
//				}
//				return 0;
//			}
//		};
//		
//		Arrays.sort(strNumbers,comp);
//		
//		StringBuilder strb = new StringBuilder();
//		for(String s : strNumbers)
//			strb.append(s);
//		
//		if(strb.charAt(0) == '0')
//			return "0";
//		return strb.toString();
//	}
	
	public static String solution(int[] numbers) {
		
		String answer = "";

		String[] strNumbers = new String[numbers.length];

		for (int i = 0; i < strNumbers.length; i++)
			strNumbers[i] = String.valueOf(numbers[i]);
			
//		Comparator<String> comp = new Comparator<String>() {
//			
//			@Override
//			public int compare(String s1, String s2) {
//				
//				int n1 = Integer.parseInt(s1+s2);
//				int n2 = Integer.parseInt(s2+s1);
//				
//				return n2-n1;
//			}
//		};
		
//		Comparator<String> comp = (s1,s2)->{
//			int n1 = Integer.parseInt(s1+s2);
//			int n2 = Integer.parseInt(s2+s1);
//			return n2-n1;
//		};
		
//		Arrays.sort(strNumbers,comp);
		
		Arrays.sort(strNumbers,(s1,s2)->{
			int n1 = Integer.parseInt(s1+s2);
			int n2 = Integer.parseInt(s2+s1);
			return n2-n1;
		});
		
		StringBuilder strb = new StringBuilder();
		for(String s : strNumbers)
			strb.append(s);
		if(strb.charAt(0) == '0')
			return "0";
		return strb.toString();
	}

}
