package javaprogprac;

public class Exercisenestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "\t");
				k = k + 3;
			}
			System.out.println("");

		}

	}

}

/*
 * 3 
 * 6 9 
 * 12 15 18
 */