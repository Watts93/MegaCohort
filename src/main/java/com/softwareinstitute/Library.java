package com.softwareinstitute;

public abstract class Library {

    /////////////////////////////////////////// Attributes //////////////////////////////////

    // books
    private static String bookTitle;

    // audio books
    private static String aBookTitle;

    ////////////////////////////////////////// Constructors ///////////////////////////////////


    public Library (String bookTitle, String aBookTitle){
        Library.bookTitle = bookTitle;
        Library.aBookTitle = aBookTitle;
    }

    public static String getBookTitle(){
        return bookTitle;
    }

    public static void setBookTitle(String bookTitle){
        Library.bookTitle = bookTitle;
    }

    public static String getABookTitle(){
        return aBookTitle;
    }

    public static void setABookTitle(String aBookTitle){
        Library.aBookTitle = aBookTitle;
    }


    //////////////////////////////////////// Methods ///////////////////////////////////////

    // read
    public void read (){
        System.out.println("I am reading");
    }

    // listen
    public void listening (){
        System.out.println("I am listening to a book");
    }

    // loan
    public void loan (){
        System.out.println("This book is available to loan from the library");
    }

};