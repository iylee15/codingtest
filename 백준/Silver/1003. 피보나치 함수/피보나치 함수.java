import java.io.*;

// 피보나치 함수 
public class Main {
	private static int countZero, countOne;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 피보나치 호출 시 0과 1이 출력되는 횟수를 저장
		int[][] dp = new int[41][2];  // n은 최대 40
		
		// 초기값 설정
		dp[0][0] = 1; dp[0][1] = 0;
		dp[1][0] = 0; dp[1][1] = 1;
		
		// dp 테이블 채우기
		for(int i = 2; i <= 40; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		
		for(int i = 0; i < T; i++) {
			int testCase = Integer.parseInt(br.readLine());
			System.out.println(dp[testCase][0] + " " + dp[testCase][1]);
		}
	}
}
