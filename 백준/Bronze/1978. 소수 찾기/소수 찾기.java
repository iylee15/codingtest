import java.io.*;
import java.util.*;

// 소수 찾기
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numbers[] = new int[N];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			if(isPrime(numbers[i])) count++;
		}
		
		System.out.println(count);

	}
	
	// n을 받아서 n이 소수인지 아닌지 판별
	static boolean isPrime (int n) {
		if(n == 1 || n == 0) return false;
		int sqrt = (int)Math.sqrt(n);
		for(int i = 2; i <= sqrt; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	// n을 받아서 n까지의 소수 개수를 구한다
	int solution (int n) {
		Boolean[] arr = new Boolean[n+1];
		List<Boolean> list = new ArrayList<Boolean>();
		arr[0] = arr[1] = false;
		
		// 제곱근 구하기
		int sqrt = (int)Math.sqrt(n);
		
		for(int i = 2; i < sqrt; i++) {
			if(arr[i] == true) {
				for (int j = 1; i * j <= n; j++) {
					arr[i*j] = false;
				}
			}
		}
		
		int count = 0;
		for(boolean b : arr) {
			if (b) count++;
		}
		
		return count;
	}
}