package by.home.java_fundamentals.Task01;

public class FourDigitNumberLogic {

	public boolean isSumOfTwoFirstAndTwoLastDigitsEquels(int number) {

		int sum1 = number / 1000 + number / 100 % 10;
		int sum2 = number % 100 / 10 + number % 10;

		return (sum1 == sum2);

	}

}
