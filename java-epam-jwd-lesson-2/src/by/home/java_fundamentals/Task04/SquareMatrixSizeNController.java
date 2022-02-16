package by.home.java_fundamentals.Task04;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n -
четное)*/

public class SquareMatrixSizeNController {

	public static void main(String[] args) {

		SquareMatrixSizeNInput input = new SquareMatrixSizeNInput();

		int sizeOfMatrix = input.readEvenSizeOfMatrix("Enter even size of Matrix");
		SquareMatrixSizeNLogic logic = new SquareMatrixSizeNLogic();

		int[][] matrix = logic.createNMatrix(sizeOfMatrix);

		SquareMatrixSizeNView view = new SquareMatrixSizeNView();
		view.showMatrix(matrix);

	}

}
