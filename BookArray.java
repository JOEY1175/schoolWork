//Book Array
public class BookArray
{
	//main method
	public static void main(String[] args)
	{
		//array to store books
		Book books[] = new Book[10];
		
		//some scifiction
		
		books[0] = new SciFiction("Ender's Game");
		
		books[1] = new SciFiction("Dune");
		
		books[2] = new SciFiction("Hitchhiker's Guide to the Galaxy");
		
		// some nonfiction
		
		books[3] = new NonFiction("The Emperor of All Maladies");
		
		books[4] = new NonFiction("In Cold Blood");
		
		books[5] = new NonFiction("The Warmth of Other Suns");
		
		//some fiction
		
		books[6] = new Fiction("Eragon");
		
		books[7] = new Fiction("The Hobbit");

		books[8] = new Fiction("A Game of Thrones");

		books[9] = new Fiction("The Princess Bride");
		
		//book attributes
	System.out.println("Book Attributes");
	
	//loop
	for(int i=0; i < books.length; i++)
		
		{
			
			System.out.println((i + 1) + "\nTitle: " + books[i].getBookTitle());
			
			System.out.println("Price: $" + books[i].getBookPrice() + "\n");
		}
	}
}

	