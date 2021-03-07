package 고득점Kit.Greedy.조이스틱;

// 11:35 ~
public class Dy {

	public static void main(String[] args) {
		
		String name1 = "ABAAAA",name2 = "JAN";
		
		System.out.println(solution(name1));
//		System.out.println(solution(name2));

	}

	private static int solution(String name) {
		int answer = 0;
		char[] names = name.toCharArray();
		for(int i=0; i<names.length; i++) {
			if(names[i]>78) {
				answer += 'Z' - names[i] + 1;
			}else {
				answer += names[i] - 'A';
			}
		}
		int min = names.length-1;
		for(int i=1; i<names.length-1; i++) {
			if(names[i] == 'A') {
				int[] aLength = {i,i};
				for(int j=i+1; j<names.length-1; j++) {
					if(names[j] == 'A') {
						aLength[1] = j;
					}else {
						break;
					}
				}
				int left = (aLength[0]-1)*2+names.length-aLength[1]-1;
				int right = aLength[0]-1+(names.length-aLength[1]-1)*2;
				if(min > left) {
					min = left;
				}
				if(min > right) {
					min = right;
				}
				System.out.println("l"+aLength[0]);
				System.out.println("r"+aLength[1]);
			}else {
				continue;
			}
		}
		
		
		answer += min;
		return answer;
	}

}
