package Day06.신규아이디추천;

public class GY {
	public static void main(String[] args) {
		String new_id1 = "...!@BaT#*..y.abcdefghijklm";
		String new_id2 = "z-+.^.";
		String new_id3 = "=.=";
		String new_id4 = "123_.def";
		String new_id5 = "abcdefghijklmn.p";
//		System.out.println(solution(new_id1).equals("bat.y.abcdefghi"));
//		System.out.println(solution(new_id2).equals("z--"));
//		System.out.println(solution(new_id3).equals("aaa"));
		System.out.println(solution(new_id4).equals("123_.def"));
//		System.out.println(solution(new_id5).equals("abcdefghijklmn"));
	}

	public static String solution(String new_id) {
		String answer = "";

		// 1단계
		new_id = new_id.toLowerCase();
		System.out.println("1단계 : " + new_id);
		
		// 2단계
		char[] id2 = new_id.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : id2)
			if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '-' || c == '_' || c == '.')
				sb.append(c);
		new_id = sb.toString();
		System.out.println("2단계 : " + new_id);
		
		// 3단계
		sb.delete(0, sb.length());
		char[] id3 = new_id.toCharArray();
		sb.append(id3[0]);
		for (int i = 1; i < id3.length; i++) {
			if (id3[i - 1] == '.' && id3[i] == '.')
				continue;
			sb.append(id3[i]);
		}
		new_id = sb.toString();
		System.out.println("3단계 : " + new_id);
		
		// 4단계
		if (new_id.charAt(0) == '.')
			new_id = new_id.substring(1, new_id.length());
		if (new_id.length() != 0 && new_id.charAt(new_id.length() - 1) == '.')
			new_id = new_id.substring(0, new_id.length() - 1);
		System.out.println("4단계 : " + new_id);
		
		// 5단계
		if (new_id.length() == 0)
			new_id = "a";
		System.out.println("5단계 : " + new_id);
		
		// 6단계
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if (new_id.charAt(14) == '.')
				new_id = new_id.substring(0, 14);
		}
		System.out.println("6단계 : " + new_id);
		
		// 7단계
		if (new_id.length() <= 2)
			while (new_id.length() <= 2) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		System.out.println("7단계 : " + new_id);
		answer = new_id;

		return answer;
	}
}
