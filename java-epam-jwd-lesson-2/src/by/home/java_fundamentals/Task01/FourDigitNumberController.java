package by.home.java_fundamentals.Task01;

/*Составить линейную программу, печатающую значение true,
 *если указанное высказывание является истинным, и false — в противном случае:

   Сумма двух первых цифр заданного четырехзначного числа
   равна сумме двух его последних цифр.*/

public class FourDigitNumberController {

	public static void main(String[] args) {

		FourDigitNumberInput input = new FourDigitNumberInput(System.in, System.out);

		int number = input.readFourDigitInt("Enter a four-digit number");

		FourDigitNumberLogic logic = new FourDigitNumberLogic();

		boolean result = logic.isSumOfTwoFirstAndTwoLastDigitsEquels(number);
		
		FourDigitNumberView view = new FourDigitNumberView(System.out);

		view.showIsSumOfTwoFirstAndTwoLastDigitsEquels(result);
	}

}
