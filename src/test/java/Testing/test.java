package Testing;

import com.softwareinstitute.Adult;
import com.softwareinstitute.Childrens;
import com.softwareinstitute.Teen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class test {


    @Test
    void testChildrens(){
        Childrens testChildrens = new Childrens("Cat in the Hat", "A Cat in the Hat Audio");
        assertEquals("The book was not the same", "Cat in the Hat",testChildrens.getBookTitle());

    }

    @Test
    void testTeen(){
        Teen testTeens = new Teen("Twilight", "Twilight Audio");
        assertEquals("Not the same","Twilight", testTeens.getBookTitle());
    }


    @Test
    void testAdult(){
        Adult testAdults = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        assertEquals("The book is not the same", "A Million Little Pieces",testAdults.getBookTitle());
    }


}