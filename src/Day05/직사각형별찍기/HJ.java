package Day05.직사각형별찍기;

import java.util.Arrays;
import java.util.Scanner;


public class HJ {

//	// 방법 1) (206.97ms, 48.5MB) - (406.51ms, 52.4MB)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		for (int i = 0; i < b; i++) {
//			for (int j = 0; j < a; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//	}
	
	// 방법 2) (217.80ms, 48.5MB) - (276.60ms, 49MB)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		char[] charArr = new char[a];
		Arrays.fill(charArr, '*');
		String stars = String.valueOf(charArr);

		while(b-- > 0)
			System.out.println(stars);
	}

}
