import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		boolean answer = true;
		
		for(int i = 0; i < s1; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals(st.nextToken())) continue;
			answer = false;
		}
		
		if(!answer) 
			{
				System.out.println("Wrong Answer");
				return;
			}
		
		if(answer) {
			for(int i = 0; i < s2; i++) {
				st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals(st.nextToken())) continue;
				answer = false;
			}
		}
		
		if(!answer) System.out.println("Why Wrong!!!");
		else if(answer) System.out.println("Accepted");
	}
}