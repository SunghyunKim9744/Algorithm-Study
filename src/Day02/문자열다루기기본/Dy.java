package Day02.문자열다루기기본;

public class Dy {

	public boolean solution(String s) {
        boolean answer = true;
	        
        char[] charArray = s.toCharArray();

        if(s.length() != 4 && s.length() != 6)
            answer = false;

        for(char key: charArray) {
            if(key < 48 || 57 < key) {
                answer = false;
            }
        }

        return answer;
    }
}
