package KaKaO2019WinterIntern.호텔방배정;

import java.util.HashMap;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		long k = 10;
		long[] room_number = {1,3,4,1,3,1};
		
		long[] answer = solution(k,room_number);

	}

//	private static long[] solution(long k, long[] room_number) {
//		long[] answer = new long[room_number.length];
//		Set<Long> use_room = new HashSet<>();
//		int index = 0;
//		for(long l : room_number) {
//			if(!use_room.contains(l)) {
//				answer[index++] = l;
//				use_room.add(l);
//			}
//			else {
//				for(long i = l; i<=k; i++) {
//					if(!use_room.contains(i)) {
//						answer[index++] = i;
//						use_room.add(i);
//						break;
//					}
//				}
//			}
//			
//		}
//		
//		
//		return answer;
//	}

	private static long[] solution(long k, long[] room_number) {
		long[] answer = new long[room_number.length];
		Map<Long,Long> map = new HashMap<>();
		
		int index = 0;
		for(Long l : room_number) {
			if(!map.containsKey(l)) {
				map.put(l,(long) 1);
				answer[index++] = l;
			}
			else {
				long min = 0;
				for(Long l2 : map.keySet()) {
					if(l2 <=l) {
						min+= map.get(l2);
					}
				}
				map.put(l, map.get(l)+1);
				for(long i = min; min<=k; i++) {
					if(!map.containsKey(i)) {
						map.put(i, (long) 1);
						answer[index++] = i;
						break;
					}
				}
			}
		}
		
//		for(long l : answer)
//			System.out.println(l);
		return answer;
	}
	
}
