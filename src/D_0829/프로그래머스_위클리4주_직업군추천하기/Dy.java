package D_0829.프로그래머스_위클리4주_직업군추천하기;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 		https://programmers.co.kr/learn/courses/30/lessons/84325
 * 
 */
public class Dy {

	public static void main(String[] args) {
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] lang = {"JAVA", "JAVASCRIPT"};
		int[] pre = {7, 5};
		System.out.println(solution(table, lang, pre));

	}
	
	public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        
        int maxNum = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<languages.length; i++) {
        	map.put(languages[i], preference[i]);
        }
        
        for(int i = 0; i<table.length; i++) {
        	int point = 0;
        	String[] temp = table[i].split(" ");
        	for(int j = 1; j<temp.length; j++) {
        		if(map.containsKey(temp[j])) {
        			point += map.get(temp[j]) * (6 - j);
        		}
        	}
        	if(point > maxNum || (point == maxNum && temp[0].compareTo(answer) < 0)) {
        		maxNum = point;
        		answer = temp[0];
        	}
        }
        return answer;
    }

}
