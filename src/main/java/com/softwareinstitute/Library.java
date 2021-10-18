package com.softwareinstitute;

public abstract class Library {

    /////////////////////////////////////////// Attributes //////////////////////////////////

    // books
    private static String BookTitle;

    // audio books
    private static String ABookTitle;

    ////////////////////////////////////////// Constructors ///////////////////////////////////


    public Library (String BookTitle, String ABookTitle){
        Library.BookTitle = BookTitle;
        Library.ABookTitle = ABookTitle;
    }

    public static String getBookTitle(){
        return BookTitle;
    }

    public static void setBookTitle(String BookTitle){
        Library.BookTitle = BookTitle;
    }

    public static String getABookTitle(){
        return ABookTitle;
    }

    public static void setABookTitle(String ABookTitle){
        Library.ABookTitle = ABookTitle;
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