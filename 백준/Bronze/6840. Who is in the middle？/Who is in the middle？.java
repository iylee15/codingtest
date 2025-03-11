import java.util.*;

// Who is in the middle?
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] weight = new int[3];
		for(int i = 0; i < 3; i++) {
			weight[i] = sc.nextInt();
		}
		
		Arrays.sort(weight);
		
		System.out.println(weight[1]);
	}
}