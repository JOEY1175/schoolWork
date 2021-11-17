//Sciencefiction class
//extends book
public class SciFiction extends Book
{
	//constructor
	public SciFiction(String title)
	{
		super(title);
		
		setBookPrice();
	}
	
	//actually set the book price
	public void setBookPrice()
	{
		bookPrice = 21.99;
	}
}