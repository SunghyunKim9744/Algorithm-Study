package D_1228.프로그래머스_셔틀버스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		int n = 2;
		int t = 1;
		int m = 2;
		String[] timetable = {"00:01", "00:01", "00:01","00:01", "00:01", "00:02", "00:03", "00:04"};
		
		String answer = solution(n,t,m,timetable);
		System.out.println(answer);

	}

	// 버스에 자리가 있다면 버스 오는 시간이 가장 늦은 시간
	// 자리가 없다면 한개씩 갱신
	// 끝까지 갔는데 못탔다면 가장 먼저 온 사람 -1분 먼저 타기
	private static String solution(int n, int t, int m, String[] timetable) {
		
		String answer = "";
		int rideTime = -1;
		int lastRider = -1;
		
		List<Integer> times = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
	
		for(String time : timetable) {
			String[] temp = time.split(":");
			int crewTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
			if(crewTime <= 18*60) {
				if(!map.containsKey(crewTime))
					times.add(crewTime);
				map.put(crewTime, map.getOrDefault(crewTime, 0)+1);
			}
		}
		
		Collections.sort(times);
//		System.out.println(times);
//		System.out.println(map);
		int[] shutleBusTimes = new int[n];
		int startTime = 9*60;
		for(int i=0; i<n; i++) {
			shutleBusTimes[i] = startTime + i*t; 
		}
		
		int startTimesIdx = 0;
		for(int shutleBusTime : shutleBusTimes) {
			int personCnt = m;
			for(int i=startTimesIdx; i<times.size(); i++) {
				int time = times.get(i);
				if(time <= shutleBusTime) {
					int sameTimePersonCnt = map.get(time);
					lastRider = time;
					if(sameTimePersonCnt > personCnt) {
						map.put(time, sameTimePersonCnt - personCnt);
						startTimesIdx = i;
						personCnt = 0;
						break;
					}
					else
						personCnt -= sameTimePersonCnt;
					
					if(personCnt > 0) {
						rideTime = time;
					}
				}
				else {
					startTimesIdx = i;
					break;
				}
			}
			if(personCnt > 0) {
				rideTime = shutleBusTime;
			}
		}
		
		if(rideTime == -1) {
			rideTime = lastRider-1;
		}
		
		answer = numberToHour(rideTime);
		return answer;
	}

	private static String numberToHour(int rideTime) {
		int hour = rideTime / 60;
		String hourString = String.valueOf(hour);
		if(hour < 10)
			hourString = "0"+hourString;
		
		int minute = rideTime % 60;
		String minuteString = String.valueOf(minute);
		if(minute < 10)
			minuteString = "0"+minuteString;
		
		return hourString+":"+minuteString;
	}

}
