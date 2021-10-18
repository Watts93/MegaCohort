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



    public static void Teen (String BookTitle, String author, String GCSE, String ALevel, String teenQuickReads){
        Teen.author = author;
        Teen.GCSE = GCSE;
        Teen.ALevel = ALevel;
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
        System.out.println("This is a GCSE level educational book");
        return Teen.GCSE;
    }

    public static void setGCSE(){
        Teen.GCSE = GCSE;
    }


    public static String getALevel() {
        System.out.println("This is an A Level educational book");
        return Teen.ALevel;
    }

    public static void setALevel(){
        Teen.ALevel = ALevel;
    }


    public static String getTeenQuickReads() {
        System.out.println("This book is categorised as a Teen Quick Read");
        return Teen.teenQuickReads;
    }

    public static void setTeenQuickReads(){
        Teen.teenQuickReads = teenQuickReads;
    }

}
