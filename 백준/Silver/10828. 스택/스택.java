import java.io.*;
import java.util.*;

public class Main {
	
	private static LinkedList<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push" :
				int value = Integer.parseInt(st.nextToken());
				push(value); break;
			case "pop" :
				sb.append(pop()).append("\n"); break;
			case "size" :
				sb.append(size()).append("\n"); break;
			case "empty" :
				sb.append(empty()).append("\n"); break;
			case "top" :
				sb.append(top()).append("\n"); break;
			}
		}
		System.out.println(sb.toString());
	}
	
	private static void push(int a) {
		queue.push(a);
	}
	
	private static int pop() {
		if(!queue.isEmpty())
			return queue.removeFirst();
		else 
			return -1;
	}
	
	private static int size() {
		return queue.size();
	}
	
	private static int empty() {
		return queue.isEmpty() ? 1 : 0;
	}
	
	private static int top() {
		if(queue.isEmpty()) return -1;
		else return queue.getFirst();
		
	}
}
