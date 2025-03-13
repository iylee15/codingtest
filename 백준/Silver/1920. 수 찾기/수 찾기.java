import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numbers[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int M = Integer.parseInt(br.readLine());
		int findNumbers[] = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			findNumbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			int answer = Arrays.binarySearch(numbers, findNumbers[i]);
			if(answer < 0) answer = 0;
			else if(answer >= 0) answer = 1;
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
