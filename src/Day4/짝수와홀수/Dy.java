package Day4.짝수와홀수;

public class Dy {

	public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        
        return answer;
    }
}
