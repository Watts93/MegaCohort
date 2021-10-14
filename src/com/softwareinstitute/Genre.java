package com.softwareinstitute;

public abstract class Genre extends Library implements BookDetails{

    public Genre(String books) {
        super(books);
    }

    ////////////////////////////// Attributes ///////////////////////////////

    // Educational
    private String educational;

    // Sci-Fi
    private String scifi;

    // Romance
    private String romance;

    // Horror
    private String horror;

    // Miscellaneous
    private String misc;


    ////////////////////////////// Contructors ///////////////////////////////


    public void Genre(){
        this.educational = educational;
        this.scifi = scifi;
        this.romance = romance;
        this.horror = horror;
        this.misc = misc;
    }

    public void fiction(){
        System.out.println("This is a fictional book");
    }

    public void non_fiction(){
        System.out.println("This is a non-fictional book");
    }

    boolean loanable = true;
    public void borrowable(){
        if(loanable) {
            System.out.println("This book can be loaned from the Library");
        }
        else {
            System.out.println("This cannot be loaned from the Library");
        }
    }


    ///////////////////////////// Methods //////////////////////////////



}
