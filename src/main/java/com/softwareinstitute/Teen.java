package com.softwareinstitute;


public class Teen extends com.softwareinstitute.Genre {


    public Teen(String bookTitle, String aBookTitle) {
        super(bookTitle, aBookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String gcse;
    private static String aLevel;
    private static String teenQuickReads;

    ///////////////////////////////// Constructors //////////////////////////////////



    static void teenConstruct (String author, String gcse, String aLevel, String teenQuickReads){
        Teen.author = author;
        Teen.gcse = gcse;
        Teen.aLevel = aLevel;
        Teen.teenQuickReads = teenQuickReads;
    }

    //////////////////////////////// Methods ///////////////////////////////////////


    public static String getAuthor(){
        return (Teen.author);
    }

    public static void setAuthor(String author) {
        Teen.author = author;
    }


    public static String getGCSE() {
        return ("This is a GCSE level educational book");
    }

    public static void setGCSE(){
        Teen.gcse = gcse;
    }


    public static String getALevel() {
        return ("This is an A Level book");
    }

    public static void setALevel(){
        Teen.aLevel = aLevel;
    }


    public static String getTeenQuickReads() {
        return ("This book is categorised as a Teen Quick Read");
    }

    public static void setTeenQuickReads(){
        Teen.teenQuickReads = teenQuickReads;
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
