package Day2.가운데글자가져오기;

public class Sh {

	public static void main(String[] args) {
		
		String s = "abcde";
		String answer = solution(s);
		

	}
	
	public static String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        // 길이가 짝수, 홀수일 경우
        answer = len%2 == 0 ? s.substring(len/2-1,len/2+1) : s.substring(len/2,len/2+1);
        return answer;
    }

}
