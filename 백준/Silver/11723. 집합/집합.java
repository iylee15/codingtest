import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Set<Integer> set = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "add" :
				set.add(Integer.parseInt(st.nextToken()));
				break;
			case "remove" :
				set.remove(Integer.parseInt(st.nextToken()));
				break;
			case "check" :
				if(set.contains(Integer.parseInt(st.nextToken())))
					sb.append("1\n");
				else sb.append("0\n");
				break;
			case "toggle" :
				int token = Integer.parseInt(st.nextToken());
				if(set.contains(token)) set.remove(token);
				else set.add(token);
				break;
			case "all" : 
				set.clear();
				for(int j = 1; j <=20; j++) {
					set.add(j);
				}
				break;
			case "empty" :
				set.clear();
				break;
			}
		}
        System.out.println(sb.toString());
	}
}
