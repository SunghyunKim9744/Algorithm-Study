package KaKaO20183차.압축;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(String msg) {
        int[] answer = {};
        Map<String,Integer> map = new HashMap<>();
        
        int lastNum = 27;
        for(int i=0; i<26; i++){
            char ch = (char)('A'+i);
            map.put(String.valueOf(ch),i+1);
        }
       
        List<Integer> list = new ArrayList<>();
        int w = 1;
        while(!msg.isEmpty()){
            
            int startI = w > msg.length() ? msg.length() : w;
            for(int i=startI; i>0; i--){
                String temp = msg.substring(0,i);
                if(map.containsKey(temp)){
                    list.add(map.get(temp));
    
                    if(msg.length() <= temp.length()){
                        msg = "";
                    }
                        
                    else{
                        temp = msg.substring(0,i+1);
                        msg = msg.substring(i);
                        map.put(temp,lastNum++);
                        if(temp.length() > w)
                            w = temp.length();
                    }
                    break;
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }

}
