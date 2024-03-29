package D_1017.백준_2217_로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2217
 * 
 * 
 */
public class Ih {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Integer[] Narr = new Integer[N];

		for (int i = 0; i < N; i++) {
			Narr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(Narr, Collections.reverseOrder());

		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, Narr[i] * (i + 1));
		}

		System.out.println(max);

	}
}
