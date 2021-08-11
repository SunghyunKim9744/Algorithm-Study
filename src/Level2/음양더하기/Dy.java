package Level2.음양더하기;

public class Dy {

	public static void main(String[] args) {
		
		int[] a = {4, 7, 12};
		boolean[] s = {true, false, true};
		
		System.out.println(solution(a, s));

	}

	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i]) {
        		answer += absolutes[i];
        	}else {
        		answer -= absolutes[i];
        	}
        	
        }
        
        return answer;
    }
}
