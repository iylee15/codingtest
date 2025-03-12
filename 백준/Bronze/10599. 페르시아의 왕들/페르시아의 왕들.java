import java.io.*;
import java.util.*;

public class Main {
	private static List<int[]> age;
	private static List<int[]> answer;

	public static void main(String[] args) throws IOException {
		age = new ArrayList<int[]>();
		answer = new ArrayList<int[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			int index = 0;
			st = new StringTokenizer(br.readLine());
			int arr[] = new int[4];
			for(int i = 0; i < 4; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			age.add(arr);
			index++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < age.size(); i++) {
			int[] life = age.get(i);
			int max = life[3] - life[0];
			int min = life[2] - life[1];
			sb.append(min).append(" ").append(max).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
