package Level2Day03.멀쩡한사각형;

public class Dy {

	public static void main(String[] args) {

		int w = 8;
		int h = 12;
		System.out.println(solution(w, h));
	}
	
	public static long solution(int w, int h) {
		long answer = (long) w * h;
        if(w > h) {
        	int temp = w;
        	w = h;
        	h = temp;
        }
        for(long i=0; i<w; i++) {
        	long a = h * (i+1);
        	long b = h * i;
        	answer = (long) (answer - (Math.ceil((double) a / w) - Math.floor((double) b / w)));
        }
        return answer;
    }

}
