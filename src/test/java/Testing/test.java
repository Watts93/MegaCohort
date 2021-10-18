package Testing;

import com.softwareinstitute.Adult;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class testBooks {
    Adult testBooks = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");

    @Test
    public void testQuickReads() {
           Adult adultTestQuickRead = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
           String result = adultTestQuickRead.getQuickReads();
           Assert.assertEquals("This is an adult quick read", com.softwareinstitute.Adult.getQuickReads());


    }


}