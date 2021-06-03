package Level2Day05.JadenCase문자열만들기;

public class Sh {

	public static void main(String[] args) {
		String s = "  3people unFollowed me";

		String answer = solution(s);

	}

	private static String solution(String s) {
		String answer = "";
        s = s.toLowerCase();
        
        StringBuilder sb = new StringBuilder(s);
        
        boolean big = true;
        
        for(int i=0; i<sb.length(); i++) {
        	if(big) {
        		if('a' <= sb.charAt(i) && sb.charAt(i) <='z')
        			sb.setCharAt(i, (char)(sb.charAt(i)-('a'-'A')));
        		big = false;
        	}
        	
        	if(sb.charAt(i) == ' ')
        		big = true;
        	
        }
      
        answer = sb.toString();
        System.out.println(answer);
        return answer;
	}

}
