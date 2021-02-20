package Day2.문자열내p와y의개수;

public class Sh {
	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean answer = solution(s);
	}
	
//	static boolean solution(String s) {
//        boolean answer = true;
//        int pCnt = 0;
//        int yCnt = 0;
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
//                pCnt++;
//
//            }
//            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
//                yCnt++;
//            }
//        }
//
//        return pCnt == yCnt;
//    }
	
	static boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++){
            if(str[i].equalsIgnoreCase("p"))
                pCnt++;
            else if(str[i].equalsIgnoreCase("y"))
                yCnt++;
            
        }

        return pCnt == yCnt;
    }
}
