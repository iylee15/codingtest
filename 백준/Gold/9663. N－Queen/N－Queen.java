

import java.util.Scanner;

public class Main {
	
	static int N, ans;
	static boolean[] col, slash, bSlash;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		col = new boolean[N+1];
		slash = new boolean[2*N+1]; // 2~N
		bSlash = new boolean[2*N+1]; // 1~N-1
		
		setQueen(1);
		System.out.println(ans);
	}
	
	// 기존 퀸과 같은 행에 두지 않는 방법
	static void setQueen(int row) {
		
		if(row > N) { // 유망성 체크를 하며 진행하므로 기저에 도달하면 답이 됨!
			++ans;
			return;
		}
		
		// 현재 row행 퀸을 1열부터 n열까지 시도
		for (int c = 1; c <= N; c++) {
			
			// 같은 열, 좌/우 대각선상에 다른 퀸 있으면 현재 열은 불가 : 가지치기!!
			if(col[c] || slash[row+c] || bSlash[row-c+N]) continue; 
			// 현재 열에 퀸 놓기
			col[c] = slash[row+c] = bSlash[row-c+N] = true;
			// 다음 퀸 놓으러 가기
			setQueen(row+1);
			// 놓았던 퀸 원복 후 다음열 시도
			col[c] = slash[row+c] = bSlash[row-c+N] = false;
		}
	}
}
