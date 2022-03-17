package javaprogprac;

public class AustrafficImplimentingCentralrules implements Centraltrafficrule, ContinentalTrafficrule{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Centraltrafficrule obj = new AustrafficImplimentingCentralrules();
		obj.greenGo();
		obj.redStop();
		obj.OrangeWait();
		
		ContinentalTrafficrule obj2 = new AustrafficImplimentingCentralrules();
		obj2.trainrule();
		
		AustrafficImplimentingCentralrules objofclass = new AustrafficImplimentingCentralrules();
		objofclass.walk();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Geen GO");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop");
		
	}

	@Override
	public void OrangeWait() {
		// TODO Auto-generated method stub
		System.out.println("Orange Wait");
		
	}
	
	public void walk() {
		System.out.println("walikng");
	}

	@Override
	public void trainrule() {
		// TODO Auto-generated method stub
		System.out.println("train symbol");
		
	}

}
