package Level2And3Day3.최댓값과최솟값lv2;

import java.util.Arrays;
import java.util.Comparator;

public class Dy {

	public static void main(String[] args) {

		String s1 = "1 2 3 4", s2 = "-1 -2 -3 -4 1 2 3 4", s3 = "-1 -1";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));

	}

//	public static String solution(String s) {
//		String answer = "";
//		String[] temp = s.split(" ");
//		int min = Integer.parseInt(temp[0]);
//		int max = Integer.parseInt(temp[0]);
//		
//		for(String key: temp) {
//			int value = Integer.parseInt(key);
//			if(value > max) {
//				max = value;
//			}else if(value < min) {
//				min = value;
//			}
//		}
//		answer = min+" "+max;
//
//		return answer;
//	}
	
//	public static String solution(String s) {
//		String answer = "";
//		String min = s.substring(0);
//		String max = s.substring(0);
//		for(int i=0; i<s.length()/2 + 1; i++) {
//			String temp = s.substring(i*2, i*2+1);
//			if()
//		}
//
//		return answer;
//	}
	
	public static String solution(String s) {
		String answer = "";
		String[] temp = s.split(" ");
		Arrays.sort(temp, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return Integer.parseInt(o1) - Integer.parseInt(o2);
			}
		});
		answer = temp[0]+" "+temp[temp.length-1];
		return answer;
	}

}
