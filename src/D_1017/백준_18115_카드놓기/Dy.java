package D_1017.백준_18115_카드놓기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



/*
 * 
 * 	https://www.acmicpc.net/problem/18115
 * 
 */
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		String[] skill = sc.nextLine().split(" ");
		
		int[] nums = new int[N];
		
		int startNum = 0;
		int startNum2 = 0;
		int lastNum = 0;
		int button = 0;
		for(int i=0; i<N; i++) {
			if(skill[i].equals("1")) {
				for(int j=startNum; j<N; j++) {
					if(nums[j] == 0) {
						nums[j] = N-i;
						if(button == 0) {
							startNum++;
						}else {
							startNum = startNum2;
							button = 0;
						}
						break;
					}
				}
			}else if(skill[i].equals("2")) {
				int cnt = 0;
				if(button == 1) {
					cnt++;
				}
				button = 1;
				for(int j=startNum2; j<N; j++) {
					if(nums[j] == 0) {
						cnt++;
					}
					if(cnt == 2) {
						nums[j] = N-i;
						startNum2 = j;
						break;
					}
				}
			}else {
				for(int j=0; j<N-lastNum; j++) {
					if(nums[N-lastNum-j-1] == 0) {
						nums[N-lastNum-j-1] = N-i;
						lastNum++;
						break;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nums.length-1; i++) {
			sb.append(nums[i]);
			sb.append(" ");
		}
		sb.append(nums[nums.length-1]);
		
		String answer = sb.toString();
		
		System.out.println(answer);

	}

}
