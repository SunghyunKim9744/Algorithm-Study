package 자료구조.Graph;

import java.util.Arrays;

public class 크루스칼Dy {

	public static void main(String[] args) {
		int[][] n = {{1,2},{2,3},{3,6},{5,6},{4,5},{1,4},{2,4},{2,5},{2,6}};
		int[] v = {6,5,8,11,9,4,3,7,8};
		System.out.println(solution(n,v));
	}

	private static int solution(int[][] n, int[] v) {
		int answer = 0;
		
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<v.length-1-i; j++) {
				if(v[j] > v[j+1]) {
					int temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
					int[] temp2 = n[j];
					n[j] = n[j+1];
					n[j+1] = temp2;
				}
			}
		}
		
		int[] p = new int[v.length+1];
		
		for(int i=0; i<v.length; i++) {
			p[i+1] = i+1;
		}
		
		for(int i = 0; i<n.length; i++) {
			int left = n[i][0];
			int right = n[i][1];
			int leftP = find(p, left);
			int rightP = find(p, right);
			
			if(leftP > rightP) {
				int temp = leftP;
				leftP = rightP;
				rightP = temp;
			}
			
			if(leftP != rightP) {
				union(p, leftP, rightP);
				answer += v[i];
				
			}
			
		}
		
		return answer;	
	}

	private static void union(int[] p, int leftP, int rightP) {
		p[rightP] = leftP;
	}

	private static int find(int[] p, int num) {
		
		if(p[num] == num) {
			return num;
		}else {
			int root = find(p, p[num]);
			p[num] = root;
			return root;
		}
	}

}
