package D_0926.백준_1660_캡틴이다솜;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Db {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> d = new ArrayList<>();
		d.add(0);
		
		List<Integer> dd = new ArrayList<>();
		dd.add(0);
		
    	
    	for(int i=1;i<=n;i++) {
    		d.add(i+d.get(i-1));
    	}
    	
    	for(int i=1;i<=n;i++) {
    		dd.add(dd.get(i-1)+d.get(i));
    	}
    	
		int[] ans = new int[n+1];
		
		Arrays.fill(ans, 987654321);
		ans[0]=0;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<dd.size() && dd.get(j)<=i;j++) {
				ans[i] = Math.min(ans[i], ans[i-dd.get(j)]+1);
			}
			
		}
		System.out.println(ans[n]);
	}
}
