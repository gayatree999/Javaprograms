package javaprogprac;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 4;
		int b= 0;
		
		
			
		try {  //try block can be followed by multiple catch blocks
			//int c= a/b;
			//System.out.println(c);
			
			int arr[]=new int[4];  //declaring an array of size 4
			System.out.println(arr[7]); // but printing the 6th index of array, should throw error as -index out of bound, which is catched later
		}
		
		catch(IndexOutOfBoundsException ets) { //for array
			System.out.println("index out of bound");
		}
		
		catch (ArithmeticException et) { //for arithmetic errors
			System.out.println("arithmetic");
		}
		
	
		catch(Exception e){  //this is generic //catch block should be the immediate follower of try block
			System.out.println("catched the exception");
		}
		finally {  //this block executes irrespective of error occurs or not 
			//finally is written with try block
			System.out.println("close browser/delete cookies");
		}


	}

}
