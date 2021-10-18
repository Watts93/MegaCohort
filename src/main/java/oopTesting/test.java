package oopTesting;

import com.softwareinstitute.Adult;
import com.softwareinstitute.Childrens;
import com.softwareinstitute.Teen;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Runner.*;

public class test {

    @Test
    public void testChildrens(){
        Childrens testChildrens = new Childrens("Cat in the Hat", "A Cat in the Hat Audio");
        assertEquals("The book was not the same", "Cat in the Hat",testChildrens.getBookTitle());

    }

    @Test
    public void testTeen(){
        Teen testTeens = new Teen("Twilight", "Twilight Audio");
        assertEquals("Not the same","Twilight", testTeens.getBookTitle());
    }


    @Test
    public void testAdult(){
        Adult testAdults = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        assertEquals("The book is not the same", "A Million Little Pieces",testAdults.getBookTitle());
    }


}
