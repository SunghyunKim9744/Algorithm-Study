package KaKaO2020Intern.수식최대화;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		
		long answer = solution(expression);

	}

	// 3:21
	private static long solution(String expression) {
		long answer = 0;
		
		String[] oper = {"+-*","+*-","-+*","-*+","*+-","*-+"};
		long[] answers = new long[6];
		
		String[] nums = expression.split("[-*+]");
		String[] ex = new String[nums.length-1];
		int idx = 0;
		for(int i=0; i<expression.length(); i++) {
			String ch = expression.substring(i,i+1);
			if(ch.equals("+") || ch.equals("-") || ch.equals("*"))
				ex[idx++] = ch;
		}
		
		List<String> numsList = new ArrayList<>();
		List<String> exList = new ArrayList<>();
		for(String te : nums)
			numsList.add(te);
		
		for(String te : ex)
			exList.add(te);
		
		int index = 0;
		for(String s : oper) {
			List<String> tempNums = new ArrayList<>();
			List<String> tempEx = new ArrayList<>();
			for(String te : nums)
				tempNums.add(te);
			
			for(String te : ex)
				tempEx.add(te);
			
			for(int i=0; i<3; i++) {
				String st = s.substring(i,i+1);
				for(int j=0; j<tempEx.size(); j++) {
					if(tempEx.get(j).equals(st)) {
						if(st.equals("+")) {
							long left = Long.parseLong(tempNums.get(j));
							long right = Long.parseLong(tempNums.get(j+1));
							String total = String.valueOf(left+right);
							tempNums.set(j, total);
							tempNums.remove(j+1);
							tempEx.remove(j);
							j--;
						}
						else if(st.equals("-")) {
							long left = Long.parseLong(tempNums.get(j));
							long right = Long.parseLong(tempNums.get(j+1));
							String total = String.valueOf(left-right);
							tempNums.set(j, total);
							tempNums.remove(j+1);
							tempEx.remove(j);
							j--;
						}
						else {
							long left = Long.parseLong(tempNums.get(j));
							long right = Long.parseLong(tempNums.get(j+1));
							String total = String.valueOf(left*right);
							tempNums.set(j, total);
							tempNums.remove(j+1);
							tempEx.remove(j);
							j--;
						}
					}
				}
			}
			
			answers[index++] = Math.abs(Integer.parseInt(tempNums.get(0)));
			
		}
		
		Arrays.sort(answers);
		
		answer = answers[5];
		
		return answer;
	}

}
