package Day01.완주하지못한선수;

import java.util.HashSet;
import java.util.Set;

public class Sh {
	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String answer = solution(participant, completion);

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Set<String> comp = new HashSet<>();

		for (String s : completion) {
			while (comp.contains(s))
				s += '0';
			comp.add(s);
		}

		for (String s : participant) {

			if (comp.contains(s)) {
				while (comp.contains(s + '0'))
					s += '0';
				comp.remove(s);
			} else
				return s;

		}
		return answer;
	}

//	public static String solution(String[] participant, String[] completion) {
//		String answer = "";
//        for(int i=0; i<participant.length; i++){
//            for(int j=0; j<completion.length; j++){
//                if(participant[i].equals(completion[j])){
//                    completion[j] = "";
//                    break;
//                }
//                else if(j == completion.length-1)
//                    return participant[i];
//            }
//        }
//        return answer;
//	}
}
