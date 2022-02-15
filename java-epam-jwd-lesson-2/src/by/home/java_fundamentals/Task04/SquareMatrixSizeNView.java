package by.home.java_fundamentals.Task04;

import java.util.Arrays;

public class SquareMatrixSizeNView {

	public void showMatrix(int[][] array) {
		System.out.println("Полученная матрица: ");
		for (int k = 0; k < array.length; k++) {
			System.out.println(Arrays.toString(array[k]));
		}
	}
}
