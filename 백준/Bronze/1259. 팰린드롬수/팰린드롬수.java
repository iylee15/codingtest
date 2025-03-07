import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isPalindrome = false;
		List<String> list = new ArrayList<String>();
		while(true) {
			String number = br.readLine();
			if(number.equals("0")) break;
			list.add(number);
		}
		for(String str : list) {
			char[] number = str.toCharArray();
			for(int i = 0; i <= number.length/2; i++) {
				 if(number[i] != number[number.length-1-i]) {
					 isPalindrome = false;
					 break;
				 }
				 isPalindrome = true;
			 }
			if(isPalindrome) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
