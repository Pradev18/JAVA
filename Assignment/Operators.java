public class Operators {
    public void arithmeticOperators() {
        int x = 10;
        int y = 4;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("-------");
    }

    public void unaryOperators() {
        int x = 40;
        int y = 5;
        boolean z = true;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
        System.out.println("-x = " + (-x));
        System.out.println("!z = " + (!z));
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));
        System.out.println("y-- = " + (y--));
        System.out.println("--y = " + (--y));
        System.out.println("-------");
    }

    public void assignmentOperators() {
        int x = 50;
        int y = 9;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("x += 10 = " + (x += 10));
        System.out.println("y -= 10 = " + (y -= 10));
        System.out.println("x *= 10 = " + (y *= 10));
        System.out.println("y /= 10 = " + (y /= 10));
        System.out.println("x %= 10 = " + (x %= 10));
        System.out.println("-------");
    }

    public void relationalOperators() {
        int x = 2;
        int y = 3;
        int z = 4;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
        System.out.println("x == y = " + (x == y));
        System.out.println("y != z = " + (y != z));
        System.out.println("x < z = " + (x < z));
        System.out.println("x <= y = " + (x <= y));
        System.out.println("y > z = " + (y > z));
        System.out.println("x >= z = " + (x >= z));
        System.out.println("-------");
    }

    public void logicalOperators() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!c = " + (!c));
        System.out.println("-------");
    }

    public void ternaryOperators() {
        int x = 60;
        int y = 55;
        int result = (x > y) ? x : y;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of result: " + result);
        System.out.println("-------");
    }

    public static void main(String[] args) {
        Operators myObject = new Operators();
        myObject.arithmeticOperators();
        myObject.unaryOperators();
        myObject.assignmentOperators();
        myObject.relationalOperators();
        myObject.logicalOperators();
        myObject.ternaryOperators();
    }
}
