package javaprogprac;

public class Aircraftchild extends Aircraftparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aircraftchild childobj = new Aircraftchild();
		childobj.colour();
		childobj.engine();
		childobj.safety();

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("Blue colour body");
	}

}
