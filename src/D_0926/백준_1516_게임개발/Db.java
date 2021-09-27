package D_0926.백준_1516_게임개발;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Db {
	public static class Building{
		int no;
		List<Integer> pre;
		int cost;
		
		public Building(int no,List<Integer> pre, int cost) {
			this.no =no;
			this.pre = pre;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean[] built = new boolean[n+1];
		
		Queue<Building> buildings = new LinkedList<>();
		
		StringTokenizer st;
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			List<Integer> temp = new ArrayList<>();
			while(true) {
				int pre = Integer.parseInt(st.nextToken());
				if(pre == -1) break;
				temp.add(pre);
			}
			buildings.add(new Building(i,temp,time));
		}
		while(!buildings.isEmpty()) {
			Building cur = buildings.poll();
			List<Integer> pre = cur.pre;
			boolean isOK = true;
			for(int x : pre) {
				if(!built[x]) {
					isOK = false;
					break;
				}
			}
			if(!isOK) {
				buildings.add(cur);
			}
			else {
				built[cur.no] = true;
				ans+=cur.cost;
			}
		}
		System.out.println(ans);
	}
}
