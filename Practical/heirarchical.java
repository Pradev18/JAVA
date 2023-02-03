class Iphone{
	double price = 50000.2500;
	String os="IOS";
}

class Iphone13pro extends Iphone{ //taking the properties from parent class
	String name = "Iphone13pro";
	double price = 125000.25005;
	public void display(){
		System.out.println(" ");
		
		System.out.println("Child 1 of parent");
		System.out.println("Iphone OS: "+os);
		System.out.println("Iphone name: "+name);
		System.out.println("Iphone price: "+price);
		System.out.println("Iphone starting price: "+super.price);
		
	}
	
}

class Iphone14pro extends Iphone{ //taking the properties from parent class
	String name = "Iphone14pro";
	double price = 135000.35600;
	public void Display(){
		System.out.println(" ");
		
		System.out.println("Child 2 of parent");
		System.out.println("Iphone OS: "+super.os); //or either u can call by super method
		System.out.println("Iphone name: "+name);
		System.out.println("Iphone price: "+price);
		System.out.println("Iphone starting price: "+super.price);
	}
}

class heirarchical {
	public static void main(String args[]){
		Iphone13pro first = new Iphone13pro();
		Iphone14pro second = new Iphone14pro();
		first.display();
		second.Display();
		
	}
}