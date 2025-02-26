import java.io.*;
import java.util.*;

// 직각삼각형
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<int[]> arr = new ArrayList<int[]>();
		int count = 0;
		while(true) {
			count++;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] newArr = new int[3];
			newArr[0] = Integer.parseInt(st.nextToken());
			newArr[1] = Integer.parseInt(st.nextToken());
			newArr[2] = Integer.parseInt(st.nextToken());
			if(newArr[0] == 0) break;
			arr.add(newArr);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			int[] newArr = arr.get(i);
			Arrays.sort(newArr);
			if(Math.pow(newArr[0], 2)+Math.pow(newArr[1], 2) == Math.pow(newArr[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		
	}

}