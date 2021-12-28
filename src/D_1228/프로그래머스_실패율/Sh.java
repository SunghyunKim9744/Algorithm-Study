package D_1228.프로그래머스_실패율;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sh {

	static public class Game implements Comparable<Game>{
		int stage;
		double fail;
		
		public Game(int stage, double fail) {
			this.stage = stage;
			this.fail = fail;
		}

		@Override
		public int compareTo(Game o) {
			int value = 0;
			if(this.fail == o.fail)
				return this.stage - o.stage;
			return value = this.fail < o.fail ? 1 : -1;
		}
		
		
	}
	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		
		int[] answer = solution(N,stages);

	}

	private static int[] solution(int N, int[] stages) {
		int[] total = new int[N+2];
		int[] fail = new int[N+2];
		
		for(int stage : stages) {
			for(int i=1; i<=stage; i++)
				total[i]++;
			fail[stage]++;
		}
		
		List<Game> list = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			if(total[i] == 0)
				list.add(new Game(i,0));
			else
				list.add(new Game(i,fail[i]/(double)total[i]));
		}
		Collections.sort(list);
		
		int[] answer = new int[N];
		int idx = 0;
		for(Game g : list)
			answer[idx++] = g.stage;
		
		return answer;
	}

}
