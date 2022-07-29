package javaprogprac;

public class Reversestring {

	public static void main(String[] args) {

		/* String str= "Geeks", nstr=""; char ch; 
		 * System.out.print("Original word: "); System.out.println("Geeks"); //Example
		 * for (int i=0; i<str.length(); i++) { ch= str.charAt(i); //extracts each
		 * character nstr= ch+nstr; //adds each character in front of the existing
		 * string } System.out.println("Reversed word: "+ nstr); }
		 */
		
		String str = "Gayatri", nstr = "";
		char ch;
		System.out.println("Original word is Gaytri");
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("reverse=" + nstr);
				
//////////////////////////////////////////////////////////////////////////////	
	
	//Reverse a number
	int number = 987654;
	int reverse = 0;
	
	while(number != 0)   
	{  
	int reminder = number % 10;  
	reverse = reverse * 10 + reminder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);
	}	
	

}
