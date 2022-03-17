package javaprogprac;

public class Functionoverloading {

	public void getData(int a) {
	System.out.println(a);	
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionoverloading obj = new Functionoverloading();
		obj.getData(2);
		obj.getData("i am in string");
		obj.getData(4,6);
		
		
		
	}

}
