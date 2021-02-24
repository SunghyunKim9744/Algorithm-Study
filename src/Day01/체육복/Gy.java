package Day01.체육복;

public class Gy {

	public static void main(String[] args) {

		int n1 = 5;
		int[] lost1 = { 2, 4 };
		int[] reserve1 = { 1, 3, 5 };
		solution(n1, lost1, reserve1);

		int n2 = 5;
		int[] lost2 = { 2, 4 };
		int[] reserve2 = { 3 };
		solution(n2, lost2, reserve2);

		int n3 = 3;
		int[] lost3 = { 3 };
		int[] reserve3 = { 1 };
		solution(n3, lost3, reserve3);

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] students = new int[n];

		// 여벌복 학생에게 1 추가
		for (int i = 0; i < reserve.length; i++) {
			students[reserve[i] - 1]++;
		}

		// 도난 학생 1 빼기
		for (int i = 0; i < lost.length; i++) {
			students[lost[i] - 1]--;
		}
		
		int nums = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == -1) {
				if (i - 1 >= 0 && students[i - 1] == 1) {
					students[i]++;
					students[i - 1]--;
				} else if (i + 1 < students.length && students[i + 1] == 1) {
					students[i]++;
					students[i + 1]--;
				}
			}
			
			if(students[i] == -1)
				nums++;
		}
		
		answer = n-nums;

		return answer;
	}

}
