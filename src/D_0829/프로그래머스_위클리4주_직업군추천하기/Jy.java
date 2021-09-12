package D_0829.프로그래머스_위클리4주_직업군추천하기;

/*
 * 
 * 		https://programmers.co.kr/learn/courses/30/lessons/84325
 * 
 */
public class Jy {
	
	static class Solution {
	    static final int SIZE = 5;
	    public String solution(String[] table, String[] languages, int[] preference) {
	        String answer = "";
	        
	        String[][] splitTable = new String[SIZE][SIZE];
	        int maxScore = 0;
	        int n = languages.length;
	        for(int i = 0; i < SIZE; i++) {
	            splitTable[i] = table[i].split(" ");
	            int score = 0;
	            for(int k = 0; k < n; k++){
	                for(int j = 1; j <= SIZE; j++) {
	                    if(languages[k].equals(splitTable[i][j])) {
	                        score += preference[k] * (6 - j);
	                        break;
	                    }
	                }
	            }
	            if(score > maxScore || (score == maxScore && splitTable[i][0].compareTo(answer) < 0)) {
	                maxScore = score;
	                answer = splitTable[i][0];
	            }
	            
	        }
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
		System.out.println(s.solution(table, languages, preference));

	}

}
