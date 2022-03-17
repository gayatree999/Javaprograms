package javaprogprac;

public class packagedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	int i=0; //default variable, can be access inside the same package
	
	public int a = 1; //public access modifier, can be accessed in any package, after importing it
	
	
	public void abc() { //Public access modifier -public -means you can access in any package after you import it
		System.out.println("class in javaprogprac package");
	}
	
	void xyz() { //Default access modifier -means you can access in same package and not in other packages
		System.out.println("default package");
	}
	
	private void test1() {  //Private access modifier means you can not access outside of the class
		System.out.println("private");
	}
	
	protected void test2() { //Protected access modifier means you can access anywhere in the same package , but for other package you have to extend this class
		System.out.println("protected");
	}



}
