package D_0829.프로그래머스_위클리4주_직업군추천하기;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 * 		https://programmers.co.kr/learn/courses/30/lessons/84325
 * 
 */
public class Ih {

	public static void main(String[] args) {
		String[] table1 = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages1 = { "PYTHON", "C++", "SQL" };
		int[] preference1 = { 7, 5, 5 };

		String[] table2 = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages2 = { "JAVA", "JAVASCRIPT" };
		int[] preference2 = { 7, 5 };

		String ans1 = solution(table1, languages1, preference1);
		String ans2 = solution(table2, languages2, preference2);

		System.out.println(ans1);
		System.out.println(ans2);
	}

	public static String solution(String[] table, String[] languages, int[] preference) {

		StringTokenizer st;
		int[] score = new int[5];
		String[] rst = new String[5];

		// 사전순 출력을 위한 정렬
		Arrays.sort(table);

		// 테이블 언어 길이 5만큼 반복
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(table[i], " ");
			// 각각 언어 우선순위 저장할 배열
			String[] check = new String[6];
			// 각 분야는 rst에 따로 저장
			rst[i] = st.nextToken();
			// 각각 우선순위 언어는 check에 저장
			for (int j = 1; j < 6; j++) {
				check[j] = st.nextToken();
			}
			// 선호도, 분야별 점수 저장 변수
			int pre = 5;
			int pre_val = 0;
			// 완전탐색, 각 언어별로 5점~1점 순회
			for (int j = 1; j < 6; j++) {
				// 선호하는 언어 개수 만큼 순회
				for (int k = 0; k < preference.length; k++) {
					// 분야별 언어와 선호 언어가 겹친다면
					if (check[j].equals(languages[k])) {
						// 점수 저장
						pre_val += pre * preference[k]; // 언어 점수 * 선호도 합
					}
				}
				// 선호도 감소
				pre--;
			}
			// 분야별 점수 따로 저장
			score[i] += pre_val;
		}

		String answer = "";
		// 점수 높은 분야 answer에 담기
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < score[i]) {
				max = score[i];
				answer = rst[i];
			}
		}

		return answer;
	}

}
