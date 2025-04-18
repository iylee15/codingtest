import java.util.*;

public class Main {
	private static int count = Integer.MAX_VALUE;
	private static int visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		visited = new int[X+1];
		Arrays.fill(visited, count);
		
		dfs(X, 0);
		System.out.println(count);
	}
	
	public static void dfs (int x, int min) {
		if(min > count) return;
		if(visited[x] <= min) return;
		
		visited[x] = min;

		if(x == 1) {
			if(count > min) count = min;
			return;
		}
		
		if(x%3 == 0) dfs(x/3, min+1); 
		if(x%2 == 0) dfs(x/2, min+1); 
		if(x>1) dfs(x-1, min+1);
	}
}
