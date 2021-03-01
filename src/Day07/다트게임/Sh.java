package Day07.다트게임;

public class Sh {

	public static void main(String[] args) {
		String dartResult = "1S#2S*3S";

		int answer = solution(dartResult);

		System.out.println(answer);
	}

	// 10:18 ~ 11:50
	// (0.13ms, 52.2MB) - > (3.26ms, 52.4MB)
	private static int solution(String dartResult) {
		int answer = 0;

		String[] strs = dartResult.split("");
		int[] score = new int[3];
		for (int i = 0; i < score.length; i++)
			score[i] = -11;

		int num = 0;
		int index = 0;
		
		for (int i = 0; i < dartResult.length(); i++) {
			if (strs[i].equals("S")) {
				num = Integer.parseInt(strs[i - 1]);
				if (i - 2 >= 0 && "0123456789".contains(strs[i-2]))
					num = Integer.parseInt(strs[i - 2] + strs[i - 1]);

				for (int j = 0; j < 3; j++) {
					if (score[j] == -11) {
						
						index = j;
						
						break;
					}
				}

				
				score[index] = num;

				if(i != dartResult.length()-1) {
					if (i <= dartResult.length() - 1 && strs[i + 1].equals("*")) {

						score[index] *= 2;
						if (index != 0)
							score[index - 1] = score[index - 1] * 2;

					} else if (i <= dartResult.length() - 1 && strs[i + 1].equals("#")) {
						score[index] *= -1;

					
					}
				}
				
				

			} else if (strs[i].equals("D")) {
				num = Integer.parseInt(strs[i - 1]);
				if (i - 2 >= 0 && "0123456789".contains(strs[i-2]))
					num = Integer.parseInt(strs[i - 2] + strs[i - 1]);
				num *= num;

				
				for (int j = 0; j < 3; j++) {
					if (score[j] == -11) {
						index = j;
						break;
					}
				}
				
				
				score[index] = num;
				
				

				if(i != dartResult.length()-1) {
					if (i <= dartResult.length() - 1 && strs[i + 1].equals("*")) {

						score[index] *= 2;
						if (index != 0)
							score[index - 1] = score[index - 1] * 2;

					} else if (i <= dartResult.length() - 1 && strs[i + 1].equals("#")) {
						score[index] *= -1;

						
					}
				}
				
				
				
			}

			else if (strs[i].equals("T")) {
				num = Integer.parseInt(strs[i - 1]);
				if (i - 2 >= 0 && "0123456789".contains(strs[i-2]))
					num = Integer.parseInt(strs[i - 2] + strs[i - 1]);
				num = num * num * num;

				for (int j = 0; j < 3; j++) {
					if (score[j] == -11) {
						index = j;
						break;
					}
				}
				
				score[index] = num;

				if(i != dartResult.length()-1) {
					if (i <= dartResult.length() - 1 && strs[i + 1].equals("*")) {

						score[index] *= 2;
						if (index != 0)
							score[index - 1] = score[index - 1] * 2;

					} else if (i <= dartResult.length() - 1 && strs[i + 1].equals("#")) {
						score[index] *= -1;

					
					}
				}
				

			}
		}

		return score[0]+score[1]+score[2];

	}

}
