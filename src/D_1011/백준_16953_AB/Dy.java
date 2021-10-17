package D_1011.백준_16953_AB;

import java.util.Scanner;

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nums = sc.nextLine().split(" ");
		
		int A = Integer.parseInt(nums[0]);
		int B = Integer.parseInt(nums[1]);
		
		int answer = 1;
		while(A < B) {
			if(B % 10 == 1) {
				B /= 10;
			}else {
				if(B % 2 == 0) {
					B /= 2;
				}else {
					answer = -1;
					break;
				}
			}
			answer++;
		}
		
		if(A != B) {
			answer = -1;
		}
		System.out.println(answer);
		

	}

}
