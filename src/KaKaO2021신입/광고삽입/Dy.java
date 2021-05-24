package KaKaO2021신입.광고삽입;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Dy {

	public static void main(String[] args) {
		String p = "50:00:00";
		String a = "3:00:00";
		String[] l = {"1:00:00-02:00:00","01:00:00-02:00:00","01:00:00-02:00:00"};
		System.out.println(solution(p,a,l));
	}
	
	public static String solution(String play_time, String adv_time, String[] logs) {
        String answer = "";
        String[] play = play_time.split(":");
        int playTime = Integer.parseInt(play[0]) * 3600 + Integer.parseInt(play[1]) * 60 + Integer.parseInt(play[2]);
        String[] adv = adv_time.split(":");
        int advTime = Integer.parseInt(adv[0]) * 3600 + Integer.parseInt(adv[1]) * 60 + Integer.parseInt(adv[2]);
        
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        Arrays.sort(logs);
        int logIndex = 0;
        int logIndex2 = 0;
        String[] temp1 = logs[0].split("-");
        String[] temp2 = temp1[0].split(":");
        String[] temp3 = temp1[1].split(":");
        
        int startTime = Integer.parseInt(temp2[0]) * 3600 + Integer.parseInt(temp2[1]) * 60 + Integer.parseInt(temp2[2]);
        int endTime = Integer.parseInt(temp3[0]) * 3600 + Integer.parseInt(temp3[1]) * 60 + Integer.parseInt(temp3[2]);
        int time = 0;
        int beforeStart = startTime + advTime;
        int beforeEnd = endTime + advTime;
        int adTime = 0;
        int maxTime = 0;
        int maxTimePoint = 0;
        while(time != playTime) {
        	while(time == startTime) {
        		logIndex++;
        		queue1.add(endTime);
        		if(logIndex == logs.length) {
        			startTime = -1;
        			break;
        		}
        		String[] log1 = logs[logIndex].split("-");
                String[] log2 = log1[0].split(":");
                String[] log3 = log1[1].split(":");
                startTime = Integer.parseInt(log2[0]) * 3600 + Integer.parseInt(log2[1]) * 60 + Integer.parseInt(log2[2]);
                endTime = Integer.parseInt(log3[0]) * 3600 + Integer.parseInt(log3[1]) * 60 + Integer.parseInt(log3[2]);
        	}
        	while(time == beforeStart) {
        		
        		logIndex2++;
        		if(logIndex2 == logs.length) {
        			beforeStart = -1;
        			break;
        		}
        		queue2.add(beforeEnd);
        		String[] log1 = logs[logIndex2].split("-");
                String[] log2 = log1[0].split(":");
                String[] log3 = log1[1].split(":");
                beforeStart = Integer.parseInt(log2[0]) * 3600 + Integer.parseInt(log2[1]) * 60 + Integer.parseInt(log2[2]) + advTime;
                beforeEnd = Integer.parseInt(log3[0]) * 3600 + Integer.parseInt(log3[1]) * 60 + Integer.parseInt(log3[2]) + advTime;
        	}
        	
        	
        	while(!queue1.isEmpty() && queue1.peek() == time) {
        		queue1.poll();
        	}
        	
        	while(!queue2.isEmpty() && queue2.peek() == time) {
        		queue2.poll();
        	}
        	adTime = adTime + queue1.size() - queue2.size();
        	if(adTime > maxTime) {
        		maxTime = adTime;
        		if(time - advTime +1 > 0) {
            		maxTimePoint = time - advTime +1;
        		}
        	}
        	time++;
        }
        int H = maxTimePoint / 3600;
        int M = (maxTimePoint % 3600) / 60;
        int S = maxTimePoint % 60;
        
        StringBuilder sb = new StringBuilder();
        
        if(H < 10) {
        	sb.append(0);
        	sb.append(H);
        }else {
        	sb.append(H);
        }
        sb.append(":");
        if(M < 10) {
        	sb.append(0);
        	sb.append(M);
        }else {
        	sb.append(M);
        }
        sb.append(":");
        if(S < 10) {
        	sb.append(0);
        	sb.append(S);
        }else {
        	sb.append(S);
        }
        answer = sb.toString();
        return answer;
    }

}
