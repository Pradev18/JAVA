class ArithmeticOperator{
	
	public void add(){
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	
	public void div(){
		float a,b,c;
		a=10;
		b=20;
		c=a/b;
		System.out.println(c);
	}
	
	public void sub(){
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
	}
	
	public void mul(){
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
	}
	
	public void mod(){
		float a,b,c;
		a=10;
		b=20;
		c=a%b;
		System.out.println(c);
	}
	
	
	
	public static void main(String args[]) {
		ArithmeticOperator ao = new ArithmeticOperator();
		ao.add();
		ao.div();
		ao.sub();
		ao.mul();
		ao.mod();
	}
	
	
		
}