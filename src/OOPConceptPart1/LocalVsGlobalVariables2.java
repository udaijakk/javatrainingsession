package OOPConceptPart1;

public class LocalVsGlobalVariables2 {
	
	//global variables---- class variables
	String name = "uday";
	int age=25;

	public static void main(String[] args) {
		
		int i=90; //local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables2 obj=new LocalVsGlobalVariables2();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		String f=obj.sum();
		System.out.println(f);
	}
	
	public String sum() {
		int i=10; 
		int age=35;
		String name ="kiran"; //local variable for sum method
		
		return name;
	}

}
