package sec06.ex01;

import java.util.Scanner;

public class IntScannerTest {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		String temp = sc.nextLine();
		num1 = Integer.parseInt(temp);

		System.out.println("입력한 정수는 " + num1 + "입니다.");
		sc.close();

	}

}
