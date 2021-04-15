package KaKaO2018신입.셔틀버스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dy {

	public static void main(String[] args) {

		int i1 = 3;
		int i2 = 1;
		int i3 = 2;
		String[] s1 = {"09:00", "09:00", "09:00", "09:00", "09:00"};
		
		solution(i1,i2,i3,s1);
	}
	
	private static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        List<Integer> times = new ArrayList<>();
        for(int i=0; i<timetable.length; i++) {
        	String[] temp = timetable[i].split(":");
        	int temp2 = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        	times.add(temp2);
        }
        
        Collections.sort(times);
        int ans = 0;
        int time = 540;
        Queue<Integer> wait = new LinkedList<>();
        while(n > 0) {
        	int busSize = m;
        	for(int i=0; i<times.size(); i++) {
        		if(times.get(i) <= time) {
        			wait.add(times.get(i));
        			times.remove(i);
        			i--;
        		}else {
        			break;
        		}
        	}
        	
        	if(n != 1) {
        		for(int i = busSize; i>0; i--) {
        			if(!wait.isEmpty()) {
        				wait.poll();
        			}
        		}
        	}else {
        		for(int i = busSize; i>0; i--) {
        			if(i == 1) {
        				if(wait.isEmpty()) {
        					ans = time;
        				}else {
        					ans = wait.poll() -1;
        				}
        			}

        			if(!wait.isEmpty()) {
        				wait.poll();
        			}
        		}
        	}
        	time += t;
        	n--;

        }
        String ans1 = "";
        String ans2 = "";
        int temp1 = ans / 60;
        int temp2 = ans % 60;
        if(temp1 < 10) {
        	ans1 = "0" + temp1;
        }else {
        	ans1 = temp1+"";
        }
        
        if(temp2 < 10) {
        	ans2 = "0" + temp2;
        }else {
        	ans2 = temp2+"";
        }
        answer = ans1+":"+ ans2;
        System.out.println(answer);
        return answer;
    }

}
