package pkgEmpty;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import pkgException.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookTest {

	@Test
	public void GetBookTest() throws BookException {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		Book b = new Book(cat,"bk104");
		assertEquals("Fantasy",b.getGenre());
	}
	
	@Test
	public void AddBookTest() throws BookException{
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		cat.AddBook(new Book("bk120","author","title","genre", 42.0, new Date(2012,9,15),
			"description", 22.10));
		Book b = new Book(cat,"bk120");
		assertEquals("description",b.getDescription());
		
	}
}
