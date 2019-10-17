package ConstrConcept;

public class ConstructorPractice {
	private static final int String = 0;
	//Class var or Global Var
	String name;
	int age;
	
	
	public ConstructorPractice() {
		System.out.println("Default const");
	}
	
	public ConstructorPractice(int i) {
		System.out.println("1 par const");
		System.out.println(i);
	}
	
	public ConstructorPractice(int i, int j) {
		System.out.println("2 par const");
		System.out.println(i + " " + j);
	}
	
	public ConstructorPractice(String name1,int age1) {
	//	this.name=name;
	//	this.age=age;
		
		name =name1;
		age=age1;
		
	}
	
	public static void main(String[] args) {
		ConstructorPractice obj =new ConstructorPractice();
		ConstructorPractice obj1=new ConstructorPractice(100);
		ConstructorPractice obj2=new ConstructorPractice(10,20);
		ConstructorPractice obj3=new ConstructorPractice("Uday",26);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);

	}

}
