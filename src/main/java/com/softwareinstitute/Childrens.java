package com.softwareinstitute;

public class Childrens extends com.softwareinstitute.Genre {


    public Childrens(String BookTitle, String ABookTitle) {
        super(BookTitle, ABookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static int targetAge;
    private static String nurseryRhymes;
    private static String interactive;
    private static String picture;

    ///////////////////////////////// Constructors //////////////////////////////////


    public void Childrens (String BookTitle, String author, int targetAge, String nurseryRhymes, String interactive, String picture){
        Childrens.author = author;
        Childrens.targetAge = 10;
        Childrens.nurseryRhymes = nurseryRhymes;
        Childrens.interactive = interactive;
        Childrens.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////


    //Author
    public static String getAuthor(){
        System.out.println("Author: "+ author);
        return author;
    }

    public static void setAuthor(String author) {
        Childrens.author = author;
    }


    public static int getTargetAge() {
        System.out.println("The target age for this book is "+ targetAge);
        return targetAge;
    }

    public static void setTargetAge(int i){
        Childrens.targetAge = targetAge;
    }


    public static String getNurseryRhymes() {
        System.out.println("This is classed as a Nursery Rhyme book");
        return nurseryRhymes;

    }

    public static void setNurseryRhymes(String nurseryRhymes) {
        Childrens.nurseryRhymes = nurseryRhymes;
    }


    public static String getInteractive() {
        System.out.println("This is an interactive book");
        return interactive;
    }

    public static void setInteractive(String interactive) {
        Childrens.interactive = interactive;
    }


    public static String getPicture() {
        System.out.println("This is a picture book");
        return picture;
    }

    public static void setPicture(String picture){
        Childrens.picture = picture;
    }

    @Override
        public void fiction() {}

    @Override
        public void non_fiction() {}

    @Override
    public void borrowable() {}
}
