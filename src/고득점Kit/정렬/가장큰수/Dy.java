package 고득점Kit.정렬.가장큰수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//8:51 ~
public class Dy {

	public static void main(String[] args) {
		int[] numbers1 = { 12,1213}, numbers2 = { 40,403};

		System.out.println(solution(numbers1));
//		System.out.println(solution(numbers2));
	}

	public static String solution(int[] numbers) {
		String answer = "0";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10; i++) {
			List<int[]> list = new ArrayList<int[]>();
			for(int j=0; j<numbers.length; j++) {
				if(numbers[j] / 1000 !=0 ) {
					if(numbers[j] / 1000 == 9-i) {
						int[] temp = {numbers[j],1};
						list.add(temp);
					}
				}else if(numbers[j] / 100 != 0) {
					if(numbers[j] / 100 == 9-i) {
						int[] temp = {numbers[j]*10 + (9-i),10};
						list.add(temp);
					}
				}else if(numbers[j] / 10 != 0) {
					if(numbers[j] / 10 == 9-i) {
						int[] temp = {numbers[j]*100 + (9-i)*10 +(9-i),100};
						list.add(temp);
					}
				}else {
					if(numbers[j] == 9-i) {
						int[] temp = {numbers[j]*1000 + (9-i)*100 +(9-i)*10 +(9-i),1000};
						list.add(temp);
					}
					
				}
			}
			Collections.sort(list, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o2[0] - o1[0];
				}
			});
			for(int[] key: list) {
				sb.append(key[0]/ key[1]);
			}
		}
		for(int i=1; i<10; i++) {
			String temp = Integer.toString(i);
			if(sb.indexOf(temp) != -1) {
				answer = sb.toString();
				break;
			}
		}

		return answer;
	}

}
