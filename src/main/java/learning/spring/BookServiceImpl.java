package learning.spring;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Override
    public void sayHello() {
        System.out.println("hello ,word");
    }

    public BookDAO getBookDAO() {return bookDAO;}


    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
