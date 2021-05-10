package KaKaO2020신입.문자열압축;

import java.util.HashSet;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {
		
		String s = "abcabcdedded";
		System.out.println(solution(s));

	}
	
	public static int solution(String s) {
        int answer = 0;
        String[] words = s.split("");
        int min = s.length();
        String before = "";
        for(int i=1; i<s.length(); i++) {
        	int count = 0;
        	int length = 0;
        	for(int j=0; j<words.length/i; j++) {
        		StringBuilder sb = new StringBuilder();
        		for(int k=i*j; k<i*(j+1); k++) {
        			sb.append(words[k]);
                }
        		if(before.equals(sb.toString())) {
        			count++;
        			if(j == words.length/i -1) {
        				if(count >= 999){
                			length += (count * i) - 4;
                			count = 0;
                		}else if(count >= 99){
                			length += (count * i) - 3;
                			count = 0;
                		}else if(count >= 9){
                			length += (count * i) - 2;
                			count = 0;
                		}else if(count >= 0){
                			length += (count * i) - 1;
                			count = 0;
                		}
        			}
        		}else if(count >= 1000){
        			length += (count * i) - 4;
        			count = 0;
        		}else if(count >= 100){
        			length += (count * i) - 3;
        			count = 0;
        		}else if(count >= 10){
        			length += (count * i) - 2;
        			count = 0;
        		}else if(count >= 1){
        			length += (count * i) - 1;
        			count = 0;
        		}
        		before = sb.toString();
            }
        	if(min > s.length() - length) {
        		min = s.length() - length;
        	}
        }
        answer = min;
        System.out.println(min);
        return answer;
    }

}
