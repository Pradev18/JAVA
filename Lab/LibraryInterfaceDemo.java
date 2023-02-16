import java.util.Scanner;
public class LibraryInterfaceDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Attempt1 Enter your age for KidUser: ");
		int x  = sc.nextInt();
		KidUsers ku=new KidUsers();
		ku.setAge(x);
		ku.setBookType("Kids");
		ku.registerAccount();
		ku.requestBook();
		
		System.out.println("Attemp2 Enter your age for KidUser: ");
		int m  = sc.nextInt();	
		ku.setAge(m);	
		ku.setBookType("Fiction");		
		ku.registerAccount();
		ku.requestBook();
		
		
		
		AdultUser au = new AdultUser();
		System.out.println("Attempt1 your age for AdultUser: ");
		int y  = sc.nextInt();
		au.setAge(y);
		au.setBookType("Kids");
		au.registerAccount();
		au.requestBook();
		
		System.out.println("Attempt2 your age for AdultUser: ");
		int z  = sc.nextInt();
		au.setAge(z);	
		au.setBookType("Fiction");		
		au.registerAccount();
		au.requestBook();
		
		sc.close();
		
		
		
		
	}

}
