import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int n, m, k = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int classes[][] = new int[k][2];
		int answer[] = new int[k];
		
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			classes[i][0] = Integer.parseInt(st.nextToken());
			classes[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < k; i++) {
			answer[i] = Math.abs(1 - classes[i][0]) + Math.abs(m + 2 - classes[i][1]);
		}
		
		int min = 0;
		for(int i = 1; i < k; i++) {
			if(answer[i] < answer[min]) min = i;
		}
		System.out.println(min+1);
	}
}
