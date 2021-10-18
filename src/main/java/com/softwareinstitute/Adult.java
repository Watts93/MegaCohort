package com.softwareinstitute;

public class Adult extends com.softwareinstitute.Genre {

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

    public static void Adult (String BookTitle, String author, String plus18, String FEducation, String quickReads, String biographies){
        Adult.author = author;
        Adult.plus18 = plus18;
        Adult.FEducation = FEducation;
        Adult.quickReads = quickReads;
        Adult.biographies = biographies;
    }

    //////////////////////////////// Methods ///////////////////////////////////////


    public static String getAuthor(){
        System.out.println("Author: "+ author);
        return author;
    }

    public static void setAuthor(String author) {
        Adult.author = author;
    }



    public static String getPlus18(){
        System.out.println("This book is for over 18's only");
        return plus18;
    }

    public static void setPlus18(String plus18) {
        Adult.plus18 = plus18;
    }



    public static String getFEducation(){
        System.out.println("This is an adult level educational book");
        return FEducation;
    }

    public static void setFEducation(String FEducation) {
        Adult.FEducation = FEducation;
    }


    public static String getQuickReads(){
        System.out.println("This is an adult quick read");
        return quickReads;
    }

    public static void setQuickReads(String quickReads) {
        Adult.quickReads = quickReads;
    }


    public static String getBiographies(){
        System.out.println("This is categorised as a biographical book");
        return biographies;
    }

    public static void setBiographies(String biographies) {
        Adult.biographies = biographies;
    }


}
