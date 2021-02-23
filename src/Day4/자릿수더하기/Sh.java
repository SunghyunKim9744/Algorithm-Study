package Day4.자릿수더하기;

public class Sh {
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}

//	public static int solution(int n) {
//		int answer = 0;
//        String value = String.valueOf(n);
//        String[] values = value.split("");
//        
//        for(String str : values)
//        	answer += Integer.parseInt(str);
//
//        return answer;
//    }

//	public static int solution(int n) {
//		int answer = 0;
//		String value = String.valueOf(n);
//		int len = value.length();
//
//		for (int i = 0; i < len; i++) {
//			answer += n % 10;
//			n /= 10;
//		}
//
//		return answer;
//	}
//
//	public static int solution(int n) {
//		int answer = 0;
//
//		while (n > 0) {
//			answer += n % 10;
//			n /= 10;
//		}
//
//		return answer;
//	}

	public static int solution(int n) {
		int answer = 0;
        String value = String.valueOf(n);
        int len = value.length();
        
        for(int i=0; i<len; i++) {
        	int position = (int) Math.pow(10,len-i-1);
        	answer += n / position;
        	n %= position;
        }
        

        return answer;
    }

}
