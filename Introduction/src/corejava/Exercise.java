package corejava;

public class Exercise {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			sum += i;
		}
		System.out.println(sum);

	}
}
