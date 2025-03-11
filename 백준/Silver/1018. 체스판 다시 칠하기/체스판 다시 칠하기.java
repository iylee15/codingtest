import java.io.*;
import java.util.*;

public class Main {

	private static int N, M;
	private static boolean[][] board;
	private static int min = 64;
	private static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new boolean[N][M];

		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'B') {
					board[i][j] = true;
				} else {
					board[i][j] = false;
				}
				
			}
		}
		
		int N_row = N-7;
		int M_col = M-7;
		
		for(int i = 0; i < N_row; i++) {
			for(int j = 0; j < M_col; j++) {
				bfs(i, j);
			}
		}
		
		System.out.println(min);
	}
	
	private static void bfs (int y, int x) {
		int endX = x + 8;
		int endY = y + 8;
		count = 0;
		
		boolean TF = board[y][x];
		
		for(int i = y; i < endY; i++) {
			for(int j = x; j < endX; j++) {
				if(board[i][j] != TF) {
					count++;
				}
				TF = !TF;
			}
			TF = !TF;
		}
		
		count = Math.min(count, 64-count);
		min = Math.min(min, count);
		
	}
}
