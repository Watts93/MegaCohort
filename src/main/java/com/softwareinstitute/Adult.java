package com.softwareinstitute;

public class Adult extends com.softwareinstitute.Genre {

    public Adult(String bookTitle, String aBookTitle) {
        super(bookTitle, aBookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String plus18;
    private static String fEducation;
    private static String quickReads;
    private static String biographies;

    /////////////////////////////// Constructors //////////////////////////////////

    public static void adultConstruct (String author, String plus18, String fEducation, String quickReads, String biographies){
        Adult.author = author;
        Adult.plus18 = plus18;
        Adult.fEducation = fEducation;
        Adult.quickReads = quickReads;
        Adult.biographies = biographies;
    }

    //////////////////////////////// Methods ///////////////////////////////////////


    public static String getAuthor(String s){
        return (Adult.author);
    }

    public static String setAuthor(String author) {
        Adult.author = author;
        return author;
    }


    public static String getPlus18(){
        return ("This book is for over 18's only");
    }

    public static String setPlus18(String plus18) {
        Adult.plus18 = plus18;
        return plus18;
    }



    public static String getFEducation(){
        return ("This is an adult level educational book");
    }

    public static String setFEducation(String fEducation) {
        Adult.fEducation = fEducation;
        return fEducation;
    }


    public static String getQuickReads(){
        return ("This is an adult quick read");
    }

    public static String setQuickReads(String quickReads) {
        Adult.quickReads = quickReads;
        return quickReads;
    }


    public static String getBiographies(){
        return ("This is categorised as a biographical book");
    }

    public static String setBiographies(String biographies) {
        Adult.biographies = biographies;
        return biographies;
    }

    @Override
    public String fiction() {
        // if fiction return true
        return null;
    }

    @Override
    public String nonFiction() {
        // if non-fiction return true
        return null;
    }

    @Override
    public String borrowable() {
        //if borrowable return true
        return null;
    }


}
