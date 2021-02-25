package Day05.x만큼간격이있는n개의숫자;

public class Dy {

	public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        long longX = x;
        
        for(int i = 0; i<n; i++){
            answer[i] = longX * (i + 1);
        }
        
        return answer;
    }
}
