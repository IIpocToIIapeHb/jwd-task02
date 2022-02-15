package by.home.java_fundamentals.Task02;

public class SumOfNumbersLogic {

	public double sumOfBiggestAndSmallestNumbersOutOfThree(double a, double b, double c) {

		double sum = 0;

		if (a >= b && a >= c && b <= c) {
			sum = a + b;
		} else if (a >= b && a >= c && c <= b) {
			sum = a + c;
		} else if (b >= a && b >= c && a <= c) {
			sum = b + a;
		} else if (b >= a && b >= c && c <= a) {
			sum = b + c;
		} else if (c >= a && c >= b && a <= b) {
			sum = c + a;
		} else if (c >= a && c >= b && b <= a) {
			sum = c + b;
		}

		return sum;

	}

}
