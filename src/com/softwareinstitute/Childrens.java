package com.softwareinstitute;

public class Childrens extends Genre {

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static int targetAge;
    private static String nurseryRhymes;
    private static String interactive;
    private static String picture;

    ///////////////////////////////// Constructors //////////////////////////////////

    public Childrens(String bookTitle, String BookTitle){
        super(BookTitle);

    }

    public void Childrens (String title, String author, int targetAge){
        this.author = author;
        this.targetAge = 10;
        this.nurseryRhymes = nurseryRhymes;
        this.interactive = interactive;
        this.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////
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

    public void setTargetAge(){
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



}
