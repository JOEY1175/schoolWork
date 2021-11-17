//Nonfiction class
//extends book
public class NonFiction extends Book
{
	//constructor
	public NonFiction(String title)
	{
		super(title);
		
		setBookPrice();
	}
	
	//actually set the book price
	public void setBookPrice()
	{
		bookPrice = 35.99;
	}
}