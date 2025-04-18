import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int [N][2];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] arr1, int[] arr2) {
				if (arr1[0] == arr2[0]) {
					if(arr1[1] == arr2[1]) return 0;
					else return arr1[1] - arr2[1];
				} 
				else return arr1[0] - arr2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int[] a : arr) {
			sb.append(a[0]).append(" ").append(a[1]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
