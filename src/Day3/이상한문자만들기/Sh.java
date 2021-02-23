package Day3.이상한문자만들기;

public class Sh {

	public static void main(String[] args) {
		String s = "  try    hello world";
		
		String answer = solution(s);

	}
	
	public static String solution(String s) {
		String answer = "";
        s = s.toUpperCase();
       
        String[] strs = s.split(" ",-1);
        
        for(int i=0; i<strs.length; i++) {
        	char[] temp = strs[i].toCharArray();
        
        	for(int j=0; j<temp.length; j++)
        		if(j%2 == 1 && 'A'<=temp[j] && temp[j] <='Z')
        			temp[j] += 'a'-'A';
        	answer += String.valueOf(temp)+" ";
        	
  
        }
        
        answer = answer.substring(0, answer.length()-1);
        System.out.println(answer);
        return answer;
    }

}
