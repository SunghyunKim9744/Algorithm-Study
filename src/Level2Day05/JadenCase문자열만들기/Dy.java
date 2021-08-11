package Level2Day05.JadenCase문자열만들기;

public class Dy {

	public static void main(String[] args) {
		
		String s = " adgagd 3eagdag";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
        String answer = "";
        s = s.replaceAll(" +", " ");
        
        String[] s2 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String key: s2) {
        	try {
				Integer.parseInt(key.substring(0,1));
				sb.append(key.toLowerCase());
				sb.append(" ");
			} catch (Exception e) {
				
				sb.append(key.substring(0,1).toUpperCase());
				sb.append(key.substring(1).toLowerCase());
				sb.append(" ");
			}
        }
        answer = sb.toString().trim();
        return answer;
    }

}
