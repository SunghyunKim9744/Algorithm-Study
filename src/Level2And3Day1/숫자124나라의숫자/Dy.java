package Level2And3Day1.숫자124나라의숫자;

// 5:44 ~ 6:18
public class Dy {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	// 테스트 1 〉	통과 (0.04ms, 52.4MB) 테스트 6 〉	통과 (0.05ms, 52.7MB)
	private static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			int key = n % 3;
			n--;
			n = n / 3;
			
			switch(key) {
			case 0:
				sb.insert(0, "4");
				continue;
			case 1:
				sb.insert(0, "1");
				continue;
			case 2:
				sb.insert(0, "2");
				continue;
			}
		}
		answer = sb.toString();
		return answer;
		
	}

}
