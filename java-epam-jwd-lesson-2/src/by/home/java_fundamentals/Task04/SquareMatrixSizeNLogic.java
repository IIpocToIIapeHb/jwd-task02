package by.home.java_fundamentals.Task04;

public class SquareMatrixSizeNLogic {

	public int[][] createNMatrix(int size) {

		int[][] array = new int[size][size];

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) { // условие, если строка четная

				int temp = 1;
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = temp;
					temp += 1;
				}
			} else {
				// условие, если строка нечетная

				int temp = array.length;
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = temp;
					temp -= 1;
				}
			}

		}
		return array;
	}
}
