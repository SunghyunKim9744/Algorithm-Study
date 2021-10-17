package D_0926.백준_1660_캡틴이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sh {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for(N=1; N<=100; N++) {
			int idx = 0;
			int tetrahedronNum = 0;
			List<Integer> tetraList = new ArrayList<>();
			while (true) {
				int triNum = (idx * idx + idx) / 2;
				tetrahedronNum += triNum;
				if (tetrahedronNum > N)
					break;
				tetraList.add(tetrahedronNum);
				idx++;
			}
			
			int[] dp = new int[N+1];
			for(int i=1; i<=N; i++) {
				//int findNum = binarySearch(i,tetraList);
				int findNum = -1;
				int mod = -1;
				for(int j= tetraList.size()-1; j >=0; j--) {
					if(i % tetraList.get(j) == 0) {
						findNum = tetraList.get(j);
						mod = i/findNum;
						break;
					}
				}
				if(findNum == i)
					dp[i] = 1;
				else {
					dp[i] = dp[mod*findNum]+dp[i-mod*findNum];
				}
				
			}
			System.out.println("N : "+N);
			System.out.println(dp[N]);
		}
		
		

	}

	private static int binarySearch(int num, List<Integer> tetraList) {
		int start = 0;
		int end = tetraList.size()-1;
		
		int findNum = -1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			int currentNum = tetraList.get(mid);
			
			if(num >= currentNum) {
				start = mid+1;
				findNum = currentNum;
			}
			else
				end = mid-1;
		
		}
		return findNum;
	}

}
