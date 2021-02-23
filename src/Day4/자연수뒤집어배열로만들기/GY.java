package Day4.자연수뒤집어배열로만들기;

public class GY {

	public static void main(String[] args) {
		solution(12345);
	}

	public static int[] solution(long n) {
		int[] answer = {};

		String[] num = Long.toString(n).split("");
		answer = new int[num.length];
		for (int i = 0; i < num.length; i++)
			answer[i] = Integer.parseInt(num[num.length - i-1]);
		
		return answer;
	}

}
