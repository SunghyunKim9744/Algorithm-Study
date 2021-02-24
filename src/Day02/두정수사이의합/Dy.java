package Day02.두정수사이의합;

public class Dy {

	public long solution(int a, int b) {
        long answer = 0;
        int gap = a - b;
        
        if(gap > 0){
            for(int i=0; i<gap+1; i++){
                answer += b;
                b++;
            }
        }else if(gap < 0){
            for(int i=0; i<gap*(-1)+1; i++){
                answer += a;
                a++;
            }
        }else{
            answer = a;
        }
        
        return answer;
	}
}
