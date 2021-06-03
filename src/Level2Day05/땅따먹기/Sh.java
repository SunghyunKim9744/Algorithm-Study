package Level2Day05.땅따먹기;

public class Sh {

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

		int answer = solution(land);
	}

	private static int solution(int[][] land) {
		int answer = 0;
		
		for(int i=1; i<land.length; i++) {
			
			int[] rows = new int[4];
			for(int j=0; j<4; j++)
				rows[j] = land[i][j];
			
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					if(j==k)
						continue;
					int total = land[i-1][k]+rows[j];
					if(land[i][j] < total)
						land[i][j] = total;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			int last = land.length-1;
			
			if(answer < land[last][i])
				answer = land[last][i];
		}
		return answer;
	}

}
