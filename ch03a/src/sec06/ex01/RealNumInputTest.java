package sec06.ex01;
import java.util.Scanner;

public class RealNumInputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = 0.0f;
		double num2 = 0.0d;
		
		System.out.println("두 개의 실수를 입력하세요.");
		num1 = sc.nextFloat();
		num2 = sc.nextDouble();
		
		System.out.println("첫번째 실수 = " + num1);
		System.out.println("두번째 실수 = " + num2);
		sc.close();

	}

}
