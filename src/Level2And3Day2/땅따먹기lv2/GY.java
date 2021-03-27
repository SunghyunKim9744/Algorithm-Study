package Level2And3Day2.땅따먹기lv2;

public class GY {

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		solution(land);

	}

	private static int solution(int[][] land) {

		int answer = 0;

		int index = 0;
		
		for (int i = 0; i < land[0].length; i++) {
			
			index = i;
			int sum = 0;
			
			for (int j = 0; j < land.length; j++) {

			}
			
			if (answer < sum)
				answer = sum;
		
		}

		return answer;

	}

}
