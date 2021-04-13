package KaKaO2018신입.캐시;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		int answer = solution(cacheSize,cities);
	}

	// 2:41
	private static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> cacheQueue = new LinkedList<>();
		
		if(cacheSize == 0)
			return cities.length*5;
		for(String str : cities) {
			String city = str.toLowerCase();
			if(cacheQueue.contains(city)) {
				answer+=1;
				cacheQueue.remove(city);
				cacheQueue.offer(city);
			}
			else {
				if(cacheQueue.size() < cacheSize) {
					answer +=5;
					cacheQueue.offer(city);
				}
				else {
					answer +=5;
					cacheQueue.poll();
					cacheQueue.offer(city);
				}
				
			}
			
		}
		return answer;
	}

}
