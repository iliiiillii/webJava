package sec01.ex03;

public class MethodInMethodTest {
	public static void main(String[] args) {
		int[] score1 = { 30, 40, 50, 60, 60 };
		int[] score2 = { 33, 44, 55, 66, 77 };
		int sum = 0, max = 0;
		MethodInMethodTest m = new MethodInMethodTest();
		sum = m.arraySum(score1);
		max = m.arrayMax(score1);

		System.out.println("배열 총합 : " + sum + " , 배열 최대값 : " + max);

		System.out.println("----------------------------------");
		m.printArray(score2);
	}

	public void printArray(int[] arr) {
		int sum = arraySum(arr);
		int max = arrayMax(arr);
		System.out.println("배열 총합 : " + sum + " , 배열 최대값 : " + max);
	}

	public int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;

	}

	public int arrayMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;

	}

}
