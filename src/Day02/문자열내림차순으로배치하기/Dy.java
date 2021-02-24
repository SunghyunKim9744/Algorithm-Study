package Day02.문자열내림차순으로배치하기;

public class Dy {

	public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int bigCnt = 0;
        int smallCnt = 0;
        for(char key: charArray){
            if(65<=key && key<= 90){
                bigCnt++;
            }else{
                smallCnt++;
            }
        }

        char[] big = new char[bigCnt];
        char[] small = new char[smallCnt];
        
        bigCnt = 0;
        smallCnt = 0;
        
        for(char key: charArray){
            if(65<=key && key<= 90){
                big[bigCnt] = key;
                bigCnt++;
            }else{
                small[smallCnt] = key;
                smallCnt++;
            }
        }
        
        for(int i = 0; i<small.length-1; i++){
            for(int j=0; j<small.length-1-i; j++){
                if(small[j]<small[j+1]){
                    char temp = small[j];
                    small[j] = small[j+1];
                    small[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i<big.length-1; i++){
            for(int j=0; j<big.length-1-i; j++){
                if(big[j]<big[j+1]){
                    char temp = big[j];
                    big[j] = big[j+1];
                    big[j+1] = temp;
                }
            }
        }
        
        String smallString = String.valueOf(small);
        String bigString = String.valueOf(big);
        
        answer = smallString + bigString;
        
        return answer;
    }
}
