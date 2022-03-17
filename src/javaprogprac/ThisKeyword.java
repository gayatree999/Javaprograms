package javaprogprac;

public class ThisKeyword {
	
	int a = 4;
	
	public void getdata() {
		int a =8;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a+this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		obj.getdata();

	}

}
