package Day05.핸드폰번호가리기;

public class HJ {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}

//	// 방법 1) (0.03ms, 53MB) - (0.06ms, 52.5MB)
//	public static String solution(String phone_number) {
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < phone_number.length() - 4; i++)
//			sb.append("*");
//		sb.append(phone_number.substring(phone_number.length() - 4));
//		
//		return sb.toString();
//	}
	
	// 방법 2) (0.02ms, 52.3MB) - (0.04ms, 52MB)
	public static String solution(String phone_number) {
		char[] charArr = phone_number.toCharArray();
		for (int i = 0; i < charArr.length - 4; i++)
			charArr[i] = '*';

		return String.valueOf(charArr);
	}
}
