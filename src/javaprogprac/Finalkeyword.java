package javaprogprac;

public class Finalkeyword {
	
	final void getData() {
		//If Class name as final, then you can not extend that class
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i=6;  //you can not change the value of a variable with final keyword  
		//i=5;  //this will now throw error
	}

}
