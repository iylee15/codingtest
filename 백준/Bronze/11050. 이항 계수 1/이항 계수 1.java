import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int anotherK = N-K;
		
		int totalK = 1;
		int totalAK = 1;
		int totalN = 1;
		
		for(int i = N; i > 0; i--) {
			totalN = i*totalN;
		}
		
		for(int i = K; i > 0; i--) {
			totalK = i*totalK;
		}
		
		for (int i = anotherK; i > 0; i--) {
			totalAK = i*totalAK;
		}
		
		System.out.println(totalN/(totalK*totalAK));
	}
}
