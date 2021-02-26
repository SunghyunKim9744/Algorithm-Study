package Day06.신규아이디추천;

public class Dy {

	public String solution(String new_id) {
        String answer = "";
        
        //1단계
        new_id = new_id.toLowerCase();
        
        //2단계
        new_id = new_id.replaceAll("[^a-z\\d-_.]", "");
        
        //3단계
        while(new_id.contains(".."))
        	new_id = new_id.replace("..", ".");
        
        //4단계
        if(!new_id.equals("") && new_id.substring(0,1).equals("."))
        	new_id = new_id.substring(1);
        
        if(!new_id.equals("") && new_id.substring(new_id.length()-1).equals("."))
        	new_id = new_id.substring(0,new_id.length()-1);
        
        //5단계
        if(new_id.equals(""))
        	new_id = "a";
        
        //6단계
        if(new_id.length()>15)
        	new_id = new_id.substring(0, 15);
        
        if(new_id.substring(new_id.length()-1).equals("."))
        	new_id = new_id.substring(0,new_id.length()-1);
        
        //7단계
        while(new_id.length()<3)
        	new_id += new_id.substring(new_id.length()-1);
        	
        answer = new_id;
        return answer;
    }
}
