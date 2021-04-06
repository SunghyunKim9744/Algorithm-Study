package KaKaO2019WinterIntern.호텔방배정;

import java.util.ArrayList;
import java.util.List;

public class Dy {

public static void main(String[] args) {
		
		long k = 10;
		long[] rn = {1,3,4,1,3,1};
		
		System.out.println(solution(k, rn));

	}

	private static long[] solution(long k, long[] room_number) {
        long[] answer = {};
        List<Long> list = new ArrayList<>();
        for(long key: room_number) {
        	long temp = key;
        	while(list.contains((Long)temp)) {
        		temp++;
        	}
        	list.add(temp);
        }
        
        answer = new long[list.size()];
        
        for(int i = 0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

}
