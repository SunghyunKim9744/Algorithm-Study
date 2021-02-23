package Day4.정수내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sh {
	public static void main(String[] args) {
		long n = 345612;
		System.out.println(solution(n));
	}

//	public static long solution(long n) {
//		long answer = 0;
//		
//		String[] values = String.valueOf(n).split("");
//		
//		List<String> strList = new ArrayList<>(Arrays.asList(values));
//		
//		strList.sort((s1,s2)->{
//			return s2.charAt(0)-s1.charAt(0); // s2.compareTo(s1);
//		});
//		
//		StringBuilder str = new StringBuilder();
//		for(String s : strList)
//			str.append(s);
//		
//		String reverse = str.toString();
//		answer = Long.parseLong(reverse);
//		return answer;
//	}
	
	public static long solution(long n) {
		long answer = 0;
		
		char[] values = String.valueOf(n).toCharArray();
		
		for(int i=0; i<values.length-1; i++) 
			for(int j=i+1; j<values.length; j++) 
				if(values[i]<values[j]) {
					char temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			
		
		
		String reverse = String.valueOf(values);
		answer = Long.parseLong(reverse);
		return answer;
	}

}
