package D_0926.백준_1660_캡틴이다솜;

import java.util.Scanner;

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		int N = Integer.parseInt(sc.nextLine());
		int answer = 0;
		while(N != 0) {
			int numberSum = 0;
			int number = 0;
			int cnt = 0;
			while(true) {
				cnt++;
				number += cnt;
				if(numberSum + number > N) {
					break;
				}
				numberSum += number;
			}
			N -= numberSum;
			answer++;
			System.out.println(numberSum);
		}
		System.out.println(answer);

	}

}
