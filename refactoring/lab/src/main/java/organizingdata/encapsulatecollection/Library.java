package organizingdata.encapsulatecollection;

import java.util.List;

public class Library {
    private List<Book> books;
    public Library(List<Book> books) {
        this.books = books;
    }
    public List<Book> getBooks() {
        return List.copyOf(books);
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

}
