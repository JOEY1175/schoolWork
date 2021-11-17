//fiction class
//extends book
public class Fiction extends Book
{
	//constructor
	public Fiction(String title)
	{
		super(title);
		
		setBookPrice();
	}
	
	//actually set the book price
	public void setBookPrice()
	{
		bookPrice = 22.99;
	}
}