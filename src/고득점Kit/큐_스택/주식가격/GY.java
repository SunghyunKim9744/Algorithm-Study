package 고득점Kit.큐_스택.주식가격;

public class GY {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		System.out.println(solution(prices));
	}

	// 9:12~9:19
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++)
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] <= prices[j])
					continue;
				else
					break;
			}

		return answer;
	}

}