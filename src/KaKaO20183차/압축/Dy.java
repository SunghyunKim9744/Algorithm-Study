package KaKaO20183차.압축;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solution(String msg) {
        int[] answer = {};
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] divAlpa = alpa.split("");
        for(int i=0; i<alpa.length(); i++){
            map.put(divAlpa[i],i+1);
        }
        String[] divMsg = msg.split("");
        int index = 27;
        for(int i=0; i<msg.length(); i++){
            int temp = 1;
            int temp2 = 0;
            int temp3 = -1;
            StringBuilder sb = new StringBuilder();
            sb.append(divMsg[i]);
            while(map.get(sb.toString()) != null){
                temp2 = map.get(sb.toString());
                temp3++;
                if(i + temp > msg.length() - 1)
                    break;
                sb.append(divMsg[i+temp]);
                temp++;
            }
            map.put(sb.toString(),index);
            index++;
            i += temp3;
            list.add(temp2);
        }
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
