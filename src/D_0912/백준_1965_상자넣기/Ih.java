package D_0912.백준_1965_상자넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/1965
 * 
 */

public class Ih {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		// 전체 크기 입력 받음
		int n = Integer.parseInt(st.nextToken());

		// 상자 크기를 저장할 배열
		int[] dp = new int[n + 1];
		// dp 값을 저장할 배열
		int[] value = new int[n + 1];
		// 최댓값 저장 변수
		int max = 0;

		// 상자 크기들을 입력 받음
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
		}

		// n 이하인 i들에 대하여
		for (int i = 1; i <= n; i++) {
			value[i] = 1;
			// i보다 작은 j들에 대하여
			for (int j = 1; j < i; j++) {
				// j번째 값이 i번째 보다 작은데 전체 합친 값이 j가 i 이상이라면 
				if (dp[j] < dp[i] && value[i] <= value[j]) {
					// i번째 전체 합친 값이 j번째의 하나 더한 값
					value[i] = value[j] + 1;
				}
				// max 값 갱신
				max = Math.max(max, value[i]);
			}
		}
		// max 값 출력
		System.out.println(max);
	}

}
