package 자료구조.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class CombSh {

	public static void main(String[] args) {
		String[] arr = {"A","B","C","D","E"};
		
		for(int i=0; i<arr.length; i++) {
			String[] temp = new String[i+1];
			int depth = 0;
			int start = 0;
			int r = i+1;
			List<String> list = new ArrayList<>();
			comb(arr,temp,start,depth,r,list);
			System.out.println(list);
		}

	}

	private static void comb(String[] arr, String[] temp, int start, int depth, int r, List<String> list) {
		
		if(depth == r) {
			StringBuilder sb = new StringBuilder();
			for(String s : temp)
				sb.append(s);
			list.add(sb.toString());
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			temp[depth] = arr[i];
			comb(arr,temp,i+1,depth+1,r,list);
		}
		
	}

}
