package Scenario1;

public class Tester1 {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.m1();
		obj.m2();
		Parent.m2();
		obj.m3();
		
	}
}

//output

//in show-parent m1
//in static-display-parent m2
//in static-display-parent m2
//in child-m3