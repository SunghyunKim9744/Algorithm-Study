package Day3.시저암호;

public class Sh {
	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		String answer = solution(s,n);
	}
	
	public static String solution(String s, int n) {
        String answer = "";
        
        // 반복 횟수
        int repeat = 'Z'-'A'+1;
        char[] str = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
        	// 대문자 처리
        	if('A'<= str[i] && str[i] <= 'Z')
        		str[i] = (char) ('A' + (str[i]+n-'A')%repeat);
        	
        	// 소문자 처리
        	else if('a'<= str[i] && str[i] <= 'z')
        		str[i] = (char) ('a' + (str[i]+n-'a')%repeat);
        }
        
        answer = String.valueOf(str);
        return answer;
    }
}
