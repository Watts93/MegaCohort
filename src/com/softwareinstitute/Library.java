package com.softwareinstitute;

public abstract class Library {

    /////////////////////////////////////////// Attributes //////////////////////////////////

    // books
    private String books;
    private String bookTitle;

    // audio books
    private String audiobooks;
    private String abookTitle;

    ////////////////////////////////////////// Constructors ///////////////////////////////////


    public Library (String books){
        this.books = books;
        this.audiobooks = audiobooks;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getAbookTitle(){
        return abookTitle;
    }

    public void setAbookTitle(String abookTitle){
        this.abookTitle = abookTitle;
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