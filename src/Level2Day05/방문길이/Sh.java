package Level2Day05.방문길이;

import java.util.HashSet;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String dirs = "ULURRDLLLU";
		
		int answer = solution(dirs);

	}

	private static int solution(String dirs) {
		int answer = 0;
        Set<String> set = new HashSet<>();
        int[][] location = new int[11][11];
        int x = 5;
        int y = 5;
        
        String[] keys = dirs.split("");
        
        for(String key : keys){
            int currentX = x;
            int currentY = y;
            String currentXY = String.valueOf(x)+String.valueOf(y);
            if(key.equals("U"))
                x--;
            else if(key.equals("D"))
                x++;
            else if(key.equals("L"))
                y--;
            else if(key.equals("R"))
                y++;
            
            if(x < 0 || x>10 || y<0 || y>10){
                x = currentX;
                y = currentY;
                continue;
            }
            
            String nextXY = String.valueOf(x)+String.valueOf(y);
            set.add(currentXY+nextXY);
            set.add(nextXY+currentXY);
            
        
        }
        answer = set.size()/2;
        return answer;
	}

}
