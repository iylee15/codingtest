import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[] sotteok = new char[N];
		int countS = 0;
		int countT = 0;
		
		sotteok = br.readLine().toCharArray();		
		
		Stack<Character> stack = new Stack<>();
		for(int i = N-1; i >= 0; i--) {
				switch(sotteok[i]) {
				case 's' : 
					countS++;
					break;
				case 't' :
					countT++;
					break;
				default :
					System.err.println("error");
				}
			stack.push(sotteok[i]);
		}
		
		while(!stack.isEmpty()) {
            if(countS == countT) break;
			char ch = stack.pop();
			switch(ch) {
			case 's' : 
				countS--;
				break;
			case 't' :
				countT--;
				break;
			default :
				System.err.println("error");
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}