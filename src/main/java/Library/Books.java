package Library;

import java.util.ArrayList;
import java.util.List;

public class Books {

    protected String bookName;
    protected int numberOfPages;

    List<Books> books = new ArrayList<>();

    public void addBook(Books bookToAdd) {
        books.add(bookToAdd);

    }


    public void deleteBook(Books bookToDelete) {
        books.remove(bookToDelete);

    }

    public void listBooks() {
        for (int i=0;i<books.size()-1;i++){

            System.out.println(books.get(i));
        }


    }



}
