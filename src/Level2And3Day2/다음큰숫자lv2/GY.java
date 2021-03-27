package Level2And3Day2.다음큰숫자lv2;

public class GY {

	public static void main(String[] args) {
		int n1 = 78;
		int n2 = 15;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	// 정확성 0.02ms ~ 0.05ms
	// 효율성 0.03ms ~ 0.06ms
	private static int solution(int n) {

		int answer = n + 1;

		String nToBin = Integer.toBinaryString(n);
		int nCnt = 0;
		for (int i = 0; i < nToBin.length(); i++)
			if (nToBin.charAt(i) == '1')
				nCnt++;

		while (true) {
			String n2ToBin = Integer.toBinaryString(answer);
			int n2Cnt = 0;
			for (int i = 0; i < n2ToBin.length(); i++)
				if (n2ToBin.charAt(i) == '1')
					n2Cnt++;

			if (nCnt == n2Cnt)
				break;
			else
				answer++;
		}

		return answer;

	}

}