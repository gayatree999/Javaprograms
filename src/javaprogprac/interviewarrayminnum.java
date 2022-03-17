package javaprogprac;

public class interviewarrayminnum {
	public static void main(String[] args) {

		/*
		 * 1 2 3 
		 * 4 1 0 
		 * 7 8 7*/
		
		int abc[][] = { { 1, 2, 3 }, { 4, 1, 0 }, { 7, 8, 7 } };
		int min = abc[0][0];

		int mincolumn = 0;

		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc.length; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];

					mincolumn = j; // for next program

				}
			}
		}
		System.out.println(min); // prints minimum value of whole matrix

		// program to find minimum no of all rows, then print the max no of the column
		int max = abc[0][mincolumn];
		int k = 0;

		while (k < 3) {
			if (abc[k][mincolumn] > max) {
				max = abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}
}
