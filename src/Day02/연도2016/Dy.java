package Day02.연도2016;

public class Dy {

	public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int date = b;
        for(int i =0; i<a-1; i++){
            date += month[i];
        }
        
        answer = day[(date + 4) % 7];
        
        return answer;
    }
}
