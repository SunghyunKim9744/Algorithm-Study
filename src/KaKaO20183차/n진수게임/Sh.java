package KaKaO20183차.n진수게임;

public class Sh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 2:22
	public String solution(int n, int t, int m, int p) {
        String answer = "";
        String[] answers = new String[m*t+1];
        answers[1] = "0";
        int i=2;
        int num=1;
        while(i<m*t+1){
            StringBuilder strb = new StringBuilder();
            int tempNum = num;
            while(tempNum > 0){
                int temp = tempNum % n;
                if(temp >= 10){
                    int temp2 = (temp-10) +'A';
                    char temp3 = (char)temp2;
                    strb.insert(0,temp3);
                }
                else{
                    strb.insert(0,temp);
                }
                tempNum /= n;
                
            }
            for(int j=0; j<strb.length(); j++){
                if(i == m*t+1)
                    break;
                answers[i++] = strb.toString().substring(j,j+1);
            }
            num++;
        }
        
         for(int j=0; j<t; j++)
             answer += answers[j*m+p];
        return answer;
    }

}
