package javaprogprac;

public class Nestedfor {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			System.out.println("outer loop started");
			for(int j=0; j<4; j++) {
				System.out.println("inner loop");
			}
			System.out.println("outer loop ended");
		}

	}

}
