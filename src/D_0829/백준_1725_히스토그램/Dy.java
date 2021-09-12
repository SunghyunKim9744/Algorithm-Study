package D_0829.백준_1725_히스토그램;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0]-o1[0];
			}
		});
		
		int maxNum = 0;
		
		for(int i = 0; i<N + 1; i++) {
			int num = 0;
			if(i == N) {
				num = 1;
			}else {
				num = sc.nextInt();
			}
			int start = i;
			while(!queue.isEmpty() && queue.peek()[0] >= num) {
				int[] peek = queue.poll();
				if(peek[1] < start) {
					start = peek[1];
				}
				if(peek[0] * (i - peek[1]) > maxNum) {
					maxNum = peek[0] * (i - peek[1]);
				}
			}
			int[] data = {num, start};
			queue.add(data);
		}
		System.out.println(maxNum);
	}

}
