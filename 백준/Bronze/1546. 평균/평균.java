import java.io.*;
import java.util.*;

public class Main {

	private static double[] scores;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		scores = new double[N];
		double max = 0.0;
		double average = 0.0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			scores[i] = Double.parseDouble(st.nextToken());
			max = Math.max(max, scores[i]);
		}
		
		for(int i = 0; i < N; i++) {
			average += (scores[i]/max)*100;
		}
		
		System.out.println(average/N);
	}
}
