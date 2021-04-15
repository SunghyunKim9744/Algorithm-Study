package KaKaO20183차.n진수게임;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(int n, int t, int m, int p) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int num = 0;
        while(true){
            int temp = num;
            Stack<Integer> stack = new Stack<>();
            while(temp > 0){
                stack.add(temp%n);
                temp /= n;
            }
            int temp2 = stack.size();
            for(int i=0; i<temp2; i++){
                list.add(stack.pop());
            }
            num++;
            if(list.size() > t*m)
                break;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            if(i % m ==(p-1)){
                if(sb.length() == t){
                    break;
                }
                if(list.get(i) < 10){
                    sb.append(list.get(i));
                }else if(list.get(i) == 10){
                    sb.append("A");
                }else if(list.get(i) == 11){
                    sb.append("B");
                }else if(list.get(i) == 12){
                    sb.append("C");
                }else if(list.get(i) == 13){
                    sb.append("D");
                }else if(list.get(i) == 14){
                    sb.append("E");
                }else if(list.get(i) == 15){
                    sb.append("F");
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}
