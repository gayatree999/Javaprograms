package packagedemo3;

import javaprogprac.packagedemo; //user defined package 
//java.lang- default package - comes with java compiler, which is responsible for several methods we use in java like println
//java.util- collection interfaces
//java.io- input output

public class packagedemo4 extends packagedemo{

	public static void main(String[] args) {
		
		packagedemo obj2= new packagedemo();//to create object of a class from other package, you have to import that package first by import.packagename.classname
		packagedemo4 obj3 = new packagedemo4();
		//obj2.a;
		obj2.abc();
		obj3.test2();

	}

}
