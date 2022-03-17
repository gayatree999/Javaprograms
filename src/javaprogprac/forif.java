package javaprogprac;

public class forif {
	
//WAP to find 9 from 1 to 10 and print if you find it or not
	
		public static void main(String[] args) {
			// 1 to 10
			/*for(initiazation;condition;increment) { } */

			 /* if(5>2) { System.out.println("success"); System.out.println("second step"); }
			 * else System.out.println("fail");
			 */
			
			for (int i = 0; i < 10; i = i + 3) {
				if (i == 9)
					System.out.println("9 is displayed");
				else
					System.out.println("I didnot find");//
			}

	}

}
