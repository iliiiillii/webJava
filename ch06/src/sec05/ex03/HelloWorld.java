package sec05.ex03;

public class HelloWorld {

	public static void main(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
		}
		
		System.out.println("\n프로그램 종료");

	}

}
