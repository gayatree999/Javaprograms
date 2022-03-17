package javaprogprac;

public class SuperkeywordChild extends Superkeywordparent{
	String name= "Gayatri 2";
	
	public void superkey() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void duplicate() {
		System.out.println("in child");
		super.duplicate();
	}
	
	//Constructor
	public SuperkeywordChild() {
		super(); //Constructor call should always be the first statement
		System.out.println("child class constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperkeywordChild cd = new SuperkeywordChild();
		cd.superkey();
		cd.duplicate();
	}
}
