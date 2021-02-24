package Day4.자연수뒤집어배열로만들기;

public class Dy {

	public int[] solution(long n) {
        int[] answer = {};
        long[] temp = new long[11];
        int leng = 0;
        for(int i = 0; i<11; i++){
            if(n == 0)
                break;
            
            temp[i] = n % 10;
            n = n / 10;
            leng++;
        }
        
        answer = new int[leng];
        
        for(int i = 0; i<leng; i++){
            answer[i] = (int) temp[i];
        }
        
        return answer;
    }
}
