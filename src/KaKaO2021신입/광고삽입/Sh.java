package KaKaO2021신입.광고삽입;

import java.util.ArrayList;
import java.util.List;

public class Sh {


	public static void main(String[] args) {
		String play_time = "50:00:00";
		String adv_time = "49:00:00";
		
		String[] logs = {"49:00:00-50:00:00"};
		
		String answer = solution(play_time,adv_time,logs);

	}

	private static String solution(String play_time, String adv_time, String[] logs) {
		String answer = null;
		
		String[] temp = play_time.split(":");
		int play = Integer.parseInt(temp[0]) * 60 * 60 + Integer.parseInt(temp[1]) * 60 + Integer.parseInt(temp[2]);
		
		temp = adv_time.split(":");
		int adv = Integer.parseInt(temp[0]) * 60 * 60 + Integer.parseInt(temp[1]) * 60 + Integer.parseInt(temp[2]);
		
		List<Adv> startList = new ArrayList<>();

		for(String s : logs) {
			temp = s.split("-");
			String[] startTemp = temp[0].split(":");
			String[] endTemp = temp[1].split(":");
			
			int start = Integer.parseInt(startTemp[0]) * 60 * 60 + Integer.parseInt(startTemp[1]) * 60 + Integer.parseInt(startTemp[2]);
			int end = Integer.parseInt(endTemp[0]) * 60 * 60 + Integer.parseInt(endTemp[1]) * 60 + Integer.parseInt(endTemp[2]);
			
			startList.add(new Adv(start,end));
		}
		
		startList.sort((a1,a2)->{
			if(a1.start == a2.start) {
				return a1.play - a2.play;
			}
			return a1.start-a2.start;
		});
		
		int max = 0;
		int advStart = 0;
		for(int i=0; i<startList.size(); i++) {
			Adv tempAdv = startList.get(i);
			int start = tempAdv.start;
			int end = tempAdv.end;
			int total = 0;
			if(start+adv > play)
				break;
			if(start+adv > end)
				total = tempAdv.play;
			else
				total = adv;
			
			
			end = start+adv;
			
			for(int j=i-1; j>-1; j--) {
				Adv temp2Adv = startList.get(j);
				int prevEnd = temp2Adv.end;
				if(prevEnd > start) {
					if(prevEnd < end) {
						total += prevEnd-start;
					}
					else {
						total+=adv;
					}
				}
				else {
					startList.remove(j);
					i--;
				}
			}
			
			
			for(int j=i+1; j<startList.size(); j++) {
				Adv temp2Adv = startList.get(j);
				int nextStart = temp2Adv.start;
				int nextEnd = temp2Adv.end;
				if(nextStart < end) {
					if(nextEnd < end) {
						total += temp2Adv.play;
					}
					else {
						total+= end-nextStart;
					}
				}
				else {
					break;
				}
			}
			
			if(total > max) {
				max = total;
				advStart = start;
			}
			
			
		}
		
//		System.out.println(max);
//		System.out.println(advStart);
		
		String hms = changeHMS(advStart);
		System.out.println(hms);
		return answer;
	}

	private static String changeHMS(int advStart) {
		int h = advStart/3600;
		advStart %= 3600;
		int m = advStart/60;	
		int s = advStart % 60;
		
		String hms = "";
		
		if(0 < h && h < 10) {
			hms += "0"+String.valueOf(h)+":";
		}
		else if( h == 0) {
			hms += "00:";
		}
		else {
			hms += String.valueOf(h)+":";
		}
		
		if(0 < m && m < 10) {
			hms += "0"+String.valueOf(m)+":";
		}
		else if( m == 0) {
			hms += "00:";
		}
		else {
			hms += String.valueOf(m)+":";
		}
		
		if(0 < s && s < 10) {
			hms += "0"+String.valueOf(s);
		}
		else if( s == 0) {
			hms += "00";
		}
		else {
			hms += String.valueOf(s);
		}
		return hms;
	}

	
}

class Adv{
	int start;
	int end;
	int play;
	
	public Adv(int start, int end) {
		this.start = start;
		this.end = end;
		this.play = end-start;
	}
}
