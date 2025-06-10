package week2.day1homeassignment;

public class Library {

	//Define a method addBook(String bookTitle) with one input argument. 
	public String addBook(String bookTitle) {
		
		// Print the statement "Book added successfully" 
		System.out.println("Book added successfully");
		
		//Add a return statement to return the bookTitle. 
		return bookTitle;
	}
	
	//Define a method issueBook(). 
	private void issueBook() {
		
		//Print the statement "Book issued successfully".
		System.out.println("Book issued successfully");
	}


	public static void main(String[] args) {
		Library bookStatus = new Library();
		
		//Call both methods using the object.
		bookStatus.addBook("Book added successfully");
		bookStatus.issueBook();
			

	}

}
