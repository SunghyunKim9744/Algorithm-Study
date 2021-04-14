package KaKaO2018신입.셔틀버스;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Sh {

	public static void main(String[] args) {
		int n = 1; 
		int t = 1; 
		int m = 5; 
		String[] timetable = {"00:01", "00:01", "00:01", "00:01", "00:01"};
		
		String answer = solution(n,t,m,timetable);

	}

	private static String solution(int n, int t, int m, String[] timetable) {
		String answer = "";
		LinkedHashMap<String,Integer> busMap = new LinkedHashMap<>();
        busMap.put("0900",m);
        String key1 = "0900";
        for(int i=0; i<n-1; i++){
            int hour = Integer.parseInt(key1.substring(0,2));
            int min = Integer.parseInt(key1.substring(2,4));
            min += t;
            if(min >= 60){
                hour++;
                min -=60;
            }
            key1 = String.valueOf(hour);
            if(hour < 10)
                key1 = "0"+key1;
            if(min < 10)
                key1 += "0"+String.valueOf(min);
            else
                key1 +=String.valueOf(min);
            busMap.put(key1,m);
        }
        Arrays.sort(timetable);
      
        String lastTime = "";
        for(String s : timetable){
            int cruHour = Integer.parseInt(s.substring(0,2));
            int curMin = Integer.parseInt(s.substring(3,5));
            for(String key : busMap.keySet()){
                int hour = Integer.parseInt(key.substring(0,2));
                int min = Integer.parseInt(key.substring(2,4));
                if(cruHour == hour && curMin <=min && busMap.get(key)>0){
                    busMap.put(key,busMap.get(key)-1);
                    
                    if(busMap.get(key1)==0){
                        lastTime = cruHour+":"+curMin;
                        break;
                    }
                    break;
                }
                else if(cruHour<hour &&busMap.get(key)>0){
                    busMap.put(key,busMap.get(key)-1);
                    
                    if(busMap.get(key1)==0){
                        lastTime = cruHour+":"+curMin;
                        break;
                    }
                    break;
                }
            }
        }
        
        if(lastTime.isEmpty()) {
        	answer = key1.substring(0,2)+":"+key1.substring(2);
   
        }
        else {
        	int h = Integer.parseInt(lastTime.split(":")[0]);
        	int m1 = Integer.parseInt(lastTime.split(":")[1]);
        	m1--;
        	if(m1 < 0) {
        		h--;
        		m1 +=60;
        	}
        	answer = String.valueOf(h)+":";
            if(h < 10)
            	answer = "0"+h+":";
            if(m1 < 10)
            	answer += "0"+String.valueOf(m1);
            else
            	answer +=String.valueOf(m1);
        }
        System.out.println(answer);
        return answer;
	}

}
