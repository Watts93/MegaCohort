package com.softwareinstitute;


public abstract class Genre extends com.softwareinstitute.Library implements BookDetails{


    public Genre(String bookTitle, String aBookTitle) {
        super(bookTitle, aBookTitle);
    }

    ////////////////////////////// Attributes ///////////////////////////////

    private static String educational;
    private static String scifi;
    private static String romance;
    private static String horror;
    private static String misc;

    ////////////////////////////// Contructors ///////////////////////////////

    public static void Genre(String educational, String scifi, String romance, String horror, String misc){
        Genre.educational = educational;
        Genre.scifi = scifi;
        Genre.romance = romance;
        Genre.horror = horror;
        Genre.misc = misc;
    }

    ///////////////////////////// Methods //////////////////////////////

    public void fiction(){
        System.out.println("This is a fictional book");
    }

    public void nonFiction(){
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

    //Author
    public static String getEducational(){
        return Genre.educational;
    }

    public static void setEducational(String educational) {
        Genre.educational = educational;
        System.out.println("You have selected an educational book");
    }


    //Scifi
    public static String getScifi(){
        return Genre.scifi;
    }

    public static void setScifi(String scifi) {
        Genre.scifi = scifi;
        System.out.println("This is a Sci-Fi book");
    }



    //Romance
    public static String getRomance(){
        return Genre.romance;
    }

    public static void setRomance(String romance) {
        Genre.romance = romance;
        System.out.println("This is a romance");
    }


    //Horror
    public static String getHorror(){
        return Genre.horror;
    }

    public static void setHorror(String horror) {
        Genre.horror = horror;
        System.out.println("This is a horror book");
    }


    //Misc
    public static String getMisc(){
        return Genre.misc;
    }

    public static void setMisc(String misc) {
        Genre.misc = misc;
        System.out.println("This is a book from our miscellaneous collection");
    }

}

