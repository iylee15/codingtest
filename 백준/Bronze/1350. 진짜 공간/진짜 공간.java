import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] files = new long[N];
		long count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			files[i] = Long.parseLong(st.nextToken());
		}
		long size = Long.parseLong(br.readLine());
		for(long i : files) {
			if(i > 0) {
                count += (i + size - 1) / size;
			} 
		}
		System.out.println(count * size);
	}
}
