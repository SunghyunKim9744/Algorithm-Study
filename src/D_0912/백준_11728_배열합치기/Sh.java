package D_0912.백준_11728_배열합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/11728
 * 
 */

public class Sh {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sizeA = Integer.parseInt(st.nextToken());
		int sizeB = Integer.parseInt(st.nextToken());
		
		int[] answer = new int[sizeA+sizeB];
	
		int idx = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens())
			answer[idx++] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens())
			answer[idx++] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(answer);
		
		StringBuilder sb = new StringBuilder();
		for(int num : answer)
			sb.append(num+" ");
		
		System.out.println(sb.toString());

	}

}
