package D_1228.프로그래머스_파일명정렬;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		
		String[] files = {"A1","B1"};
		
		String[] answer = solution(files);

	}

	private static String[] solution(String[] files) {
		
		Arrays.sort(files, (f1,f2)->{
			String[] tempF1 = seprate((String) f1);
			String[] tempF2 = seprate((String) f2);
			String f1Head = tempF1[0];
			String f2Head = tempF2[0];
			
			int f1Number = Integer.parseInt(tempF1[1]);
			int f2Number = Integer.parseInt(tempF2[1]);
			if(f1Head.compareToIgnoreCase(f2Head) == 0) {
				return f1Number-f2Number;
			}
			return f1Head.compareToIgnoreCase(f2Head);
		});
		
		return files;
	}

	private static String[] seprate(String fileName) {
		char[] chars = fileName.toCharArray();
		String[] temp = new String[2];
		int headEndIdx = 0;
		int numberEndIdx = chars.length;
		
		boolean isEndHead = false;
		
		for(int i=0; i<chars.length; i++) {
			if(!isEndHead) {
				if(0 <= chars[i]-'0' && chars[i]-'0' <= 9) {
					isEndHead = true;
					headEndIdx = i;
				}
			}
			else {
				if( !(0 <= chars[i]-'0' && chars[i]-'0' <= 9)) {
					numberEndIdx = i;
					break;
				}
			}
		}
		temp[0] = fileName.substring(0,headEndIdx);
		temp[1] = fileName.substring(headEndIdx,numberEndIdx);
		
		return temp;
	}

}
