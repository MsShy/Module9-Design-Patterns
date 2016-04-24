package homework.strategy;

import java.util.Scanner;

public class Counter {
	private Calculator calculator;
	private int number1;
	private int number2;

	private int numbers[] = new int[2];

	public void setCalculator(final Calculator calculator) {
		this.calculator = calculator;
	}

	public int result() {
		inputNumbers();
		return calculator.count(number1, number2);
	}

	public int[] input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("number1");
		numbers[0] = scanner.nextInt();
		System.out.println("number2");
		numbers[1] = scanner.nextInt();
		return numbers;
	}

	public void inputNumbers() {
		int numbers[] = input();
		number1 = numbers[0];
		number2 = numbers[1];

	}

}
