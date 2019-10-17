package JavaBasics;

public class StringConcatenation1 {
	
	public static void main(String [] args) {
		
		int a = 100;
		int b = 200;
		
		String s = "joey";
		String s1 = "Ross";
		
		double x = 12.34;
		double y = 23.45;
		
		System.out.println(a+b);
		System.out.println(a+b+s);
		System.out.println(s+a+b);
		System.out.println(x+y);
		System.out.println(x+y+s1);
		System.out.println(s+s1+(a+b));
		System.out.println(s+x+(a+b)+s1);
		
	}

}
