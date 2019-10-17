package JavaBasics;

public class ifElseConcept1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
			else {
				System.out.println("a is greater than b");
			}
		
		System.out.println("**************************");
		
		
		//comparison operators
		// < >  <=  =>  == !=
		
		int x= 1090;
		int y= 1098;
		
		if(x<=y) {
			System.out.println("y is greater than x");
		}
		else {
			System.out.println("x is greater than y");
		}
		
		System.out.println("**************************");
		
		int k= 100;
		int l= 500;
		int m= 300;
		
		if(k>l & k>m) {
			System.out.println("k is the greatest");
		}else if(l>m) {
				System.out.println("l is the greatest");
			}
		else{
			System.out.println("m is the greatest");
		}
		
		}
	}

