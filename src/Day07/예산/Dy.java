package Day07.예산;

// 1:59 ~ 2:04
public class Dy {
	public static void main(String[] args) {
		int d[] = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(solution(d, budget));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		for(int i=0; i<d.length-1; i++) {
			for(int j=0; j<d.length-1-i; j++) {
				if(d[j]> d[j+1]) {
					int temp = d[j];
					d[j] = d[j+1];
					d[j+1] = temp;
				}
			}
		}
		for(int key: d) {
			budget -= key;
			answer++;
			if(budget<0) {
				answer--;
				break;
			}
		}
		return answer;
	}
}
