package by.home.java_fundamentals.Task02;

import java.util.Scanner;

public class SumOfNumbersInput {

	public double readNumber(String enterMessage) {

		System.out.println(enterMessage);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("You entered an invalid number. Try again");
		}

		return scanner.nextDouble();

	}

}
