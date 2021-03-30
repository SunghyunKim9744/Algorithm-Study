package Level2And3Day2.거스름돈lv3;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {
		int n = 5;
		int[] money = {1,2,5};

		
		solution(n,money);

	}

	private static int solution(int n, int[] money) {
//		int answer = 0;
//		Arrays.sort(money);
//		int moneyIndex = 0;
//		int[] nums = new int[n+1];
//		for(int i=1; i<n+1; i++) {
//			for(int j = 0; j<money.length; j++) {
//				if(i > money[j]) {
//					nums[i] += nums[i-money[j]] % 1000000007;
//				}else {
//					break;
//				}
//			}
//            if(i == money[moneyIndex]) {
//				moneyIndex++;
//				nums[i]++;
//			}
//            
//		}
//        answer = nums[n];
//		return answer;
		
		
		int answer = 0;
		Arrays.sort(money);
		int moneyIndex = 0;
		int[] nums = new int[n+1];
		for(int i=money[0]; i<n+1; i++) {
			nums[i] = nums[i-money[0]];
		}
		answer = nums[n];
		return answer;
//		1
//		
//		11
//		2
//		
//		111
//		12
//		
//		1111
//		112
//		22
//		
//		11111
//		1112
//		122
//		5
//		
//		111111
//		11112
//		1122
//		222
//		15
//		
//		1111111
//		111112
//		11122
//		1222
//		115
//		25
//		
//		11111111
//		1111112
//		111122
//		11222
//		2222
//		1115
//		125
//		
//		111111111
//		11111112
//		1111122
//		111222
//		12222
//		11115
//		1125
//		225
//		
//		1111111111
//		111111112
//		11111122
//		1111222
//		112222
//		22222
//		111115
//		11125
//		1225
//		55
	}

}
