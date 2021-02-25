package Day05.하샤드수;

public class Sh {
	public static void main(String[] args) {
		int x = 10;
		boolean answer = solution(x);
	}

	// (0.02ms, 52.4MB) - > (0.04ms, 51.9MB)
	private static boolean solution(int x) {
		boolean answer = true;
		int total = 0;
		int temp = x;
		while(temp>0) {
			total+= temp%10;
			temp/=10;
		}
		
        return x % total == 0 ? true : false;
	}
	
	// 2. 문자열로 만들어서 계산
	// (0.13ms, 51.7MB) - > (1.02ms, 52.3MB)
//	private static boolean solution(int x) {
//		boolean answer = true;
//		String value = String.valueOf(x);
//		int len = value.length();
//		int total = 0;
//		
//		String[] values = value.split("");
//		for(int i=0; i<len; i++)
//			total+= Integer.parseInt(values[i]);
//		
//		
//        return x % total == 0 ? true : false;
//	}
	
	// 위와 동일
	// (0.12ms, 52.8MB) - > (0.20ms, 52.1MB)
//	private static boolean solution(int x) {
//		boolean answer = true;
//		String[] values = String.valueOf(x).split("");
//		
//		int total = 0;
//		
//		
//		for(String s : values)
//			total+= Integer.parseInt(s);
//		
//		
//        return x % total == 0 ? true : false;
//	}
	
	// 4. 스트림 사용
	// (1.43ms, 53.2MB) - > (8.23ms, 52.5MB)
//	private static boolean solution(int x) {
//		
//        return x % Integer.toString(x).codePoints().map(i->i-'0').sum() == 0
//        		? true : false;
//	}
}
