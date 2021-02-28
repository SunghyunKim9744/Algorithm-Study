package Day07.비밀지도;

public class Sh {

	public static void main(String[] args) {
		
		int n = 5;
		int[] arr1 = {0, 20, 28, 18, 11};
		int[] arr2 = {0, 1, 21, 17, 28};
		
		String[] answer = solution(n,arr1,arr2);

	}

	// 7:18 ~ 7~32 , 7:40~ 7:50
	// (0.05ms, 52.5MB) - > (0.10ms, 52.3MB)
//	private static String[] solution(int n, int[] arr1, int[] arr2) {
//		String[] answer = null;
//		answer= new String[n];
//		
////		int[][] tempArr1 = new int[n][n];
////		int[][] tempArr2 = new int[n][n];
////		
////		for(int i=0; i<n; i++) {
////			tempArr1[i] = Integer.parseInt(Integer.toBinaryString(arr1[i]).split(""));
////		}
//		
//		for(int i=0; i<n; i++) {
//			
//			int[] temp1 = new int[n];
//			int[] temp2 = new int[n];
//			
//			int row1 = arr1[i];
//			int row2 = arr2[i];
//			
//			StringBuilder sb = new StringBuilder();
//			for(int j=0; j<n; j++) {
//				temp1[j] = row1 > 0 ? row1%2 : 0;
//				row1/=2;
//				
//				temp2[j] = row2 > 0 ? row2%2 : 0;
//				row2/=2;
//				
//				if(temp1[j] == 0 && temp2[j] == 0)
//					sb.append(" ");
//				else
//					sb.append("#");
//			}
//			
//			answer[i] = sb.reverse().toString();
//			
//
//		}
//		return answer;
//	}


	// (9.27ms, 52.4MB) - > (13.13ms, 54.8MB)
	private static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = null;
		answer= new String[n];
		
		for(int i=0; i<n; i++) {
			String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			long binary = Long.parseLong(temp);
			
			temp = String.format("%0"+n+"d", binary);
			
			temp = temp.replace("1", "#");
			temp = temp.replace("0", " ");
			
			answer[i] = temp;
		}
		

		return answer;
	}
}
