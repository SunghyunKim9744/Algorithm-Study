package KaKaO2019WinterIntern.호텔방배정;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dy {

public static void main(String[] args) {
		
		long k = 10;
		long[] rn = {1,3,4,1,3,1};
		
		System.out.println(solution(k, rn));

	}

//	private static long[] solution(long k, long[] room_number) {
//        long[] answer = {};
//        List<Long> list = new ArrayList<>();
//        for(long key: room_number) {
//        	long temp = key;
//        	while(list.contains((Long)temp)) {
//        		temp++;
//        	}
//        	list.add(temp);
//        }
//        
//        answer = new long[list.size()];
//        
//        for(int i = 0; i<list.size(); i++) {
//        	answer[i] = list.get(i);
//        }
//        
//        return answer;
//    }

	private static long[] solution(long k, long[] room_number) {
        long[] answer = {};
        answer = new long[room_number.length];
        List<Long> list = new ArrayList<>();
        list.add(room_number[0]);
        answer[0] = room_number[0];
        for(int i=1; i<room_number.length; i++) {
        	for(int j=0; j<list.size(); j++) {
            	if(room_number[i]<list.get(j)) {
            		
            	}
            		
            }
        }
        
        return answer;
    }
	
}
