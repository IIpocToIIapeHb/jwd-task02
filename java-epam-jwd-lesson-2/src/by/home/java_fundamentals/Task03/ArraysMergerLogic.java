package by.home.java_fundamentals.Task03;

public class ArraysMergerLogic {

	public double[] arraysMerger(int placeOfUnion, double[] array1, double[] array2) {

		double[] resultArray = new double[array1.length + array2.length];

		// input in result array elements from array1 before placeOfUnion(k)
		for (int i = 0; i < placeOfUnion; i++) {
			resultArray[i] = array1[i];
		}

		// input in result array the remaining elements from array1 in the end of the
		// result array
		for (int i = resultArray.length - 1; i >= placeOfUnion + array2.length; i--) {
			resultArray[i] = array1[i - array2.length];
		}

		// input in result array elements of array2 after placeOfUnion
		System.arraycopy(array2, 0, resultArray, placeOfUnion, array2.length);

		return resultArray;
	}

}