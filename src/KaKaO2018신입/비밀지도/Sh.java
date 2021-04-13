package KaKaO2018신입.비밀지도;

public class Sh {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};

		String[] answer = solution(n,arr1,arr2);
	}

	// 1:41
	private static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = null;
		answer = new String[n];
		
		for(int i=0; i<n; i++) {
			StringBuilder temp = new StringBuilder(Integer.toBinaryString(arr1[i]|arr2[i]));
			if(temp.length() < n) {
				for(int j= temp.length(); j<n; j++)
					temp.insert(0,"0");
			}
			
			String str = temp.toString();
			str = str.replace("1", "#");
			str = str.replace("0", " ");
			
			answer[i] = str;
			
		}
		return answer;
	}

}
