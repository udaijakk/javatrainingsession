package ConstrConcept;

public class Car {
	String Carname;
	String fuel;
	int Price;
	
	public Car(String Carname, String fuel, int Price) {
		this.Carname=Carname;
		this.fuel=fuel;
		this.Price=Price;
	}

	public static void main(String[] args) {
		
		Car obj=new Car("Hyundai","petrol",10);
		Car obj1=new Car("BMW", "Diesel", 20);
		Car obj2=new Car("Porsche", "Gas", 30);
		
		System.out.println(obj.Carname+ " " + obj.fuel+" "+ obj.Price);
		
		
	}
}
