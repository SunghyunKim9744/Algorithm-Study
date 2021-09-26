package D_0912.백준_1965_상자넣기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/*
 * 
 * 		https://www.acmicpc.net/problem/1965
 * 
 */

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 12;
		
		String[] box = {"8", "9", "10", "11", "12", "1", "2", "3", "4", "5", "3", "6"};
		
		Stack<Integer> queue = new Stack<>();
		
		Queue<Integer> temp = new LinkedList<>();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i<box.length; i++) {
			if(queue.isEmpty() || queue.peek() < Integer.parseInt(box[i])) {
				queue.push(Integer.parseInt(box[i]));
			}else {
				int stackNum = queue.peek();
				while(!queue.isEmpty() && queue.peek() >= Integer.parseInt(box[i])) {
					stack.push(queue.pop());
				}
				
				int tempNum = 0;
				boolean temp3 = false;
				while(i < box.length - 1 && (Integer.parseInt(box[i]) < Integer.parseInt(box[i + 1]) && Integer.parseInt(box[i]) < stackNum)) {
					temp.add(Integer.parseInt(box[i]));
					tempNum = Integer.parseInt(box[i]);
					i++;
					temp3 = true;
				}
				if((temp.size() == stack.size() && tempNum < stackNum) || temp.size() > stack.size()) {
					int temp2 = temp.size();
					for(int j = 0; j<temp2; j++) {
						queue.add(temp.poll());
					}
				}else {
					int stack2 = stack.size();
					for(int j = 0; j<stack2; j++) {
						queue.add(stack.pop());
					}
				}
				temp.clear();
				stack.clear();
				if(temp3) {
					i--;
				}
			}
		}
		int ans = queue.size();
		for(int i = 0; i<ans; i++) {
			System.out.println(queue.pop());
		}
	}

}
