package 고득점Kit.깊이_너비_우선탐색.타겟넘버;

// 11:06 ~ 11:57
public class Dy {
	public static void main(String[] args) {
		int[] numbers = {1,1,1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0);
        return answer;
    }
	
	// 테스트 7 〉	통과 (0.20ms, 52.6MB)  테스트 2 〉	통과 (6.23ms, 52.2MB)
	public static int dfs(int[] numbers, int target, int deps) {
		int num = 0;
		if(deps == numbers.length) {
			if(target == 0) {
				return 1;
			}else {
				return 0;
			}
		}
		int i = deps+1;
		num += dfs(numbers, target-numbers[deps], i);
		num += dfs(numbers, target+numbers[deps], i);
		
		return num;
	}
}
