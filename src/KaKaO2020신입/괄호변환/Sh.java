package KaKaO2020신입.괄호변환;

public class Sh {

	public static void main(String[] args) {
		String p = "()))((";
		
		String answer = solution(p);

	}

	private static String solution(String p) {
		String answer = "";
		
		answer = recu(p);
		System.out.println(answer);
		return answer;
	}

	private static String recu(String p) {
		
		if(p.isEmpty())
			return "";
		
		String[] strs = separation(p);
		String u = strs[0];
		
		
		String v = strs[1];
		
		
		if(checkU(u)) {	// 올바른 문자열
			System.out.println("올바른 u : " + u);
			u = u+recu(v);
			
			return u;
		}
		else {			// 올바른 문자열 X
			System.out.println("올바르지않은 u : " + u);
			String temp = "(" + recu(v) +")";
			
			String s = "";
			
			if(u.length()>2) {
				u = u.substring(1,u.length()-1);
				
				for(int i=0; i<u.length(); i++) {
					String t = u.substring(i,i+1);
					if(t.equals("("))
						s+=")";
					else
						s+="(";
				}
			}
			
			return temp+s;
			
		}
		
	}

	private static boolean checkU(String u) {
		int cnt = 0;
		for(int i=0; i<u.length(); i++) {
			char ch = u.charAt(i);
			if(ch=='(')
				cnt++;
			else
				cnt--;
			if(cnt < 0)
				return false;
		}
		return true;
	}

	private static String[] separation(String p) {
		int left = 0;
		int right = 0;
		String[] strs = new String[2];
		for(int i=0; i<p.length(); i++) {
			char ch = p.charAt(i);
			if(ch=='(')
				left++;
			else
				right++;
			if(left == right) {
				String u = p.substring(0,i+1);
				String v = "";
				if(i+1 < p.length())
					v = p.substring(i+1);
				
				strs[0] = u;
				strs[1] = v;
				break;
			}
		}
		return strs;
	}

}
