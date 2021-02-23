package Day3.시저암호;

public class Dy {

	public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
           if(s.charAt(i) != " " && s.charAt(i) < 91){
               s.charAt(i) = ((s.charAt(i) + n - 64) % 23) + 64;
           }else if(s.charAt(i) != " " && s.charAt(i) > 91){
               s.charAt(i) = ((s.charAt(i) + n - 96) % 23) + 96;
           }
        }
       
        answer = s;
        
        return answer;
      
    }
}
