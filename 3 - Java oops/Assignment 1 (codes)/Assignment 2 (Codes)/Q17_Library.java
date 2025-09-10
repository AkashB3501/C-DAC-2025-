/*

Problem 17: Library Book Addition
Scenario:
Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books

*/

class Book
{
 int bookid;
 String title;
 String author;
 
  Book(int bookid,String title,String author)
  {
	 this.bookid=bookid;
     this.title=title;
     this.author=author;
	  
  }

}
class Q17_Library{
	
	String labname;
	static int totalBooks= 0 ;
	
	
	Q17_Library(String labname)
	{
		this.labname=labname;
		
	}
	
	void addBook(Book b)
	{
		totalBooks++;
		System.out.println("Book added: "+b.title);
	}
	
	void displayTotalBooks()
	{
	 System.out.println("Total books in library: " + totalBooks);
	
	}
	
	public static void main(String args[])
	{
		Q17_Library lab = new Q17_Library("lab");
		
		lab.addBook(new Book(1,"java Basic","Manoj"));
		lab.addBook(new Book(2,"Python Basic","Ansh"));
		
		lab.displayTotalBooks();
	}
	
}

/*

PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac Q17_Library.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java Q17_Library
Book added: java Basic
Book added: Python Basic
Total books in library: 2

*/