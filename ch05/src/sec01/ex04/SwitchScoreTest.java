package sec01.ex04;

import java.util.Scanner;

public class SwitchScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요.");
		int score = sc.nextInt();
		
		int mok = score / 10;
		
		switch(mok) {
		case 10, 9:
			System.out.println("매우 우수합니다.");
			break;
		case 8, 7:
			System.out.println("우수합니다.");
			break;
		case 6, 5:
			System.out.println("양호합니다.");
			break;
		default:
			System.out.println("더 노력해야합니다.");
		}
	
		
		sc.close();

	}

}
