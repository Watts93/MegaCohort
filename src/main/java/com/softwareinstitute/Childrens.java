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


    public static void Childrens (String bookTitle, String author, int targetAge, String nurseryRhymes, String interactive, String picture){
        Childrens.author = author;
        Childrens.targetAge = 10;
        Childrens.nurseryRhymes = nurseryRhymes;
        Childrens.interactive = interactive;
        Childrens.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////


    //Author
    public static String getAuthor(){
        System.out.println("Author: "+ Childrens.author);
        return Childrens.author;
    }

    public static void setAuthor(String author) {
        Childrens.author = author;
    }


    public static int getTargetAge() {
        System.out.println("The target age for this book is "+ Childrens.targetAge);
        return Childrens.targetAge;
    }

    public static void setTargetAge(int i){
        Childrens.targetAge = targetAge;
    }


    public static String getNurseryRhymes() {
        System.out.println("This is classed as a Nursery Rhyme book");
        return Childrens.nurseryRhymes;

    }

    public static void setNurseryRhymes(String nurseryRhymes) {
        Childrens.nurseryRhymes = nurseryRhymes;
    }


    public static String getInteractive() {
        System.out.println("This is an interactive book");
        return Childrens.interactive;
    }

    public static void setInteractive(String interactive) {
        Childrens.interactive = interactive;
    }


    public static String getPicture() {
        System.out.println("This is a picture book");
        return Childrens.picture;
    }

    public static void setPicture(String picture){
        Childrens.picture = picture;
    }


    @Override
        public void fiction() {
        // if fiction return true
    }

    @Override
        public void non_fiction() {
        // if non-fiction return true
    }

    @Override
    public void borrowable() {
        //if borrowable return true
    }
}
