package Level2And3Day1.가장긴팰린드롬lv3;

public class Dy {

	public static void main(String[] args) {
		
		String s = "abacde";
		System.out.println(solution(s));

	}
	// 효율성 테스트 2 〉	통과 (18.52ms, 61.5MB) 테스트 1 〉	통과 (72.52ms, 52.4MB)
	private static int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder(s);
		String reverse = sb.reverse().toString();
		int min = 0;
		int max = 1;
		while(max != s.length()+1) {
			if(reverse.contains(s.substring(min, max))){
				if(max - min > answer && reverse.substring(s.length()-max,s.length()-min).equals(s.substring(min, max)))
					answer = max - min;
				max++;
			}else {
				min++;
				if(min == max)
					max++;
			}
		}
		return answer;
	}

}
