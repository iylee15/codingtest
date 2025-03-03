import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) throws IOException {
		HashSet<String> set = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		List<String> list = new ArrayList<String>(set);

		List<String> orderList = list.stream().sorted((o1, o2) -> {
			if(o1.length() == o2.length()) {
				return o1.compareTo(o2);
			}
			return o1.length() - o2.length();
		}).collect(Collectors.toList());

		for(String s : orderList) {
			System.out.println(s);
		}
	}
}