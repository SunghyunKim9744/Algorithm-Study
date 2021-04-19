package KaKaO2019신입.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String[] solution(String[] record) {
        String[] answer = {};
        List<String> who = new ArrayList<>();
        List<String> what = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for(String key: record) {
        	String[] temp = key.split(" ");
        	if(temp[0].equals("Enter")) {
        		who.add(temp[1]);
        		what.add(temp[0]);
        		map.put(temp[1], temp[2]);
        	}else if(temp[0].equals("Leave")) {
        		who.add(temp[1]);
        		what.add(temp[0]);
        	}else {
        		map.put(temp[1], temp[2]);
        	}
        }
        answer = new String[who.size()];
        for(int i=0; i<who.size(); i++) {
        	if(what.get(i).equals("Enter")) {
        		answer[i] = map.get(who.get(i)) + "님이 들어왔습니다.";
        	}else {
        		answer[i] = map.get(who.get(i)) + "님이 나갔습니다.";
        	}
        }
        return answer;
    }

}
