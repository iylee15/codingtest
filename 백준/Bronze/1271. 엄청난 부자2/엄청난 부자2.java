import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger money = new BigInteger(st.nextToken());
		BigInteger people = new BigInteger(st.nextToken());
		try {
			System.out.println(money.divide(people));
        	System.out.println(money.remainder(people));
		} catch (ArithmeticException e) {
			e.getMessage();
		}
	}
}
