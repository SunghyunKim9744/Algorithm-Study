package Day04.자연수뒤집어배열로만들기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		long n = 10000000000L;
		System.out.println(solution(n));
	}

//	// 방법 1 ) (2.14ms, 53.3MB) - (7.23ms, 52.4MB)
//	public static int[] solution(long n) {
//        List<String> list = Arrays.asList(String.valueOf(n).split(""));
//        Collections.reverse(list);
//        return list.stream().mapToInt(i -> Integer.valueOf(i)).toArray();
//    }

	// 방법 2 ) (0.03ms, 52.3MB) - (0.04ms, 51.9MB)
	public static int[] solution(long n) {
		int[] answer = new int[String.valueOf(n).length()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n % 10);
			n /= 10;
		}

		return answer;
	}
}
