package com.softwareinstitute;

<<<<<<< HEAD
public class Teen extends Genre{
=======
public class Teen extends com.softwareinstitute.Genre {
>>>>>>> 5dd24be (maven re-write)

    public Teen(String BookTitle, String ABookTitle) {
        super(BookTitle, ABookTitle);
    }

    ////////////////////////////////// Attributes //////////////////////////////////

    private static String author;
    private static String GCSE;
    private static String ALevel;
    private static String teenQuickReads;

    ///////////////////////////////// Constructors //////////////////////////////////



    public void Teens (String BookTitle, String author, String GCSE, String ALevel, String teenQuickReads){
        this.author = author;
        this.GCSE = GCSE;
        this.ALevel = ALevel;
        this.teenQuickReads = teenQuickReads;
    }

    //////////////////////////////// Methods ///////////////////////////////////////


<<<<<<< HEAD
//Author
=======
    //Author
>>>>>>> 5dd24be (maven re-write)
    public static String getAuthor(){
        System.out.println("Author: "+ author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


<<<<<<< HEAD
//GCSE
=======
    //GCSE
>>>>>>> 5dd24be (maven re-write)
    public static String getGCSE() {
        System.out.println("This is a GCSE level educational book");
        return GCSE;
    }

    public void setGCSE(){
        this.GCSE = GCSE;
    }

<<<<<<< HEAD
//aLevel
=======
    //aLevel
>>>>>>> 5dd24be (maven re-write)
    public static String getALevel() {
        System.out.println("This is an A Level educational book");
        return ALevel;
    }

    public void setALevel(){
        this.ALevel = ALevel;
    }

<<<<<<< HEAD
//TQR
=======
    //TQR
>>>>>>> 5dd24be (maven re-write)
    public static String getTeenQuickReads() {
        System.out.println("This book is categorised as a Teen Quick Read");
        return teenQuickReads;
    }

    public void setTeenQuickReads(){
        this.teenQuickReads = teenQuickReads;
    }

}
