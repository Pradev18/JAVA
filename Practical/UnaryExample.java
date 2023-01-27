class UnaryExample{

//--x or ++x pre and x++ or x-- post increment or decrement

	public void calcincrement(){
		int x = 10;
		System.out.println(x++); //store 10
		System.out.println(x); //incremented by 11
		System.out.println(x++); //shows update and store 11
		System.out.println(x); //incremented 12
		System.out.println(x++); //updates and store 12
		System.out.println(x); //incremented to 13
		System.out.println(++x); //incremented to 14 and shows the updated result
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
	}

	public void calcdecrement(){
		int x = 10;
			System.out.println("--------");
			System.out.println(x--); // sames as above
			System.out.println(x);
			System.out.println(x--);
			System.out.println(x);
			System.out.println(--x);
			System.out.println(x);
			System.out.println(--x);
			System.out.println(x);
			System.out.println(x--);
			System.out.println(x);
	}
	
	public void comparisonOperator() {
        System.out.println("-------");
        int x = 14;
        int y = 6;
        System.out.println(y > x);
        System.out.println(y < x);
        System.out.println(y == x);
    }

    public void logicalOperator() {
        System.out.println("-------");
        int x = 14;
        int y = 6;
        System.out.println((y == x) && (x > x));
        System.out.println((x > y) || (x++ > y));
    }

    public void bitwiseOperator() {
        System.out.println("-------");
        int x = 6;
        int y = 5;
        System.out.println((x > y) && (x++ < y));
        System.out.println((x > y) & (x++ < y));
        System.out.println((x > y) | (x++ > y)); 
    }

    public void ternaryOperator() {
        System.out.println("-------");
        int a = 2;
        int b = 3;
        int c = (a < b) ? a : b;
        System.out.println(c);
    }

	public static void main(String args[]) {
		UnaryExample id = new UnaryExample();
		id.calcincrement();
		id.calcdecrement();
		id.comparisonOperator();
		id.logicalOperator();
		id.bitwiseOperator();
		id.ternaryOperator();
	}
}
