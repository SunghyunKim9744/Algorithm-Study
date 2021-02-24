package Day02.문자열내p와y의개수;

public class Gy {

	public static void main(String[] args) {

		String s1 = "pPoooyY", s2 = "Pyy";
		System.out.println(solution(s1));
		System.out.println(solution(s2));

	}

	static boolean solution(String s) {
		boolean answer = true;

		String[] strings = s.split("");

		int countP = 0, countY = 0;
		for (String st : strings)
			if (st.toLowerCase().equals("p"))
				countP++;
			else if (st.toLowerCase().equals("y"))
				countY++;

		if (countP == 0 && countY == 0)
			return true;
		else if (countP == countY)
			answer = true;
		else
			answer = false;

		return answer;
	}

}
