package Level2And3Day1.숫자124나라의숫자lv2;

public class Sh {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		
		System.out.println(solution(14));
	}

	private static String solution(int n) {
		String answer = "";
		
		StringBuilder str = new StringBuilder();
		
		while(n>0) {
			if(n%3==0) {
				str.append("4");
				n=n/3-1;
			}
				
			else {
				str.append(n%3);
				n/=3;
			}
			
			//n=(n-1)/3;
			
		}
		
		answer = str.reverse().toString();
		return answer;
		
	}

}
