package Day02.문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		String s = "Zbcdefg";

		String answer = solution(s);

	}

//	public static String solution(String s) {
//        String answer = "";
//        String[] str = s.split("");
//        
//        // 오름차순 정렬
//        Arrays.sort(str);
//        List<String> list = new ArrayList<>(Arrays.asList(str));
//        
//        // 내림차순으로 바꾸기
//        Collections.reverse(list);
//        
//        for(String s1 : list)
//            answer+=s1;
//        return answer;
//    }

//	public static String solution(String s) {
//		String answer = "";
//        String[] str = s.split("");
//        
//        Arrays.sort(str,(s1,s2)->{
//        	return s2.compareTo(s1);
//        });
//        for(String s1 : str)
//            answer+=s1;
//        return answer;
//    }

	public static String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		Arrays.sort(str);
		StringBuilder sb = new StringBuilder();
		for(String str1 : str)
			sb.append(str1);
		answer = sb.reverse().substring(0);
		return answer;
	}

}
