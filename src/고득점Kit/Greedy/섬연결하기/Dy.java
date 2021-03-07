package 고득점Kit.Greedy.섬연결하기;

// 3:07 ~
public class Dy {

	public static void main(String[] args) {

		int n = 4;
		int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };

		System.out.println(solution(n, costs));
	}

	private static int solution(int n, int[][] costs) {
		int answer = 0;
		
		for(int i=0; i<costs.length-1; i++) {
			for(int j=0; j<costs[0].length-1-i; j++) {
				if(costs[j][3] > costs[j+1][3]) {
					int temp = costs[j][3];
					costs[j][3] = costs[j+1][3];
					costs[j+1][3] = temp;
				}
			}
		}
		
		for(int i=0; i<costs.length-1; i++) {
			for(int j=0; j<costs[0].length-1-i; j++) {
				if(costs[j][3] > costs[j+1][3]) {
					int temp = costs[j][3];
					costs[j][3] = costs[j+1][3];
					costs[j+1][3] = temp;
				}
			}
		}

		return answer;
	}

}
