package D_1017.백준_2217_로프;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2217
 * 
 * 
 */
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(sc.nextLine()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int max = 0;
		for(int i=0; i<N; i++) {
			if(list.get(i) * (i+1) > max) {
				max = list.get(i) * (i+1);
			}
		}
		
		System.out.println(max);
	}
}
