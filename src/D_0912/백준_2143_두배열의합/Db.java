package D_0912.백준_2143_두배열의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/2143
 * 
 */

public class Db {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		long[] arr1 = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr1[i] = Long.parseLong(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		long[] arr2 = new long[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) arr2[i] = Long.parseLong(st.nextToken());
		
		List<Long> aSum = new ArrayList<>();
		for(int i=0;i<n;i++) {
			long sum =0 ;
			for(int j=i;j<n;j++) {
				sum+=arr1[j];
				aSum.add(sum);
			}
		}
		Collections.sort(aSum);
		Map<Long,Integer> map = new HashMap<>();
		for(int i=0;i<m;i++) {
			long sum=0;
			for(int j=i;j<m;j++) {
				sum += arr2[j];
				if(map.containsKey(sum)) map.put(sum, map.get(sum)+1);
				else map.put(sum, 1);
			}
		}
		long ans=0;
		for(int i=0;i<aSum.size();i++) {
			if(map.containsKey(T-aSum.get(i)))
				ans += map.get(T-aSum.get(i));
		}
		System.out.println(ans);
	}
}
