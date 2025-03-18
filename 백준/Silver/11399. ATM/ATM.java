import java.io.*;
import java.util.*;

// ATM
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] times = new int[N];
		for(int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] newArr = times;
		Arrays.sort(newArr);
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				sum += newArr[j];
			}
		}
		System.out.println(sum);
	}
}
