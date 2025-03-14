import java.io.*;
import java.util.*;

public class Main {
	private static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int last = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			 st = new StringTokenizer(br.readLine());
			 
			 switch(st.nextToken()) {
			 case "push" :
				 last = Integer.parseInt(st.nextToken());
				 push(last);
				 break;
			 case "pop" :
				 sb.append(pop()).append("\n");
				 break;
			 case "size" :
				 sb.append(size()).append("\n");
				 break;
			 case "empty" : 
				 sb.append(empty()).append("\n");
				 break;
			 case "front" :
				 sb.append(front()).append("\n");
				 break;
			 case "back" : 
				 sb.append(back(last)).append("\n");
				 break;
			 }
		}
		System.out.println(sb.toString());
	}
	
	private static void push(int n) {
		queue.add(n);
	}
	
	private static int pop() {
		if(queue.isEmpty()) return -1;
		return queue.poll();
	}
	
	private static int size() {
		return queue.size();
	}
	
	private static int empty() {
		if(queue.isEmpty()) return 1;
		else return 0;
	}
	
	private static int front() {
		if(queue.isEmpty()) return -1;
		return queue.peek();
	}
	
	private static int back(int last) {
		if(queue.isEmpty()) return -1;
		return last;
	}
}
