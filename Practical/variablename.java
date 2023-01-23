class variablename{
	static int num1 = 55;//static
	
	long num = 655894;//instance
	
	double num2 = 5321.111;
	
	public void display(){ //nonstatic 
		char a='A'; //local
		double d=5.5;
		System.out.println("local:"+a);
		System.out.println("double :"+d);
	}
	
	public static void calc(){
		double b =  99.34;
		double c = 45.23;
		double res = b*c;
		System.out.println("Result is:"+res);
	}
		
		public static void main(String args[]){
			variablename obj = new variablename(); //object creation
			obj.display(); //invoke nonstatic method with obj
			calc();//invoke static method
			System.out.println("Instance"+obj.num); //calling instance variable with object 
			System.out.println("Static"+num1);//calling static variable with class
			System.out.println("Instance"+obj.num2);
}
}