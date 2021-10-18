package com.softwareinstitute;

public class Childrens extends com.softwareinstitute.Genre {


    public Childrens(String bookTitle, String aBookTitle) {
        super(bookTitle, aBookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static int targetAge;
    private static String nurseryRhymes;
    private static String interactive;
    private static String picture;

    ///////////////////////////////// Constructors //////////////////////////////////


    public static void childrenConstruct (String author, int targetAge, String nurseryRhymes, String interactive, String picture){
        Childrens.author = author;
        Childrens.targetAge = 10;
        Childrens.nurseryRhymes = nurseryRhymes;
        Childrens.interactive = interactive;
        Childrens.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////


    //Author
    public static String getAuthor(){
        return ("Author: "+ Childrens.author);
    }

    public static void setAuthor(String author) {
        Childrens.author = author;
    }


    public static String getTargetAge() {
        return ("The target age for this book is "+ Childrens.targetAge);
    }

    public static void setTargetAge(int targetAge){
        Childrens.targetAge = targetAge;
    }


    public static String getNurseryRhymes() {
        return ("This is classed as a Nursery Rhyme book");
    }

    public static void setNurseryRhymes(String nurseryRhymes) {
        Childrens.nurseryRhymes = nurseryRhymes;
    }


    public static String getInteractive() {
        return ("This is an interactive book");
    }

    public static void setInteractive(String interactive) {
        Childrens.interactive = interactive;
    }


    public static String getPicture() {
        return ("This is a picture book");
    }

    public static void setPicture(String picture){
        Childrens.picture = picture;
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
