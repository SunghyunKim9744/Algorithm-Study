import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long min = scan.nextLong();
		long max = scan.nextLong();
		Set<Long> set = new HashSet<>();
		
		for(long i=2; i*i <= max; i++) {
			long num = i*i;
			long start = min % num == 0 ? min / num : min / num + 1;
			for(long j = start; num*j <= max; j++)
				set.add(num*j);
		}
		
		long answer = max - min - set.size() + 1;

		System.out.println(answer);
	}

}
