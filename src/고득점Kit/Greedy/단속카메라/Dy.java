 package 고득점Kit.Greedy.단속카메라;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {
		int[][] routes = {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		
		System.out.println(solution(routes));

	}

	private static int solution(int[][] routes) {
		int answer = 0;
		Arrays.sort(routes[1]);
		for(int[] key: routes) {
		}
			
		return answer;
	}

}
