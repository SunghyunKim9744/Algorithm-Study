package Level2Day03.멀쩡한사각형;

public class Dy {

	public static void main(String[] args) {

		String n = "abcdefghijklmn.p";
		solution(n);
	}
	
	public static String solution(String new_id) {
        String answer = "";
        
        String temp = new_id.toLowerCase();
        
        temp = temp.replaceAll("[^a-z0-9-_.]", "");

        String[] temp2 = temp.split("");
        
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i=0; i<temp2.length; i++) {
        	if(temp2[i].equals(".")) {
        		num++;
        	}else {
        		if(num > 0) {
        			sb.append(".");
        			num = 0;
        		}
        		sb.append(temp2[i]);
        	}
        }
        
        temp = sb.toString();
        if(!temp.equals("")) {
            if(temp.substring(0,1).equals(".")) {
            	temp = temp.substring(1, temp.length());
            }
            
            if(temp.substring(temp.length()-1, temp.length()).equals(".")) {
            	temp = temp.substring(temp.length()-1, temp.length());
            }
        }else {
        	temp = "a";
        }
        
        if(temp.length() > 15) {
        	temp = temp.substring(0,15);
            if(temp.substring(14,15).equals(".")) {
            	temp = temp.substring(0,14);
            }
        }
        answer = temp;
        StringBuilder sb2 = new StringBuilder(temp);
        String last = "";
        if(temp.length() < 3) {
        	last = temp.substring(temp.length()-1, temp.length());

            for(int i = temp.length(); i<3; i++) {
            	sb2.append(last);
            }

            answer = sb2.toString();
        }
        
        return answer;
    }

}
