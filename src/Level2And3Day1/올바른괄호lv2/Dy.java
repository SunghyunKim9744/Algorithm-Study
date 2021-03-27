package Level2And3Day1.올바른괄호lv2;


// 6:28 ~ 6:43
public class Dy {

	public static void main(String[] args) {
		
		String s = "(())()";
		
		System.out.println(solution(s));

	}
	// 테스트 1 〉	통과 (10.54ms, 57.9MB) 테스트 2 〉	통과 (9.51ms, 57.5MB)
	private static boolean solution(String s) {
		boolean answer = true;
		
		int point = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equals("(")) {
				point++;
			}else {
				point--;
			}
			
			if(point<0) 
				return false;
		}
		if(point !=0 )
			return false;
		
		return answer;
		
	}
	
//	private static boolean solution(String s) {
//		boolean answer = true;
//		
//		if(s.startsWith(")"))
//			return false;
//		
//		String left = s.replaceAll("[^(]", "");
//		String right = s.replaceAll("[^)]", "");
//		
//		if(left.length() != right.length())
//			return false;
//		
//		return answer;
//		
//	}

}
