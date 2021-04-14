package KaKaO2018신입.뉴스클러스링;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {

		String s1 = "aa1+aa2";
		String s2 = "AAAA12";
		
		System.out.println(solution(s1,s2));

	}
//	private static int solution(String str1, String str2) {
//        int answer = 0;
//        int inter = 0;
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        str1 = str1.replaceAll("[^a-z0-9]", "?");
//        System.out.println(str1);
//        String[] s1 = str1.split("");
//        
//        for(int i=0; i<str1.length()-1; i++) {
//        	if(!s1[i].equals("?") && !s1[i+1].equals("?")) {
//	        	StringBuilder sb = new StringBuilder();
//	        	sb.append(s1[i]);
//	        	sb.append(s1[i+1]);
//	        	if(str2.contains(sb.toString())) {
//	        		inter++;
//	        	}
//        	}
//        }
//        int union = (str1.length()-1) + (str1.length()-1) - inter;
//        answer = (int)((inter / (double) union) * 65536);
//        return answer;
//    }
	private static int solution(String str1, String str2) {
        int answer = 0;
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        int inter = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for(int i = 0; i<str1.length()-1; i++) {
        	String temp = str1.substring(i, i+2).replaceAll("[^a-z]", "");
        	if(temp.length() == 2) {
            	s1.add(temp);
        	}
        }
        
        for(int i = 0; i<str2.length()-1; i++) {
        	String temp = str2.substring(i, i+2).replaceAll("[^a-z]", "");
        	if(temp.length() == 2) {
            	s2.add(temp);
            	if(s1.contains(temp)) {
            		inter++;
            		s1.set(s1.indexOf(temp), " ");
            	}
        	}
        }
        if(s1.isEmpty() && s2.isEmpty())
        	return 65536;
        
        int union = s1.size() + s2.size() - inter;
        answer = (int) (inter / (double) union * 65536);
        
        return answer;
    }

}
