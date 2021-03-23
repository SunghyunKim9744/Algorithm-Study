package 고득점Kit.깊이_너비_우선탐색.타겟넘버;

public class Sh {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
        int answer = 0;
        int depth = 0;
        
        answer=dfs(numbers,target,depth);
       
        return answer;
    }

	private static int dfs(int[] numbers, int target, int depth) {
		
		int temp = 0;
		if(depth == numbers.length) {
			if(target == 0)
				return 1;
			else
				return 0;
		}
		
		temp+= dfs(numbers,target-numbers[depth],depth+1);
		temp+= dfs(numbers,target+numbers[depth],depth+1);
		
		return temp;
		
	}

}
