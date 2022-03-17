package javaprogprac;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		a[0] = 2;
		a[1]=4;
		a[2]=6;
		
		int b[]= {1,2,3,4,5,6};
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]);
		}
		

	}

}
