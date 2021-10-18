package Testing;

import com.softwareinstitute.Adult;
import com.softwareinstitute.Teen;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class test {
    Adult testBooks = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");

    @Test
    public void testQuickReads() {
           Adult adultTestQuickRead = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
           String result = adultTestQuickRead.getQuickReads();
           Assert.assertEquals("This is an adult quick read", com.softwareinstitute.Adult.getQuickReads());
    }

    @Test
    public void testQuickReadSet() {
        Adult adultTestQuickReadSet = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestQuickReadSet.setQuickReads(" ");
        Assert.assertEquals(" ", com.softwareinstitute.Adult.setQuickReads(" "));
    }


    @Test
    public void testPlus18() {
        Adult adultTestPlus18 = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestPlus18.getPlus18();
        Assert.assertEquals("This book is for over 18's only", com.softwareinstitute.Adult.getPlus18());
    }

    @Test
    public void testPlus18Set() {
        Adult adultTestPlus18Set = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestPlus18Set.setPlus18(" ");
        Assert.assertEquals(" ", com.softwareinstitute.Adult.setPlus18(" "));
    }


    @Test
    public void testFEducation() {
        Adult adultFEducation = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultFEducation.getFEducation();
        Assert.assertEquals("This is an adult level educational book", com.softwareinstitute.Adult.getFEducation());
    }

    @Test
    public void testFEDSet() {
        Adult adultTestFEDSet = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestFEDSet.setFEducation(" ");
        Assert.assertEquals(" ", com.softwareinstitute.Adult.setFEducation(" "));
    }


    @Test
    public void testBios() {
        Adult adultTestBios = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestBios.getBiographies();
        Assert.assertEquals("This is categorised as a biographical book", com.softwareinstitute.Adult.getBiographies());
    }

    @Test
    public void testBiosSet() {
        Adult adultTestBiosSet = new Adult("A Million Little Pieces", "A Million Little Pieces Audio");
        String result = adultTestBiosSet.setBiographies(" ");
        Assert.assertEquals(" ", com.softwareinstitute.Adult.setBiographies(" "));
    }




}
