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
        System.out.println("Author: "+ Teen.author);
        return Teen.author;
    }

    public static void setAuthor(String author) {
        Teen.author = author;
    }


    public static String getGCSE() {
        System.out.print("This is a GCSE level educational book");
        return Teen.gcse;
    }

    public static void setGCSE(){
        Teen.gcse = gcse;
    }


    public static String getALevel() {
        System.out.print("This is an A Level book");
        return Teen.aLevel;
    }

    public static void setALevel(){
        Teen.aLevel = aLevel;
    }


    public static String getTeenQuickReads() {
        System.out.print("This book is categorised as a Teen Quick Read");
        return Teen.teenQuickReads;
    }

    public static void setTeenQuickReads(){
        Teen.teenQuickReads = teenQuickReads;
    }

    @Override
    public void fiction() {
        // if fiction return true
    }

    @Override
    public void nonFiction() {
        // if non-fiction return true
    }

    @Override
    public void borrowable() {
        //if borrowable return true
    }

}
