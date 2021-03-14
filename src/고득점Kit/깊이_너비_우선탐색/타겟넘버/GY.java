package 고득점Kit.깊이_너비_우선탐색.타겟넘버;

public class GY {
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1,  };
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	// 0.24ms ~ 13.87ms
	public static int solution(int[] numbers, int target) {
		int answer = 0;

		int depth = 0;
		answer = dfs(numbers, target, depth);

		return answer;
	}

	private static int dfs(int[] numbers, int target, int depth) {
		int result = 0;

		if (depth == numbers.length)
			if (result == target)
				return 1;
			else
				return 0;

		result += dfs(numbers, target - numbers[depth], depth + 1);
		result += dfs(numbers, target + numbers[depth], depth + 1);

		return result;
	}

}
