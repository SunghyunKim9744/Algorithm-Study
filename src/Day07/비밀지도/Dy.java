package Day07.비밀지도;

// 1:05 ~ 
public class Dy {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
		System.out.println(solution(n, arr1, arr2));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n];
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<n; j++) {
				if((arr1[i] % 2) + (arr2[i] % 2) == 0){
					sb.insert(0, " ");
				}else {
					sb.insert(0, "#");
				}
				arr1[i] /= 2;
				arr2[i] /= 2;
			}
			
			answer[i] = sb.toString();
		}
		
		return answer;
	}
}
