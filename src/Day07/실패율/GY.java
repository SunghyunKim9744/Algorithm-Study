package Day07.실패율;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GY {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		System.out.println(solution(N, stages));

		int N2 = 4;
		int[] stages2 = { 4, 4, 4, 4, 4 };
		System.out.println(solution(N2, stages2));

		int N3 = 5;
		int[] stages3 = { 2, 1, 2, 4, 2, 4, 3, 3 };
		System.out.println(solution(N3, stages3));
	}

	// 6:55 ~
	public static int[] solution(int N, int[] stages) {
		int[] answer = {};

		Map<Integer, Double> map = new HashMap<Integer, Double>();

		int sNum = stages.length;
		for (int i = 1; i <= N; i++) {
			int numerator = 0;
			int denumerator = 0;
			for (int j = 0; j < sNum; j++) {
				if (stages[j] == i) {
					numerator++;
				}
				if (stages[j] >= i)
					denumerator++;
			}
			double failRate = (double) numerator / denumerator;
			// 이부분 질문하기 참조
			if (denumerator == 0)
				failRate = 0;
			map.put(i, failRate);
		}

//		System.out.println(map.toString());
		List<Integer> list = new LinkedList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++)
			answer[i] = list.get(i);

		return answer;
	}
}

//class Solution {
//    public int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//		Arrays.sort(stages);
//		int people = stages.length;
//
//		List<Fail> fails = new ArrayList<Fail>();
//
//		for (int i = 1; i <= N; i++) {
//			int count = 0;
//			for (int j = 0; j < stages.length; j++) {
//				if (i == stages[j]) {
//					count++;
//				}
//			}
//			double rate = (double) count / people;
//			fails.add(new Fail(i, rate));
//			people -= count;
//		}
//
//		for (int i = 0; i < N; i++) {
//			System.out.println(fails.get(i).stage + ", " + fails.get(i).rate);
//		}
//
//		myComparator comp = new myComparator();
//		Collections.sort(fails, comp);
//
//		for (int i = 0; i < N; i++) {
//			System.out.println(fails.get(i).stage + ", " + fails.get(i).rate);
//		}
//        for(int i = 0;i<answer.length;i++) {
//			answer[i] = fails.get(i).stage;
//		}
//        
//        return answer;
//    }
//}
//class Fail {
//	int stage;
//	double rate;
//
//	Fail(int stage, double rate) {
//		this.stage = stage;
//		this.rate = rate;
//	}
//}
//
//class myComparator implements Comparator<Fail> {
//	public int compare(Fail o1, Fail o2) {
//		if (o1.rate < o2.rate) {
//			return 1;
//		} else if (o1.rate > o2.rate) {
//			return -1;
//		} else {
//			if (o1.stage > o2.stage) {
//				return 1;
//			} else
//				return -1;
//		}
//	}
//}
