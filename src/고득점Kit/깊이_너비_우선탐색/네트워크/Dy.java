package 고득점Kit.깊이_너비_우선탐색.네트워크;

//1:45 ~ 2:08
public class Dy {
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		System.out.println(solution(n, computers));
	}

	public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        answer = dfs(n, computers, visited, 0, 0);
        return answer;
    }
	// 테스트 7 〉	통과 (0.02ms, 52.2MB) 테스트 11 〉	통과 (0.35ms, 53MB)
	public static int dfs(int n, int[][] computers, boolean[] visited, int before, int deps) {
		int value = 0;
		for(int i=0; i<n; i++) {
			if(deps == 0) {
				before = i;
			}
			if(computers[before][i] == 1 && visited[i] == false) {
				visited[i] = true;
				int deep = deps +1;
				dfs(n, computers, visited, i, deep);
				if(deps == 0) {
					value++;
				}
			}
		}
		return value;
	}
}
