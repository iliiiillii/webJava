package sec02.ex02;

public class IntegerTypeTest {

	public static void main(String[] args) {
		
		System.out.println(5);  //실행 시 4바이트가 정수에 할당된다.
		System.out.println(5 + 290);
		System.out.println(5 - 290);
		System.out.println(7L);  //실행 시 8바이트가 7에 할당된다.
		
		System.out.println(2147483647);
		System.out.println(2_147_483_647);
		System.out.println(1_234_567_000 + 222000);
		
		
		System.out.println(-9223372036854775808L);
		System.out.println(9_223_372_036_854_775_807L);
		System.out.println(2_000_000_000_000L - 100_000L);
		

	}

}
