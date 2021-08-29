
public class Main {

	public static void main(String[] args) {
		String[] str = { "FLOAT","BOOL","BOOL","BOOL","INT","SHORT" };

		// 16
		// #.##....,########,####....,########,########
		String answer = solution(str);

	}

	private static String solution(String[] str) {
		String answer = "";

		StringBuilder sb = new StringBuilder();

		int cnt = 1;

		for(int i=0; i<str.length; i++) {
			String s = str[i];
			if (s.equals("BOOL")) {
				sb.append("#");
				cnt++;
			}

			else if (s.equals("SHORT")) {
				if(cnt > 7) {
					sb.append(".,##");
					cnt = 3;
				}
				else {
					if(cnt % 2 == 0) {
						sb.append(".##");
						cnt+=3;
					}
					else {
						sb.append("##");
						cnt+=2;
					}
				}
			}

			else if (s.equals("FLOAT")) {
				
				if(cnt == 1 || cnt == 5) {
					sb.append("####");
					cnt+=4;
				}
				else if(cnt > 5) {
					for(int j=cnt; j<9; j++) {
						sb.append(".");
					}
					sb.append(",####");
					cnt = 5;
				}
				else {
					for(int j=cnt; j<5; j++) {
						sb.append(".");
					}
					sb.append("####");
					cnt = 9;
				}
			}

			else if (s.equals("INT")) {
				if(cnt == 1) {
					sb.append("########");
					cnt = 9;
				}
				else {
					for(int j=cnt; j<9; j++) {
						sb.append(".");
					}
					sb.append(",########");
					cnt=9;
				}
			}
			
			else {
				if(cnt == 1) {
					sb.append("########,########");
					cnt = 9;
				}
				else {
					for(int j=cnt; j<9; j++) {
						sb.append(".");
					}
					sb.append(",########,########");
					cnt=9;
				}
			}
			
			if(i != str.length-1 && cnt >=9) {
				sb.append(",");
				cnt = 1;
			}
			
			if(sb.length() >= 128+128/8) {
				answer = "No";
				System.out.println(answer);
				break;
			}
				
		}
		
		if(cnt != 9) {
			for(int i=cnt; i<9; i++)
				sb.append(".");
		}
		answer = sb.toString();
		System.out.println(answer);
		return answer;
	}

}
