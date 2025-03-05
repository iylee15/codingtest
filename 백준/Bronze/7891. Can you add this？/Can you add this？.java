import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] numbers = new int[T][2];
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			numbers[i][0] = Integer.parseInt(st.nextToken());
			numbers[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int[] answer = new int[T];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			sb.append(Arrays.stream(numbers[i]).sum()).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
