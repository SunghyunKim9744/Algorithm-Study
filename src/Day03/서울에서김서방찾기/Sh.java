package Day03.서울에서김서방찾기;

public class Sh {

	public static void main(String[] args) {

		String[] seoul = { "Jane", "Kim" };

		String answer = solution(seoul);
	}

//	public static String solution(String[] seoul) {
//        String answer = "";
//        int index = 0;
//        
//        for(int i=0; i<seoul.length; i++)
//            if(seoul[i].equals("Kim")){
//                index = i;
//                break;
//            }
//                
//        
//        answer = String.format("김서방은 %d에 있다", index);
//        return answer;
//    }

	public static String solution(String[] seoul) {
		String answer = "";
		int index = 0;

		for (String str : seoul) {
			if (str.equals("Kim"))
				break;
			index++;
		}

		answer = String.format("김서방은 %d에 있다", index);
		return answer;
	}
}
