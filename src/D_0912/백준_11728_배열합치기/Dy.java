package D_0912.백준_11728_배열합치기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/11728
 * 
 */

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		String[] A = sc.nextLine().split(" ");
		String[] B = sc.nextLine().split(" ");
		
		List<Integer> list = new ArrayList<>();		
		for(String key: A) {
			list.add(Integer.parseInt(key));
		}
		
		for(String key: B) {
			list.add(Integer.parseInt(key));
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<N + M; i++) {
			sb.append(list.get(i));
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
