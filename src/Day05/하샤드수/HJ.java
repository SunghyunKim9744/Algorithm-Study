package Day05.하샤드수;

public class HJ {
	public static void main(String[] args) {
		int x = 11; // 10000
		System.out.println(solution(x));
	}

//	// 방법 1) (0.14ms, 52.2MB) - (1.51ms, 52.5MB)
//	public static boolean solution(int x) {
//		int value = 0;
//		String[] xArr = String.valueOf(x).split("");
//
//		for (int i = 0; i < xArr.length; i++)
//			value += Integer.parseInt(xArr[i]);
//
//		return (x % value == 0) ? true : false;
//	}

	// 방법 2) (0.02ms, 51.8MB) - (0.04ms, 52.6MB)
	public static boolean solution(int x) {
		int tempX = x;
		int value = 0;
		
		while(tempX > 0) {
			value += tempX % 10;
			tempX /= 10;
		}

//		return (x % value == 0) ? true : false;
		return x % value == 0;
	}

}
