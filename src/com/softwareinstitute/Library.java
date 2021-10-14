package com.softwareinstitute;

public abstract class Library {

    /////////////////////////////////////////// Attributes //////////////////////////////////

    // books
    private String books;
    private String BookTitle;

    // audio books
    private String audiobooks;
    private String ABookTitle;

    ////////////////////////////////////////// Constructors ///////////////////////////////////


    public Library (String books){
        this.books = books;
        this.audiobooks = audiobooks;
        this.BookTitle = BookTitle;
        this.ABookTitle = ABookTitle;
    }

    public String getBookTitle(){
        return BookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.BookTitle = bookTitle;
    }

    public String getABookTitle(){
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