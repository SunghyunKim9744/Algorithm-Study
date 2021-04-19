package KaKaO20183차.파일명정렬;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        Arrays.sort(files,(s1,s2)->{
            s1 = s1.toUpperCase();
            s2 = s2.toUpperCase();
            String s1Head = "";
            String s2Head = "";
            int s1Num = 0;
            int s2Num = 0;
            int firstS1Num = 0;
            int firstS2Num = 0;
            for(int i=0; i<s1.length(); i++){
                char ch = s1.charAt(i);
                if('0' <= ch && ch <= '9' && firstS1Num == 0){
                    s1Head = s1.substring(0,i);
                    firstS1Num = i;
                }
                if(!('0' <= ch && ch <= '9') && firstS1Num != 0){
                    s1Num = Integer.parseInt(s1.substring(firstS1Num,i));
                   
                    break;
                }
                if(i==s1.length()-1)
                	s1Num = Integer.parseInt(s1.substring(firstS1Num));
               
            }
            
            for(int i=0; i<s2.length(); i++){
                char ch = s2.charAt(i);
                if('0' <= ch && ch <= '9' && firstS2Num == 0){
                    s2Head = s2.substring(0,i);
                    firstS2Num = i;
                }
                if(!('0' <= ch && ch <= '9') && firstS2Num != 0){
                    s2Num = Integer.parseInt(s2.substring(firstS2Num,i));              
                    break;
                }
                if(i==s2.length()-1)
                	s2Num = Integer.parseInt(s2.substring(firstS2Num));
                
            }
            
            if(s1Head.equals(s2Head)){
            
                return s1Num-s2Num;
            }
            else{
                return s1Head.compareTo(s2Head);
            }
        });
        
        return files;
    }

}
