package KaKaO2019신입.오픈채팅방;

import java.util.HashMap;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		String[] record = {};
		
		String[] answer = solution(record);

	}

	private static String[] solution(String[] record) {
		String[] answer = null;
		Map<String,String> uid = new HashMap<>();
		
		int answerCnt = 0;
		for(String s : record) {
			String id = s.split(" ")[1];
			
			if(s.contains("Enter")) {
				String nickname = s.split(" ")[2];
				uid.put(id,nickname);
			}
			else if(s.contains("Change")) {
				
				String nickname = s.split(" ")[2];
				uid.put(id,nickname);
				answerCnt--;
			}
			answerCnt++;
		}
		
		answer = new String[answerCnt];
		int i=0;
		for(String s : record) {
			String userId = s.split(" ")[1];
			if(s.contains("Enter")) 
				answer[i++] = uid.get(userId)+"님이 들어왔습니다.";
			
			else if(s.contains("Leave")) 
				answer[i++] = uid.get(userId)+"님이 나갔습니다.";
			
			
		}
		return answer;
	}

}
