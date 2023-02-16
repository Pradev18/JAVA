
public class KidUsers implements LibraryUser{
	private int age;
	private String bookType;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

		
	
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account \n");
		}
		
		if(age>12)
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid \n");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days \n");
		}
		
		else {
			System.out.println("Oops, you are allowed to take only kids books \n");
		}
		
	}

}
