package Day2.두정수사이의합;import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class HJ {
	public static void main(String[] args) {
		int a = -5;
		int b = 6;
		System.out.println(solution(a, b));
	}

	public static long solution(int a, int b) {
		long answer = b >= a ? (long)(b - a + 1) * (long)(a + b) / 2L : (long)(a - b + 1) * (long)(a + b) / 2L;
		return answer;
	}
}
