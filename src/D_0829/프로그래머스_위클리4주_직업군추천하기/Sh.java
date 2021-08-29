package D_0829.프로그래머스_위클리4주_직업군추천하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * 		https://programmers.co.kr/learn/courses/30/lessons/84325
 * 
 */
public class Sh {

	static class Total {
		String job;
		int score;

		public Total(String job, int score) {
			this.job = job;
			this.score = score;
		}

	}

	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preference = { 7, 5, 5 };

		String answer = solution(table, languages, preference);

	}

	private static String solution(String[] table, String[] languages, int[] preference) {
		
		Map<String,Map<String,Integer>> tableMap = new HashMap<>();
		
		for(String s : table) {
			String[] temp = s.split(" ");
			String job = temp[0];
			tableMap.put(job, new HashMap<>());
			
			int score = 5;
			for(int i=1; i<=5; i++) {
				String lan = temp[i];
				tableMap.get(job).put(lan, score);
				score--;
			}
		}
		
		Map<String,Integer> scoreMap = new HashMap<>();
		for(int i=0; i<languages.length; i++)
			scoreMap.put(languages[i],preference[i]);
		
		List<Total> answerList = new ArrayList<>();
		
		int max = -1;
		for(Map.Entry<String,Map<String,Integer>> temp : tableMap.entrySet()) {
			int total = 0;
			
			for(String lan : languages) {
				if(temp.getValue().containsKey(lan))
					total += temp.getValue().get(lan) * scoreMap.get(lan);
			}
			
			
				answerList.add(new Total(temp.getKey(),total));
		}
		
		Collections.sort(answerList,(l1,l2)->{
			if(l1.score == l2.score)
				return l1.job.compareTo(l2.job);
			return l2.score-l1.score;
		});
		
		
		return answerList.get(0).job;
	}

}
