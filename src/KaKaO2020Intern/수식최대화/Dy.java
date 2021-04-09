package KaKaO2020Intern.수식최대화;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		String h = "100-200*300-500+20";
		
		System.out.println(solution(h));

	}
	
	private static long solution(String expression) {
        long answer = 0;
        
        String temp = expression.replaceAll("[0-9]", "");
        String[] nums = expression.split("\\-|\\+|\\*");
        String[] temp2 = temp.split("");
        
        List<Integer> num = new ArrayList<>();
        List<String> oper = new ArrayList<>();
        for(String key: nums) {
        	num.add(Integer.parseInt(key));
        }
        for(String key: temp2) {
        	oper.add(key);
        }
        
        String[] operator = {"+","-","*"};
        
        List<Integer> num1 = new ArrayList<>();
        num1.addAll(num);
        List<String> oper1 = new ArrayList<>();
        oper1.addAll(oper);
        
        for(int i=0; i<oper1.size(); i++) {
        	if(oper1.get(i).equals("*")) {
        		num1.set(i, num1.get(i) * num1.get(i+1));
        		num1.remove(i+1);
        		oper1.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper1.size(); i++) {
        	if(oper1.get(i).equals("+")) {
        		num1.set(i, num1.get(i) + num1.get(i+1));
        		num1.remove(i+1);
        		oper1.remove(i);
        		i--;
        	}
        }

        for(int i=0; i<oper1.size(); i++) {
        	if(oper1.get(i).equals("-")) {
        		num1.set(i, num1.get(i) - num1.get(i+1));
        		num1.remove(i+1);
        		oper1.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num1.get(0)))
        	answer = Math.abs(num1.get(0));
        
        List<Integer> num2 = new ArrayList<>();
        num2.addAll(num);
        List<String> oper2 = new ArrayList<>();
        oper2.addAll(oper);
        
        for(int i=0; i<oper2.size(); i++) {
        	if(oper2.get(i).equals("*")) {
        		num2.set(i, num2.get(i) * num2.get(i+1));
        		num2.remove(i+1);
        		oper2.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper2.size(); i++) {
        	if(oper2.get(i).equals("-")) {
        		num2.set(i, num2.get(i) - num2.get(i+1));
        		num2.remove(i+1);
        		oper2.remove(i);
        		i--;
        	}
        }

        for(int i=0; i<oper2.size(); i++) {
        	if(oper2.get(i).equals("+")) {
        		num2.set(i, num2.get(i) + num2.get(i+1));
        		num2.remove(i+1);
        		oper2.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num2.get(0)))
        	answer = Math.abs(num2.get(0));
        
        List<Integer> num3 = new ArrayList<>();
        num3.addAll(num);
        List<String> oper3 = new ArrayList<>();
        oper3.addAll(oper);
        
        for(int i=0; i<oper3.size(); i++) {
        	if(oper3.get(i).equals("+")) {
        		num3.set(i, num3.get(i) + num3.get(i+1));
        		num3.remove(i+1);
        		oper3.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper3.size(); i++) {
        	if(oper3.get(i).equals("-")) {
        		num3.set(i, num3.get(i) - num3.get(i+1));
        		num3.remove(i+1);
        		oper3.remove(i);
        		i--;
        	}
        }

        for(int i=0; i<oper3.size(); i++) {
        	if(oper3.get(i).equals("*")) {
        		num3.set(i, num3.get(i) * num3.get(i+1));
        		num3.remove(i+1);
        		oper3.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num3.get(0)))
        	answer = Math.abs(num3.get(0));
        
        List<Integer> num4 = new ArrayList<>();
        num4.addAll(num);
        List<String> oper4 = new ArrayList<>();
        oper4.addAll(oper);
        
        for(int i=0; i<oper4.size(); i++) {
        	if(oper4.get(i).equals("+")) {
        		num4.set(i, num4.get(i) + num4.get(i+1));
        		num4.remove(i+1);
        		oper4.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper4.size(); i++) {
        	if(oper4.get(i).equals("*")) {
        		num4.set(i, num4.get(i) * num4.get(i+1));
        		num4.remove(i+1);
        		oper4.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper4.size(); i++) {
        	if(oper4.get(i).equals("-")) {
        		num4.set(i, num4.get(i) - num4.get(i+1));
        		num4.remove(i+1);
        		oper4.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num4.get(0)))
        	answer = Math.abs(num4.get(0));
        
        List<Integer> num5 = new ArrayList<>();
        num5.addAll(num);
        List<String> oper5 = new ArrayList<>();
        oper5.addAll(oper);
        
        for(int i=0; i<oper5.size(); i++) {
        	if(oper5.get(i).equals("-")) {
        		num5.set(i, num5.get(i) - num5.get(i+1));
        		num5.remove(i+1);
        		oper5.remove(i);
        		i--;
        	}
        }

        for(int i=0; i<oper5.size(); i++) {
        	if(oper5.get(i).equals("*")) {
        		num5.set(i, num5.get(i) * num5.get(i+1));
        		num5.remove(i+1);
        		oper5.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper5.size(); i++) {
        	if(oper5.get(i).equals("+")) {
        		num5.set(i, num5.get(i) + num5.get(i+1));
        		num5.remove(i+1);
        		oper5.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num5.get(0)))
        	answer = Math.abs(num5.get(0));
        
        List<Integer> num6 = new ArrayList<>();
        num6.addAll(num);
        List<String> oper6 = new ArrayList<>();
        oper6.addAll(oper);
        
        for(int i=0; i<oper6.size(); i++) {
        	if(oper6.get(i).equals("-")) {
        		num6.set(i, num6.get(i) - num6.get(i+1));
        		num6.remove(i+1);
        		oper6.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper6.size(); i++) {
        	if(oper6.get(i).equals("+")) {
        		num6.set(i, num6.get(i) + num6.get(i+1));
        		num6.remove(i+1);
        		oper6.remove(i);
        		i--;
        	}
        }
        
        for(int i=0; i<oper6.size(); i++) {
        	if(oper6.get(i).equals("*")) {
        		num6.set(i, num6.get(i) * num6.get(i+1));
        		num6.remove(i+1);
        		oper6.remove(i);
        		i--;
        	}
        }
        
        if(answer < Math.abs(num6.get(0)))
        	answer = Math.abs(num6.get(0));
        
        return answer;
    }
	

}
