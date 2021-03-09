package 고득점Kit.힙.더맵게;

public class GY {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;

		System.out.println(solution(scoville, k));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		return answer;
	}

}

//============================================
//public int solution(int[] scoville, int K) {
//    int answer = 0;
//    		PriorityQueue<Integer> heap = new PriorityQueue<>();
//
//	int s1 = 0, s2 = 0;
//	for (int i : scoville) {
//		heap.add(i);
//	}
//
//	while (heap.peek() < K) {
//		if (heap.size() == 1) {
//			return -1;
//		}
//
//		int a = heap.poll();
//		int b = heap.poll();
//
//		heap.add(a + 2 * b);
//		
//		answer++;
//	}
//
//	return answer;
//}