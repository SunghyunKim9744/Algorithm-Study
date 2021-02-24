package Day02.연도2016;

import java.time.LocalDate;

public class Gy {

	public static void main(String[] args) {
		solution(5,24);
	}

	public static String solution(int a, int b) {
        String answer = "";
        
        LocalDate day = LocalDate.of(2016, a, b);
//      System.out.println(day.getDayOfWeek()); // TUESDAY
        
        answer = day.getDayOfWeek().toString().substring(0,3);
        
        return answer;
    }
	
}
