package com.softwareinstitute;

public class Childrens extends Genre {

    ////////////////////////////////// Attributes //////////////////////////////////

    private String title;
    private String author;
    private int targetAge;
    private String nurseryRhymes;
    private String interactive;
    private String picture;

    ///////////////////////////////// Constructors //////////////////////////////////

    public Childrens(String books){
        super(books);
    }

    public void Childrens (String title, String author, int targetAge){
        this.title = title;
        this.author = author;
        this.targetAge = targetAge;
        this.nurseryRhymes = nurseryRhymes;
        this.interactive = interactive;
        this.picture = picture;
    }


    //////////////////////////////// Methods ///////////////////////////////////////




}
