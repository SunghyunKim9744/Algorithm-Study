package Day03.수박수박수박수박수박수;

public class Dy {

	public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                sb.append("수");
            }else{
                sb.append("박");
            }
        }
        answer = sb.substring(0);
        
        return answer;
    }
}
