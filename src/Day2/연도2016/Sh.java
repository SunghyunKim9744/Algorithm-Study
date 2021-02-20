package Day2.연도2016;

public class Sh {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		String answer = solution(a,b);

	}
	
	public static String solution(int a, int b) {
        String answer = "";
        
        // 1~12월까지의 일 수
        int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        // 1월1일이 금요일이므로 금요일부터 배열에 담음
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int totalDay = 0;
        
        // 1월~ a-1월 까지의 총 일 수
        for(int i=0; i<a-1; i++)
            totalDay += monthDays[i];
        
        // 일 수
        totalDay += b;
        
        // 총 일수에서 1월 1일에서 1일 빼기
        totalDay -=1;
        
        answer = days[totalDay%7];
        return answer;
    }

}
