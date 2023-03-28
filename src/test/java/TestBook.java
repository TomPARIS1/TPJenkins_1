import org.junit.jupiter.api.Test;
import java.util.Date;
import book.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {

    @Test
    public void testBook(){
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", new Date());
        assertEquals("The Hobbit", book.getTitre());
        assertEquals("J.R.R. Tolkien", book.getAuteur());
        assertEquals(new Date(), book.getPublication());
    }

}