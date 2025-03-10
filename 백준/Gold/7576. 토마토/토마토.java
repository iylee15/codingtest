import java.io.*;
import java.util.*;

public class Main {
	private static int M, N;
	private static int[] dx = {0, 0, -1, 1};
	private static int[] dy = {-1, 1, 0, 0};
	private static int[][] tomatoes;
	private static int count = 0;
	private static Queue<int[]> queue = new ArrayDeque<int[]>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 가로
		N = Integer.parseInt(st.nextToken()); // 세로
		tomatoes = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= M; j++) {
				tomatoes[i][j] = Integer.parseInt(st.nextToken());
				if(tomatoes[i][j] == 1) {
					queue.add(new int[]{i, j});
				}
			}
		}
		int answer = bfs();
		System.out.println(answer);
	}
	
	private static int bfs() {
		while(!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int y = tmp[0];
			int x = tmp[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx > 0 && nx <= M && ny > 0 && ny <= N) {
					if(tomatoes[ny][nx] == 0) {
						queue.add(new int[]{ny, nx});
						tomatoes[ny][nx] = tomatoes[y][x] + 1;
					}
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				if(tomatoes[i][j] == 0) {
					return -1;
				}
				
				count = Math.max(tomatoes[i][j], count);
			}
		}
		
		if(count == 1) {
			return 0;
		} else {
			return count-1;
		}
	}
}
