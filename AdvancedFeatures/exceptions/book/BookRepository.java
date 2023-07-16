package exceptions.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) throws NoBookFoundException {
        Iterator<Book> iterator = books.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (!found) {
            throw new NoBookFoundException("No book found with ID: " + id);
        }
    }

    public List<Book> searchBooksByName(String name) throws NoBookFoundException {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            throw new NoBookFoundException("No books found with name: " + name);
        }

        return foundBooks;
    }

    public Book searchBookById(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        throw new NoBookFoundException("No book found with ID: " + id);
    }
}
