package Day3.약수의합;

public class Sh {

	public static void main(String[] args) {

		int n = 4;
		
		int answer = solution(n);
		
		System.out.println(answer);

	}
	
	public static int solution(int n) {
	      int answer = 0;
	      
	      for(int i=0; i<n; i++)
	    	  if(n%(i+1) == 0)
	    		  answer+= i+1;
	      return answer;
	  }

}
