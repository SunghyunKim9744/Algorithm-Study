package D_0926.백준_19939_박터뜨리기;

import java.util.Scanner;

public class Db {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 7 4 4 4 4 4
		// 
		
		// 27 6 => 4 4 4 4 4 4 ... 3
		// 7 4 4 4 4 4
		// 7 5 4 4 4 3
		// 7 6 4 4 3 3
		// 8 6 4 4 3 2
		// 8 7 4 3 3 2
		// 9 7 4 3 2 2
		// 9 8 4 3 2 1
		// 8 7 6 3 2 1
		// 7 6 5 4 3 2
		// 5
		
		// 19 4 => 4 4 4 4 ... 3
		// 7 4 4 4
		// 7 5 4 3
		// 4
		
 		// 18 4 => 4 4 4 4 ... 2
		// 6 4 4 4
		// 6 5 4 3
		// 3
		
		// 17 4 => 4 4 4 4 ... 1
		// 5 4 4 4
		// 5 5 4 3
		// 6 5 4 2
		// 4
		
		// 11 4 => 2 2 2 2 ... 3
		// 5 2 2 2
		// 5 3 2 1
		// 4
		
		// 12 4 => 3 3 3 3
		// 3 3 3 3
		// 4 4 2 2
		// 5 3 3 1
		// 5 4 2 1
		// 4
		
		int a = k*(k+1)/2;
		if(n<a) System.out.println(-1);
		else if((n-a)%k==0) System.out.println(k-1);
		else System.out.println(k);
	}
}