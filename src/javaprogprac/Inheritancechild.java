package javaprogprac;

public class Inheritancechild extends Inheritanceparent{
	
	public void engine() {
		System.out.println("engine-child");
	}
	public void colourcls() {
		System.out.println(colour);
	}
	//function over riding
	public void breaks() {
		System.out.println("breaks overidden function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritancechild obj = new Inheritancechild();
		obj.engine();
		
		obj.Gear();
		obj.colourcls();
		
		obj.breaks();

	}

}
