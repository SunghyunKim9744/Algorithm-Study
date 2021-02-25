package Day05.평균구하기;

public class Dy {

	public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int key: arr)
            sum += key;
        answer = sum / arr.length;
        return answer;
    }
}
