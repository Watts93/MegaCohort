package com.softwareinstitute;

public class Adult extends Genre{

    public Adult(String BookTitle, String ABookTitle) {
        super(BookTitle, ABookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String plus18;
    private static String FEducation;
    private static String quickReads;
    private static String biographies;

    /////////////////////////////// Constructors //////////////////////////////////

    public void Adult (String BookTitle, String author, String plus18, String FEducation, String quickReads, String biographies){
        this.author = author;
        this.plus18 = plus18;
        this.FEducation = FEducation;
        this.quickReads = quickReads;
        this.biographies = biographies;
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


//18+
    public static String getPlus18(){
        System.out.println("This book is for over 18's only");
        return plus18;
    }

    public void setPlus18(String plus18) {
        this.plus18 = plus18;
    }


//fEdu
    public static String getFEducation(){
        System.out.println("This is an adult level educational book");
        return FEducation;
    }

    public void setFEducation(String FEducation) {
        this.FEducation = FEducation;
    }


//QR
    public static String getQuickReads(){
        System.out.println("This is an adult quick read");
        return quickReads;
    }

    public void setQuickReads(String quickReads) {
        this.quickReads = quickReads;
    }


//bio
    public static String getBiographies(){
        System.out.println("This is categorised as a biographical book");
        return biographies;
    }

    public void setBiographies(String biographies) {
        this.biographies = biographies;
    }


}
