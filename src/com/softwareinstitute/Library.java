package com.softwareinstitute;

public abstract class Library {

    /////////////////////////////////////////// Attributes //////////////////////////////////

    // books
    private String books;
    private static String BookTitle;

    // audio books
    private String audiobooks;
    private static String ABookTitle;

    ////////////////////////////////////////// Constructors ///////////////////////////////////


    public Library (String books){
        this.books = books;
        this.audiobooks = audiobooks;
    }

    public static String getBookTitle(){
        return BookTitle;
    }

    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;
    }

    public static String getABookTitle(){
        return ABookTitle;
    }

    public void setABookTitle(String ABookTitle){
        this.ABookTitle = ABookTitle;
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