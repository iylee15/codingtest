import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());
			map.put(number, number);
		}
		
		int M = Integer.parseInt(br.readLine());
		int findNumbers[] = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			findNumbers[i] = Integer.parseInt(st.nextToken());
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			if(map.containsKey(findNumbers[i])) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
