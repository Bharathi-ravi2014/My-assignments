package week1.day1;

public class LibraryManagement {
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library driver1 = new Library();
		driver1.addBook();

		LibraryManagement driver2 = new LibraryManagement();
		driver2.issueBook();
		
	}

}
