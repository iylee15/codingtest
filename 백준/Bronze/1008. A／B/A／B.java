import java.util.Scanner;

public class Main {
	// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double answer = a/b;
		System.out.println(answer);
	}

}