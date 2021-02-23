package Day4.정수내림차순으로배치하기;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		long n = 118372; // 8000000000L;
		System.out.println(solution(n));
	}

	// 방법 1) (0.40ms, 54.1MB) - (2.59ms, 53.4MB)
	public static long solution(long n) {
        long answer = 0;
        char[] numStr = String.valueOf(n).toCharArray();
        Arrays.sort(numStr);
        answer = Long.parseLong(new StringBuilder()
        						.append(numStr)
        						.reverse()
        						.toString());

        return answer;
    }
	
//	// 방법 2) (0.07ms, 52.3MB) - (0.15ms, 52.9MB)
//	public static long solution(long n) {
//		long answer = 0;
//		int length = String.valueOf(n).length();
//		int[] numsArr = new int[length];
//
//		// 숫자 쪼개기
//		for (int i = 0; i < length; i++) {
//			numsArr[i] = (int) (n % 10);
//			n /= 10;
//		}
//
//		// 선택 정렬
//		for (int i = 0; i < length - 1; i++) {
//			int max = i;
//
//			for (int j = i + 1; j < length; j++)
//				if (numsArr[max] < numsArr[j])
//					max = j;
//
//			int temp = numsArr[i];
//			numsArr[i] = numsArr[max];
//			numsArr[max] = temp;
//		}
//		
//		// 숫자 재조합
//		StringBuilder sb = new StringBuilder();
//		for(int num : numsArr)
//			sb.append(num);
//		answer = Long.parseLong(sb.toString());
//		
//		return answer;
//	}

}
