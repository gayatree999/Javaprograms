package javaprogprac;

public class reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s4 = new String("I am Gayatri");
		String[] splittedString = s4.split("am");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i = 0; i<s4.length(); i++)
		{
			System.out.println(s4.charAt(i));
		}
		//To print the string in reverse
		for(int i=s4.length()-1; i>=0; i--)
		{
			System.out.println(s4.charAt(i));
		}
	}

}


