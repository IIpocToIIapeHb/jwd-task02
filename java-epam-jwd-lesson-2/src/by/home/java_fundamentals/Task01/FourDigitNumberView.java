package by.home.java_fundamentals.Task01;

import java.io.PrintStream;

public class FourDigitNumberView {

	PrintStream outputStream;

	public FourDigitNumberView(PrintStream outputStream) {
		this.outputStream = outputStream;

	}

	public void showIsSumOfTwoFirstAndTwoLastDigitsEquels(boolean result) {
		if (result) {
			outputStream.println(
					"Congratulations! The sum of the first two digits of a number is equal to the sum of its last two digits");
		} else {
			outputStream.println(
					"Sorry( The sum of the first two digits of a number is NOT equal to the sum of its last two digits");
		}

	}
}
