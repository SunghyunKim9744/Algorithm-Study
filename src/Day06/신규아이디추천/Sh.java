package Day06.신규아이디추천;

public class Sh {

	
	public static void main(String[] args) {
		String new_id = "=.=";
		String answer = solution(new_id);

	}
	
	// 6:51 ~ 7:13
	// (0.18ms, 52.4MB) - > (6.85ms, 53.1MB)
	public static String solution(String new_id) {
        String answer = "";
        
     // ------------- 1단계 (대문자 -> 소문자)----------------
        new_id = new_id.toLowerCase(); 
        
     // ------------- 2단계 (숫자,알파벳,(.-_)만 사용가능----------------
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
     // ------------- 3단계 .이 2개 이상일경우 한개의 .으로만 표현----------------
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
     // ------------- 4단계 맨 앞이나 맨 뒤에 .이 있을 경우 삭제 ----------------
        if(new_id.length() != 0)
        	new_id = new_id.substring(0,1).equals(".") ? new_id.substring(1) : new_id;
        if(new_id.length() != 0)
        	new_id = new_id.substring(new_id.length()-1,new_id.length()).equals(".") ? new_id.substring(0,new_id.length()-1) : new_id;
        
     // ------------- 5단계 빈 문자열일 경우 a추가 ----------------
        new_id = new_id.length() == 0 ? new_id.concat("a") : new_id;
        
     // ------------- 6단계 길이가 16개이상일경우 15개까지로 제한, 제한 된 문자열의 마지막이 .일 경우 삭제-----------
        new_id = new_id.length() >= 16 ? new_id.substring(0,15) : new_id;
        new_id = new_id.substring(new_id.length()-1,new_id.length()).equals(".") ? new_id.substring(0,new_id.length()-1) : new_id;
        
     // ------------- 7단계 길이가 2이하일 때 길이가 3일 때 까지문자열의 마지막 문자를 추가----------------
        while(new_id.length() <= 2)
        	new_id += new_id.substring(new_id.length()-1,new_id.length());
        return new_id;
    }

	// (0.12ms, 52.8MB) - > (5.19ms, 52.5MB)
//	public static String solution(String new_id) {
//		String answer;
//
//        // ------------- 1단계 (대문자 -> 소문자)----------------
//        answer = new_id.toLowerCase(); 
//
//
//        // ------------- 2단계 (숫자,알파벳,(.-_)만 사용가능----------------
//        answer = answer.replaceAll("[^a-z0-9._-]", "");
//
//    
//
//        // ------------- 3단계 .이 2개 이상일경우 한개의 .으로만 표현----------------
//        while(answer.contains("..")) {
//            answer = answer.replace("..", ".");
//
//        }
//
//
///*      StringBuilder answer = new StringBuilder(third);
//        while(!(answer.length()==0) && (answer.substring(0,1).equals("."))|| (answer.substring(answer.length()-1,answer.length()).equals("."))) {
//                if(answer.substring(0,1).equals("."))
//                    answer.delete(0,1);
//                else
//                    answer.delete(answer.length()-1, answer.length());
//                if(answer.length()==0)
//                    break;
//        }
//        */
//
//        // ------------- 4단계 맨 앞이나 맨 뒤에 .이 있을 경우 삭제 ----------------
//        while(!(answer.length()==0) && (answer.startsWith(".")|| answer.endsWith("."))) {
//                if(answer.startsWith("."))
//                    answer = answer.replaceFirst(".","");
//                else if(answer.endsWith("."))
//                    answer = answer.substring(0,answer.length()-1);
//                if(answer.length()==0)
//                    break;
//        }
//  
//
//        // ------------- 5단계 빈 문자열일 경우 a추가 ----------------
//        if(answer.equals("")) 
//            answer = answer.concat("a");
//
//   
//
//
//        // ------------- 6단계 길이가 16개이상일경우 15개까지로 제한, 제한 된 문자열의 마지막이 .일 경우 삭제---------------- 
//         if(answer.length()>=16) { 
//             answer = answer.substring(0,15);
//             if(answer.endsWith(".")) 
//                 answer = answer.substring(0,answer.length()-1);
//         }
// 
//
//
//        // ------------- 7단계 길이가 2이하일 때 길이가 3일 때 까지문자열의 마지막 문자를 추가----------------
//         while(answer.length()<=2) {
//             answer = answer.concat(
//                     answer.substring(
//                        answer.length()-1,answer.length()));
//         }
//        return answer;
//    }
}
