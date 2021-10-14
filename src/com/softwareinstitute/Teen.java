package com.softwareinstitute;

public class Teen extends Genre{

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String GCSE;
    private static String ALevel;
    private static String teenQuickReads;

    ///////////////////////////////// Constructors //////////////////////////////////



    //////////////////////////////// Methods ///////////////////////////////////////

    public Teen(String BookTitle){
        super(BookTitle);
    }

//Author
    public static String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


//GCSE
    public static String getGCSE() {
        return GCSE;
    }

    public void setGCSE(){
        this.GCSE = GCSE;
    }

//aLevel
    public static String getALevel() {
        return ALevel;
    }

    public void setALevel(){
        this.ALevel = ALevel;
    }

//TQR
    public static String getTeenQuickReads() {
        return teenQuickReads;
    }

    public void setTeenQuickReads(){
        this.teenQuickReads = teenQuickReads;
    }

}
