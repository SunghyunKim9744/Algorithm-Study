package D_0926.백준_19939_박터뜨리기;

import java.util.Scanner;

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		
		int numSum = 0;
		int cnt = 0;
		for(int i = 0; i<K; i++) {
			cnt++;
			numSum += cnt;
		}
		
		if(numSum > N) {
			System.out.println("-1");
		}else {
			N -= numSum;
			if(N % K == 0) {
				System.out.println(K-1);
			}else {
				System.out.println(K);
			}
		}

	}

}
