package KaKaO2018신입.비밀지도;

public class Dy {

	public static void main(String[] args) {
		int n = 5;
		int[] a1 = {9,20,28,18,11};
		int[] a2 = {30,1,21,17,28};
		
		for(String key: solution(n,a1,a2))
		System.out.println(key);

	}
	
	private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
        for(int i=0; i<arr1.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j = 0; j<n; j++) {
        		if(arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
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
