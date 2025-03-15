import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		if(N % 4 == 0) {
			for(int i = 0; i < N/4; i++) {
				sb.append("long ");
			}
			sb.append("int");
		} else {
			for(int i = 0; i <= N/4; i++) {
				sb.append("long ");
			}
			sb.append("int");
		}
		
		System.out.println(sb.toString());
	}
}
