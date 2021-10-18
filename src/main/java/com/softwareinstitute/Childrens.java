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
        this.author = author;
        this.targetAge = 10;
        this.nurseryRhymes = nurseryRhymes;
        this.interactive = interactive;
        this.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////


    //Author
    public static String getAuthor(){
        System.out.println("Author: "+ author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public static int getTargetAge() {
        System.out.println("The target age for this book is "+ targetAge);
        return targetAge;
    }

    public void setTargetAge(int i){
        this.targetAge = targetAge;
    }


    public static String getNurseryRhymes() {
        System.out.println("This is classed as a Nursery Rhyme book");
        return nurseryRhymes;

    }

    public void setNurseryRhymes(String nurseryRhymes) {
        this.nurseryRhymes = nurseryRhymes;
    }


    public static String getInteractive() {
        System.out.println("This is an interactive book");
        return interactive;
    }

    public void setInteractive(String interactive) {
        this.interactive = interactive;
    }


    public static String getPicture() {
        System.out.println("This is a picture book");
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    @Override
        public void fiction() {}

    @Override
        public void non_fiction() {}

    @Override
    public void borrowable() {}
}
