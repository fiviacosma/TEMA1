package Library;

import Models.ArtAlbums;
import Models.Novels;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    public static void main(String... args) {

        Novels nuvela1 = new Novels();
        nuvela1.bookName = "Harry Potter";
        nuvela1.numberOfPages= 200;
        nuvela1.type = "adventure";
        Novels nuvela2 = new Novels();
        ArtAlbums artAlbum1 = new ArtAlbums();
        ArtAlbums artAlbum2 = new ArtAlbums();

        Books book = new Books();
        book.addBook(nuvela1);
        book.addBook(nuvela2);
        book.addBook(artAlbum1);
        book.addBook(artAlbum2);

        book.listBooks();

        book.deleteBook(artAlbum1);






    }

}
