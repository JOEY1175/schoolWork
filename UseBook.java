//usebook
public class UseBook
{
	//main method
	
	public static void main(String[] args)
	{
		//object for scifi
		
		SciFiction sciFi = new SciFiction("Ender's Game");
		
		//details on book
		System.out.println("Science Fiction Book Attributes");
		
	System.out.println("Name: " + sciFi.getBookTitle());
	
	System.out.println("Price: $" + sciFi.getBookPrice());
	
		//object for fiction
		
		Fiction fic = new Fiction("The Hobbit");
		
		//details on book
		System.out.println("\nFiction Book Attributes");
		
	System.out.println("Name: " + fic.getBookTitle());
	
	System.out.println("Price: $" + fic.getBookPrice());
	
		//object for nonfiction
		
		NonFiction nonFic = new NonFiction("Just Us");
		
		//details on book
		System.out.println("\nNon-Fiction Book Attributes");
		
	System.out.println("Name: " + nonFic.getBookTitle());
	
	System.out.println("Price: $" + nonFic.getBookPrice());
	}
}
	
	