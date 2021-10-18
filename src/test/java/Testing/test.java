package Testing;

import com.softwareinstitute.Adult;
import com.softwareinstitute.Childrens;
import com.softwareinstitute.Genre;
import com.softwareinstitute.Teen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class testBooks {
    Adult testBooks = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");

    @Test
    public void testGetAuthor() {
            assertEquals("James Frey", testBooks.getAuthor(), "Wrong author");
    }


}