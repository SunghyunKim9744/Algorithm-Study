package Day2.문자열내p와y의개수;

public class Dy {

	boolean solution(String s) {
        boolean answer = true;
        String[] temp = s.split("");
        int pSize = 0;
        int ySize = 0;
        
        for(int i = 0; i<temp.length; i++){
            if(temp[i].equals("p") || temp[i].equals("P"))
                pSize++;
            if(temp[i].equals("y") || temp[i].equals("Y"))
                ySize++;
        }
        
        if(pSize != ySize)
            answer = false;
        
        return answer;
    }
}
