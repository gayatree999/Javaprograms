package javaprogprac;
import java.util.ArrayList;

public class corejavabrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String website = "test";
		//char letter = 'r';
		//double dec2 = 5.4444;
		//boolean myCard = true;		
		System.out.println(num+ " is the value stored");
		System.out.println(website);
		
		//Array- more than one value into a variable
		int[] arr = new int [5];
		
		arr[0] = 1;
		arr[2] = 2;
		arr [3] = 5;
		arr [4] = 6;			
		for (int i =0; i < arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		
		//another way
		int[] arr2 = {10, 20, 30, 40, 500, 600};
		System.out.println(arr2[2]);
		for (int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = {"gayatri", "nayaka", "selenium"};
		
		for (int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("I");
		a.add("am");
		a.add("Learning");
		a.remove(1);
		System.out.println("because 1 index is removed, so Array List printing--"+a.get(1));
		
		
		
		
		
		
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(20);
		a1.add(60);
		int min=a1.get(0);
		for(int i=0; i<a1.size()-1;i++) {
			if(a1.get(i)<min) {
				min= a1.get(i);
			}
			
		}System.out.println("minimum in the array LIST="+min);
		
	
		//Learning String(string is an object) 
		// String literal- if value assigned to the variable is same, then the newly created variable will point to the previous value
		//String s1 = "This is string literal";
		//with new key word- everytime string created by new keyword, a different object is created, even if the value is same.
		//String s2 = new String("Welcome");
		//String s3 = new String("Welcome");
		
		String s4 = new String("The Nayak here");
		String[] splittedString = s4.split("Nayak");
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
