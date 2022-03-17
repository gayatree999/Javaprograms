package javaprogprac;

public class pyramidofnumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*"+"\t");
				k++;
			}
			System.out.println("");
			
		}
		
		for(int l=1;l<=4;l++) {
			
			for(int m=1;m<=4-l;m++) {
				
				System.out.print(k+"\t");
				k++;
			}
			System.out.println("");
			
		}

	}

}
