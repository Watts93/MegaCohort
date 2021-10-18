package com.softwareinstitute;


public class Teen extends com.softwareinstitute.Genre {


    public Teen(String BookTitle, String ABookTitle) {
        super(BookTitle, ABookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String GCSE;
    private static String ALevel;
    private static String teenQuickReads;

    ///////////////////////////////// Constructors //////////////////////////////////



    public void Teen (String BookTitle, String author, String GCSE, String ALevel, String teenQuickReads){
        Teen.author = author;
        Teen.GCSE = GCSE;
        Teen.ALevel = ALevel;
        Teen.teenQuickReads = teenQuickReads;
    }

    //////////////////////////////// Methods ///////////////////////////////////////


    public static String getAuthor(){
        System.out.println("Author: "+ author);
        return author;
    }

    public void setAuthor(String author) {
        Teen.author = author;
    }


    public static String getGCSE() {
        System.out.println("This is a GCSE level educational book");
        return GCSE;
    }

    public void setGCSE(){
        Teen.GCSE = GCSE;
    }


    public static String getALevel() {
        System.out.println("This is an A Level educational book");
        return ALevel;
    }

    public void setALevel(){
        Teen.ALevel = ALevel;
    }


    public static String getTeenQuickReads() {
        System.out.println("This book is categorised as a Teen Quick Read");
        return teenQuickReads;
    }

    public void setTeenQuickReads(){
        Teen.teenQuickReads = teenQuickReads;
    }

}
