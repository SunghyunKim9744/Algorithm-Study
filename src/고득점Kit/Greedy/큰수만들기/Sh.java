package 고득점Kit.Greedy.큰수만들기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String number1 = "1924", number2 = "1231234", number3 = "4177252841";

		int k1 = 2, k2 = 3, k3 = 4;

		System.out.println(solution(number1, k1));
//		System.out.println(solution(number2, k2));
//		System.out.println(solution(number3, k3));
	}

	// 5:08 ~
//	private static String solution(String number, int k) {
//		String answer ="";
//		String[] strs = number.split("");
//		Set<Integer> set = new HashSet<>();
//		Integer[] numbers = new Integer[number.length()];
//		
//		List<Integer> list = new ArrayList<>();
//		for(int i=0; i<number.length(); i++) {
//			numbers[i] = Integer.parseInt(strs[i]);
//			set.add(numbers[i]);
//			list.add(numbers[i]);
//		}
//		
//		List<Integer> setList = new ArrayList<>(set);
//		
//		setList.sort((n1,n2)->n2.compareTo(n1));
//		
//		int removeCnt = 0;
//		int fixedNum = 0;
//		while(k!=0) {
//	
//			if(!setList.isEmpty()) {
//				int index = list.indexOf(setList.get(0));
////				System.out.println(index);
//				System.out.println(setList);
//				if(k>=index-fixedNum) {
//					
//					int temp = fixedNum;
//					for(int i=fixedNum; i<index; i++) {
//						if(list.get(i)>=setList.get(0)) {
//							fixedNum++;
//							i=fixedNum-1;
//						}
//						else {
//							list.remove(fixedNum);
//							i--;
//							k--;
//						}
//						
//						
//					}
//					fixedNum++;
//					System.out.println(k);
//					System.out.println(list);
//			
//						
//				}
//				setList.remove(0);
//			}
//		}
//		
//		System.out.println(list);
//		
//			
//		
//		
//		
//		return answer;
//	}

	private static String solution(String number, int k) {
		String answer = "";

		String[] strs = number.split("");
		int[] numbers = new int[number.length()];
		for(int i=0; i<numbers.length; i++)
			numbers[i] = Integer.parseInt(strs[i]);
		
		List<String> list = new ArrayList<>();
		
		int[] temp = new int[strs.length];
		int depth=0;
		int start=0;
		int[] max = new int[strs.length-k];
		comb(numbers,temp,start,depth,strs.length-k,list,max);

		System.out.println(list);
		
		return answer;
	}

	private static void comb(int[] numbers, int[] temp, int start, int depth, int r, List<String> list, int[] max) {
		if(depth == r) {
			StringBuilder strb = new StringBuilder();
			for(int i=0; i<r; i++)
				strb.append(String.valueOf(temp[i]));
			
			list.add(strb.toString());
			return;
		}
		
		
		for(int i=start; i<numbers.length; i++) {
				temp[depth] = numbers[i];
				comb(numbers, temp, i+1, depth+1, r, list,max);

			
			
		}
		
	}
}
