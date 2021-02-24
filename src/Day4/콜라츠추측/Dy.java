package Day4.콜라츠추측;

public class Dy {

	public int solution(int num) {
        int answer = 0;
        int count = 0;
        long longNum = num;
        while(count < 500){
            if(longNum == 1){
                break;   
            }else if(longNum % 2 == 0){
                longNum = longNum / 2;
            }else{
                longNum = longNum * 3 + 1;
            }
            count++;
        }
        
        if(count == 500 && longNum !=1){
            answer = -1;
        }else{
            answer = count;
        }
        
        return answer;
    }
}
