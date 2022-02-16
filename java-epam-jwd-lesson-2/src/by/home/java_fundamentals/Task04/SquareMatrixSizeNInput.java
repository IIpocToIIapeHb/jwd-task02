package by.home.java_fundamentals.Task04;

import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством элементов и
натуральное число k. Объединить их в один массив, включив второй массив
между k-м и (k+1) - м элементами первого.*/

public class SquareMatrixSizeNInput {

	public int readEvenSizeOfMatrix(String enterMsg) {

		System.out.println(enterMsg);

		Scanner scanner = new Scanner(System.in);

		int intNumber = readInt(scanner);

		while (!isEvenInt(intNumber)) {
			System.out.println("Your entered not the even number. Try again");
			intNumber = readInt(scanner);
		}

		return intNumber;

	}

	// method that requests and returns an integer number
	private int readInt(Scanner scanner) {

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Вы ввели не целое чиcло. Попробуйте еще раз");
		}
		return scanner.nextInt();
	}

	// method that checks if the parameter is a four-digit number
	private boolean isEvenInt(int number) {

		boolean result = false;

		if (number % 2 == 0) {
			result = true;
		}

		return result;

	}
}
