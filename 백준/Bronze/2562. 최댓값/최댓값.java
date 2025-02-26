import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] arr = new int[9];
		int max = 0;
		int position = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				position = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(position);
		
	}

}