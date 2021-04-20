package KaKaO2020신입.문자열압축;

public class Sh {

	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		
		int answer = solution(s);

	}

	private static int solution(String s) {
		int answer = 0;
		int max = s.length();
		
		int maxCut = s.length()/2;
		
		for(int i=1; i<=maxCut; i++) {
			int num = s.length()/i;
			int last = s.length()%i;
			StringBuilder strb = new StringBuilder();
			
			String temp = s.substring(0,i);
			int cnt = 1;
			for(int j=1; j<num; j++) {
				String current = s.substring(j*i,j*i+i);
				if(current.equals(temp)) {
					cnt++;
				}
				else {
					if(cnt != 1) 
						strb.append(cnt+temp);
					else 
						strb.append(temp);
						
					temp = current;
					cnt = 1;
				}
				
				if(j == num-1) {
					if(cnt != 1) 
						strb.append(cnt+temp);
					else 
						strb.append(temp);
				}
					
			}
			
			int len = strb.length() + last;
			if(max > len) 
				max = len;
			
		}
		answer = max;
		System.out.println(answer);
		return answer;
	}

}
