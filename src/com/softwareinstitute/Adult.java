package com.softwareinstitute;

public class Adult extends Genre{


    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String plus18;
    private static String FEducation;
    private static String quickReads;
    private static String biographies;

    /////////////////////////////// Constructors //////////////////////////////////



    //////////////////////////////// Methods ///////////////////////////////////////

    public Adult(String BookTitle){
        super(BookTitle);
    }

//Author
    public static String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


//18+
    public static String getPlus18(){
        return plus18;
    }

    public void setPlus18(String plus18) {
        this.plus18 = plus18;
    }


//fEdu
    public static String getFEducation(){
        return FEducation;
    }

    public void setFEducation(String FEducation) {
        this.FEducation = FEducation;
    }


//QR
    public static String getQuickReads(){
        return quickReads;
    }

    public void setQuickReads(String quickReads) {
        this.quickReads = quickReads;
    }


//bio
    public static String getBiographies(){
        return biographies;
    }

    public void setBiographies(String biographies) {
        this.biographies = biographies;
    }


}
