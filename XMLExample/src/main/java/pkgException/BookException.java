package pkgException;
import pkgLibrary.Book;

public class BookException extends Exception {

	private Book b;
	private String id;
	public BookException(Book b) {
		super();
		this.b = b;
	}
	public BookException(String id) {
		super();
		this.id = id;
	}

	protected Book getB() {
		return b;
	}
	protected String getID() {
		return id;
	}
	
	
}
