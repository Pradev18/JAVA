//using the some properties of superior one or previous one is inheritance
//why to use- overriding(change the existing value) , reusable,  super - parent and without super - child
//what is object? it is instance

class Owner{
	final int area = 10000; //area cannot be change from 10000 as it is a final
	String dateofPurchase = "6-6-2002";
	String name = "Pradev";
	boolean noc = true;
	
	public void renew(){
		String color = "blue";
		String flat = "2bhk";
		int ceilheight =8;
		System.out.println("Old flat value: "+(color+" "+flat+" "+ceilheight));
		
	}
}

class New_Owner extends Owner{
	String dateofRegister = "3-2-2023";
	double flatvalue =30.555555;
	String name = "Vaishnavi";
	
	public void display(){
		System.out.println("Area is: "+area);
		System.out.println("Name: "+super.name); //use of super to access parent property
		System.out.println("Current flatvalue: "+flatvalue);
		System.out.println("New owner: "+name);
	}
	
	public void renew(){
		String color = "offwhite";
		String flat = "3bhk";
		int ceilheight = 10;
		
		System.out.println("New flat value: "+(color +" "+ flat +" "+ ceilheight));
		super.renew(); //call parent method
	}
	
}

class inheritanceExample{
	public static void main(String args[]){
		New_Owner c = new New_Owner(); //child class object
		c.display(); //invoke child to access child & parent property
		c.renew(); //invoke child method
	}
}