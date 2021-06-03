package Level2Day05.방문길이;

import java.util.HashSet;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {
		String s = "LULLLLLLU";
		System.out.println(solution(s));

	}

	private static int solution(String dirs) {
        int answer = 0;
        String[] s = dirs.split("");
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        for(String key: s) {
        	StringBuilder sb = new StringBuilder();
        	StringBuilder sb2 = new StringBuilder();
        	int x1 = x;
        	int y1 = y;
        	sb.append(x);
        	sb.append(y);
        	if(key.equals("U") && y < 5) {
        		y++;
        	}else if(key.equals("D") && y > -5) {
        		y--;
        	}else if(key.equals("R") && x < 5) {
        		x++;
        	}else if(key.equals("L") && x > -5) {
        		x--;
        	}
        	sb.append(x);
        	sb.append(y);
        	sb2.append(x);
        	sb2.append(y);
        	sb2.append(x1);
        	sb2.append(y1);
        	if(x1 != x || y1 !=y) {
            	set.add(sb.toString());
            	set.add(sb2.toString());
        	}
        }
        answer = set.size()/2;
        return answer;
    }

}
