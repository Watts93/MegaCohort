package oopTesting;

import com.softwareinstitute.Childrens;
import com.softwareinstitute.Teen;

import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

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

}
