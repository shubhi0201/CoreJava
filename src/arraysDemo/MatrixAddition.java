package arraysDemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 11:57:35 AM
 * project : CoreJava

 */
public class MatrixAddition {

	public static void main(String[] args) {
		// Define two 2x3 matrices
		int [][] matrix1 = {
				{1,2,3},
				{4,5,6}
		};
		int [][] matrix2 = {
				{7,8,9},
				{10,11,12}
		};

		// create a result matrix with same size

		int rows = matrix1.length;
		int cols = matrix2[0].length;
		int[][] result = new int[rows][cols];
		//perform matrix addition

		for(int i =0 ;i<rows;i++) {
			for(int j=0;j<cols;j++){
				result[i][j] = matrix1[i][j]+ matrix2[i][j];
			}



		}
		//Display results

		System.out.println( "Result of Matrix Addition");
		for(int i =0 ;i<rows;i++) {
			for(int j=0;j<cols;j++){
				System.out.print( result[i][j]+ " ");
			}

			System.out.println();

		}

		// TODO Auto-generated method stub

	}

}
