package KaKaO2021신입.신규아이디추천;

public class Sh {

	
	public static void main(String[] args) {
		String new_id = "....!@BaT#*..y.abcdefghijklm";
		
		String answer = solution(new_id);

	}

	// 7:17 ~ 7:26
	private static String solution(String new_id) {
		
		String str = new_id.toLowerCase();
		
		str = str.replaceAll("[^a-z0-9-_.]", "");
		
		while(str.contains("..")) {
			str = str.replace("..", ".");
		}
		
		if(str.startsWith("."))
			str = str.substring(1);
		if(str.endsWith("."))
			str = str.substring(0,str.length()-1);
		
		if(str.isBlank())
			str +="a";
		
		if(str.length() >= 16) {
			str = str.substring(0,15);
			if(str.endsWith("."))
				str = str.substring(0,str.length()-1);
		}
		
		while(str.length()<3)
			str += str.substring(str.length()-1,str.length());
		return str;
	}

}
