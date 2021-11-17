//abstract class: book.java

public abstract class Book
{
	//variables
	
	private String bookTitle;
	
	protected double bookPrice;
	
	//constructor
	public Book(String title)
	{
		bookTitle = title;
		
		bookPrice = 0;
	}
	
	//getter for booktitle
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	//getter for bookprice
	public double getBookPrice()
	{
		return bookPrice;
	}
	
	//setbookprice
	public abstract void setBookPrice();
}