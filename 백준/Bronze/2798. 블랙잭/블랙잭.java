import java.io.*;
import java.util.*;

public class Main {
	private static int N;
	private static int M;
	private static int[] cards;
	private static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cards = new int[N];
		boolean[] check = new boolean[N];
		int max = Integer.MIN_VALUE;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
        
        answer = 0;
		dfs(0, 0, 0);
		
		System.out.println(answer);
	}
	
	private static void dfs (int index, int num, int depth) {
		// 종료 조건
		if(depth == 3) { 
			if(num <= M) {
				answer = Math.max(num, answer);
			}
			return;
		}
		
        // 점화식
		for(int i = index; i < N; i++) {
			dfs(i + 1, num + cards[i], depth + 1);
		}
	}
}
