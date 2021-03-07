package 고득점Kit.Greedy.조이스틱;

import java.util.Arrays;

public class GY {

	public static void main(String[] args) {

		String name1 = "BBBAAAB", name2 = "JAN";

		System.out.println(solution(name1));
		System.out.println(solution(name2));

	}

	// 8 : 45 ~ 9 : 39
	// 마지막케이스 통과 못함
	// BBBAAAB => 9가 나와야함
	private static int solution(String name) {
		int answer = 0;

		char[] charName = name.toCharArray();
		char[] criteria = new char[charName.length];
		int[] count = new int[criteria.length];
		for (int i = 0; i < criteria.length; i++)
			criteria[i] = 'A';

		for (int i = 0; i < count.length; i++)
			if (charName[i] <= 'N')
				count[i] = charName[i] - criteria[i];
			else
				count[i] = 'Z' - charName[i] + 1;

		for (int i : count)
			answer += i;
		System.out.println(Arrays.toString(count));

		// 오른쪽 방향으로 갈 때
		int pointer1 = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				pointer1 = i;
		}

		// 왼쪽 방향으로 갈 때
		int pointer2 = 0;
		for (int i = count.length - 1; i > 0; i--) {
			if (count[i] != 0)
				pointer2 = i;
		}

		pointer2 = count.length - pointer2;

		if (pointer1 < pointer2)
			answer += pointer1;
		else
			answer += pointer2;

		return answer;
	}

}
