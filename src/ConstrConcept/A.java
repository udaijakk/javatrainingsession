package ConstrConcept;

public class A {
	
	public A() {
		System.out.println("parent default const...........");
	}
	
	public A(int i) {
		System.out.println("parent class with value of i" + i);
	}
	
	public A(String name, int i) {
		System.out.println("parent class with value is " + name +" "+ i);
	}


}
