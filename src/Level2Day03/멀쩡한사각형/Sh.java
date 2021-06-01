package Level2Day03.멀쩡한사각형;

public class Sh {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;

		long answer = solution(w, h);
	}

	private static long solution(int w, int h) {
		long answer = 1;

		long total = 0;

		double dw = (double) w;
		double dh = (double) h;

		for (long x = 1; x < w; x++) {
			double temp = (-dh / dw) * x + h;
			total += (long) Math.floor(temp);
		}

		answer = total * 2;
		return answer;
	}

}
