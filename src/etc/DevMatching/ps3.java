package etc.DevMatching;

public class ps3 {

	public static void main(String[] args) {
		String[] enroll1 = { "john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young" },
				enroll2 = { "john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young" };
		String[] referral1 = { "-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward" },
				referral2 = { "-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward" };
		String[] seller1 = { "young", "john", "tod", "emily", "mary" },
				seller2 = { "sam", "emily", "jaimie", "edward" };
		int[] amount1 = { 12, 4, 2, 5, 10 }, amount2 = { 2, 3, 5, 4 };

		solution(enroll1, referral1, seller1, amount1); // 360, 958, 108, 0, 450, 18, 180, 1080
		solution(enroll2, referral2, seller2, amount2); // 0, 110, 378, 180, 270, 450, 0, 0
	}

	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		int[] answer = {};
		return answer;
	}
}

//SELECT ID, NAME, HOST_ID FROM PLACES WHERE HOST_ID IN (SELECT HOST_ID FROM
//(SELECT HOST_ID, COUNT(HOST_ID) AS CNT
//FROM PLACES GROUP BY HOST_ID) A
//WHERE CNT >= 2);