package Day06.삼진법뒤집기;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(n>0){
            list.add(n % 3);
            n = n / 3;
        }
        int multi = 1;
        for(int i=0; i< list.size(); i++) {
        	answer += list.get(list.size()-1-i) * multi;
        	multi *= 3;
        }

        return answer;
    }
}
