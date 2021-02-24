package Day02.문자열내p와y의개수;

public class HJ {
	public static void main(String[] args) {
		String s = "PyY";
		System.out.println(solution(s));
	}

	static boolean solution(String s) {
		int count = 0;

		char[] charArr = s.toLowerCase().toCharArray();
		for (char c : charArr)
			switch (c) {
			case 'p':
				count++;
				break;
			case 'y':
				count--;
				break;
			}

		return count == 0 ? true : false;
	}
}
