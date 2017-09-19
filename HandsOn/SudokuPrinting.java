
public class SudokuPrinting {

	public static void main(String[] args) {
		int[][] sudokuQuestionArray = new int[9][9];
		
		printSudoku(sudokuQuestionArray);
	}

	static void printSudoku(int[][] sudokuQuestionArray) {
		for (int i = 0; i < sudokuQuestionArray.length; i++) {
			if (i % 3 == 0)
				System.out.println("=======================");
			else
				System.out.println("-----------------------");

			for (int j = 0; j < sudokuQuestionArray[i].length; j++) {
				if (j % 3 == 0)
					System.out.print("**");
				else
					System.out.print("|");
				System.out.print(sudokuQuestionArray[i][j]);
				if (j == sudokuQuestionArray[i].length - 1)
					System.out.println("**");
			}
		}
		System.out.println("=======================");
	}

}
