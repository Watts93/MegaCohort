package com.softwareinstitute;

public class Childrens extends Genre implements BookDetails{

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

    public Childrens(String BookTitle){
        super(BookTitle);
    }

    //Author
    public static String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


// Target Age
    public static int getTargetAge() {
        return targetAge;
    }

    public void setTargetAge(int i){
        this.targetAge = targetAge;
    }

//NR
    public static String getNurseryRhymes() {
        return nurseryRhymes;
    }

    public void setNurseryRhymes(String nurseryRhymes) {
        this.nurseryRhymes = nurseryRhymes;
    }

//Interact
    public static String getInteractive() {
        return interactive;
    }

    public void setInteractive(String interactive) {
        this.interactive = interactive;
    }

//Picture
    public static String getPicture() {
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
