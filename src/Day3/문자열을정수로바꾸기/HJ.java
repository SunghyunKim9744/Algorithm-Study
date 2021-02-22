package Day3.문자열을정수로바꾸기;

public class HJ {
	public static void main(String[] args) {
		String n = "+1234";
		System.out.println(solution(n));
	}

//	// 방법 1
//	public static int solution(String s) {
//        return Integer.parseInt(s);
//    }

	// 방법 2
	public static int solution(String s) {
		int answer = 0;
		boolean sign = false;

		// 부호 여부 판단
		if (!s.matches("\\d*")) {
			sign = (s.substring(0, 1).equals("-") ? true : false);
			s = s.substring(1);
		}

		int[] nums = new int[s.length()];

		// 각 자릿수 문자열 -> 숫자형
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '0':
				nums[i] = 0;
				break;
			case '1':
				nums[i] = 1;
				break;
			case '2':
				nums[i] = 2;
				break;
			case '3':
				nums[i] = 3;
				break;
			case '4':
				nums[i] = 4;
				break;
			case '5':
				nums[i] = 5;
				break;
			case '6':
				nums[i] = 6;
				break;
			case '7':
				nums[i] = 7;
				break;
			case '8':
				nums[i] = 8;
				break;
			case '9':
				nums[i] = 9;
				break;
			}
		}

		// 자릿수에 맞는 숫자 생성
		for (int i = 0; i < nums.length; i++)
			answer += (int) (nums[i] * Math.pow(10, nums.length - 1 - i));

		// 부호 판단
		if (sign)
			answer *= -1;

		return answer;
	}

}
