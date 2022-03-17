package javaprogprac;

public class StaticVariable {
	
	String name;
	String address;
	static String city="Bengaluru"; //class variables
	static int i=0;
	
	static String s1;
	static int j;
	//static block
	static {
		s1="Pune";
		j=10;
	}
	
	StaticVariable(String name, String address) {
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getData() {
		System.out.println(address+" "+city);
	}
	
	public static void getcity() {
		System.out.println(city);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj = new StaticVariable("gayatri", "jayanagar");
		StaticVariable obj2 = new StaticVariable("ram","whitefield");
		StaticVariable obj3 = new StaticVariable("ram","whitefield");
		//to call variables of constructor, craete and use objects
		obj.getData();
		obj2.getData();
		
		//to call static method - classname.methodname
		StaticVariable.getcity();
		
		//to call static variables(otherwise known as class variables, use- classname.variablename
		StaticVariable.i=22;
		System.out.println(i);

	}

}
