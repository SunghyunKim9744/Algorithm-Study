package Day04.자릿수더하기;

public class Dy {

	public int solution(int n) {
        int answer = 0;
        for(int i = 0; i<9; i++){
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}
