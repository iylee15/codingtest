import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i <= 500; i++) {
			for(int j = 1; j < i; j++) {
				if(Math.pow(i, 2) - Math.pow(j, 2) == N) count++;
			}
		}
		System.out.println(count);
	}
}