package ConstrConcept;

public class B extends A {
	
	public B() {
		super();
	}
	
	public B(int i) {
		super(i);
	}
	
	public B(String name,int i) {
		super(name,i);
	}

	public static void main(String[] args) {
		B obj=new B();
		B obj1=new B(10);
		B obj2=new B("uday",50);

	}

}
