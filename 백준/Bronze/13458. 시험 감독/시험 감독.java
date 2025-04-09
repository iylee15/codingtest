import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] applicants = new int[N];
		for(int i = 0; i < N; i++) {
			applicants[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		long count = 0;
		for(int i = 0; i < N; i++) {
			int number = applicants[i];
			number -= B;
			count++;
			
            if(number > 0) {
				if(number <= C) count++;
				else count += Math.ceil((double)number/C);
			}
		}
		System.out.println(count);
	}
}
