package etc.카카오메이커스;

public class ps3 {

	public static void main(String[] args) {
		int n1 = 6, n2 = 5, n3 = 4;
		int[] p1 = { 1, 1, 1, 1, 1, 1 }, p2 = { 2, 1, 2, 2 }, p3 = { 1, 1, 2, 3, 4 };
		int[][] t1 = { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 3, 5 }, { 3, 6 } }, t2 = { { 1, 2 }, { 1, 3 }, { 2, 4 } },
				t3 = { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 1, 5 } };

		System.out.println(solution(n1, p1, t1));
		System.out.println(solution(n2, p2, t2));
		System.out.println(solution(n3, p3, t3));
	}

	public static int[] solution(int n, int[] passenger, int[][] train) {
		int[] answer = {};
		return answer;
	}

}
