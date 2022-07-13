public class Book extends TangileAsset{
	private String isbn;
	public Book(String name,int price,Stirng color,Stirng isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
