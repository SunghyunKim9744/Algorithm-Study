package 고득점Kit.깊이_너비_우선탐색.네트워크;

public class GY {
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(solution(n, computers));
	}

	// 0.02ms ~ 0.33ms
	public static int solution(int n, int[][] computers) {
		int answer = 0;

		boolean[] checked = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!checked[i]) {
				dfs(computers, i, checked);
				answer++;
			}
		}

		return answer;
	}

	static void dfs(int[][] computers, int i, boolean[] checked) {

		checked[i] = true;

		for (int j = 0; j < computers.length; j++) {
			if (i != j && computers[i][j] == 1 && checked[j] == false) {
				dfs(computers, j, checked);
			}
		}

	}
}
