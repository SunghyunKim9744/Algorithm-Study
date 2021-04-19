package KaKaO2019신입.무지의먹방라이브;

public class Dy {

	public static void main(String[] args) {

		int[] f = {1,1,1,1};
		long k = 4;
		System.out.println(solution(f, k));

	}
	
	public static int solution(int[] food_times, long k) {
        int answer = 0;
        long cycle = k / food_times.length; 
        long remain = k % food_times.length;
        long zeroLength = 0;
        while(cycle != 0) {
	        for(int i=0; i<food_times.length; i++) {
	        	if(food_times[i] != 0 && food_times[i] <= cycle) {
	        		zeroLength++;
	        		remain = remain + cycle - food_times[i];
	        		food_times[i] = 0;
	        	}else {
	        		food_times[i] -= cycle;
	        	}
	        }
	        if(zeroLength == food_times.length)
	        	return -1;
	        cycle = remain / (food_times.length - zeroLength); 
	        remain = remain % (food_times.length - zeroLength);
        }
        
        for(int i=0; i<food_times.length; i++) {
        	if(food_times[i] !=0 ) {
        		if(remain == 0) {
            		answer = i+1;
            	}
        		remain--;
        	}
        }
        System.out.println(answer);
        return answer;
    }

}
