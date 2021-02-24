package Day04.정수제곱근판별;

public class Sh {
	public static void main(String[] args) {
		long n = 3;
		System.out.println(solution(n));
	}

//	public static long solution(long n) {
//		long answer = 0;
//		
//		if(0 < Math.sqrt(n)-(int)Math.sqrt(n) && Math.sqrt(n)-(int)Math.sqrt(n) < 1)
//			return -1;
//	
//		return ((long)Math.sqrt(n)+1)*((long)Math.sqrt(n)+1);
//	}
	
	public static long solution(long n) {
		long answer = 0;
		if(n==1)
			return 4;
		for(long i=0; i<n/2; i++)
			if((i+1)*(i+1) == n)
				return (i+2)*(i+2);
	
		
		return -1;
	}
}
