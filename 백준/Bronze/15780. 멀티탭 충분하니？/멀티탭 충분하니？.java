import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] powerBars = new int[K];
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K; i++) {
			powerBars[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int num : powerBars) {
			if(num < 5) count += 2;
			else if(num < 7) count += 3;
			else if(num >= 7) count += 4;
		}
		
		if(count >= N) System.out.println("YES");
		else System.out.println("NO");
	}

}
