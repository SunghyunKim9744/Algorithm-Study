package 고득점Kit.해시.전화번호목록;

public class HJ {
	public static void main(String[] args) {
		String[] phone_book = { "12", "1112", "111113", "567", "88", "88123" };
		System.out.println(solution(phone_book));
	}

	// (0.02ms, 52MB) - (2.51ms, 56.4MB)
	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		for (int i = 0, len = phone_book.length; i < len; i++)
			for (int j = 0; j < len; j++) {
				if (i == j)
					continue;

				String prefix = (phone_book[i].length() <= phone_book[j].length())
						? phone_book[j].substring(0, phone_book[i].length())
						: phone_book[i].substring(0, phone_book[j].length());

				if (phone_book[i].equals(prefix))
					return false;
			}

		return answer;
	}
}
