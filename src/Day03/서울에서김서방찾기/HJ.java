package Day03.서울에서김서방찾기;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim", "Hyun", "Jeon" };
		System.out.println(solution(seoul));
	}

	// 방법 1
	public static String solution(String[] seoul) {
		String answer = "";
		
		for (int i = 0; i < seoul.length; i++)
			if (seoul[i].equals("Kim"))
				return "김서방은 " + i + "에 있다";
		
		return answer;
	}

//	// 방법 2
//	public static String solution(String[] seoul) {
//		int index = Arrays.asList(seoul).indexOf("Kim");
//		return "김서방은 " + index + "에 있다";
//	}
}
