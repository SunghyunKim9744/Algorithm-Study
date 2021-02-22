package Day3.수박수박수박수박수박수;

public class Sh {

	public static void main(String[] args) {
		
		int n = 3;
		String answer = solution(n);
	}
	
	public static String solution(int n) {
        String answer = "";
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<n/2; i++)
            str.append("수박");
        
        if(n%2 == 1)
            str.append("수");
        
        answer = str.toString();
        return answer;
    }
	
//	public static String solution(int n) {
//        String answer = "";
//
//        String hol = "수";
//        String even = "박";
//
//        for(int i=0; i<n; i++)
//            answer = (i+1)%2 == 0 ? answer+even : answer+hol; 
//        return answer;
//    }

}
