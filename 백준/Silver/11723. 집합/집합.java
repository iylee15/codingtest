import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int S = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int x;
			switch(cmd) {
			case "add" :
				x = Integer.parseInt(st.nextToken());
				S |= (1 << x);
				break;
			case "remove" :
				x = Integer.parseInt(st.nextToken());
				S &= ~(1 << x);
				break;
			case "check" :
				x = Integer.parseInt(st.nextToken());
				sb.append((S & (1 << x)) != 0 ? 1 : 0).append("\n");
				break;
			case "toggle" :
				x = Integer.parseInt(st.nextToken());
				S ^= (1 << x);
				break;
			case "all" : 
				S = (1 << 21) - 1;
				break;
			case "empty" :
				S = 0;
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
