package by.home.java_fundamentals.Task02;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class SumOfNumbersController {

	public static void main(String[] args) {

		SumOfNumbersInput input = new SumOfNumbersInput();

		double number1 = input.readNumber("Enter a first number");
		double number2 = input.readNumber("Enter a second number");
		double number3 = input.readNumber("Enter a third number");

		SumOfNumbersLogic logic = new SumOfNumbersLogic();

		double sum = logic.sumOfBiggestAndSmallestNumbersOutOfThree(number1, number2, number3);

		SumOfNumbersView view = new SumOfNumbersView();
		view.showResult(sum);

	}
}