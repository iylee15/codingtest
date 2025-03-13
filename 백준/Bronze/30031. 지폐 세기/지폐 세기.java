import java.io.*;
import java.util.*;

public class Main {
	private static int sum = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] money = new int[N];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			switch(money[i]) {
                case 136 : 
                    sum += 1000;
                    break;
                case 142 :
                    sum += 5000;
                    break;
                case 148 :
                    sum += 10000;
                    break;
                case 154 :
                    sum += 50000;
                    break;
			}
		}
		System.out.println(sum);
	}
}
