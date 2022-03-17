package javaprogprac;

public class multidimensionalarray {

	public static void main(String[] args) {		
/*output as-
1 2 3
4 5 6
 or,
2 4 6
1 3 5
8 10 12*/
		int a[][] = new int [2][3];	
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		System.out.println(a[0][2]); //output-3
		
		int b[][]= {{2,4,6},{1,3,5},{8,10,12}};
		System.out.println(b[1][2]); //output 5
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		} 		
	}

}
