package com.softwareinstitute;


public class Genre extends com.softwareinstitute.Library implements BookDetails{


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

    public String fiction(){
        return ("This is a fictional book");
    }

    public String nonFiction(){
        return ("This is a non-fictional book");
    }

    boolean loanable = true;
    public String borrowable(){
        if(loanable) {
            return ("This book can be loaned from the Library");
        }
        else {
            return ("This cannot be loaned from the Library");
        }
    }

    //Author
    public static String getEducational(){
        return Genre.educational;
    }

    public static String setEducational(String educational) {
        Genre.educational = educational;
        return ("You have selected an educational book");
    }


    //Scifi
    public static String getScifi(){
        return Genre.scifi;
    }

    public static String setScifi(String scifi) {
        Genre.scifi = scifi;
        return ("This is a Sci-Fi book");
    }



    //Romance
    public static String getRomance(){
        return Genre.romance;
    }

    public static String setRomance(String romance) {
        Genre.romance = romance;
        return ("This is a romance");
    }


    //Horror
    public static String getHorror(){
        return Genre.horror;
    }

    public static String setHorror(String horror) {
        Genre.horror = horror;
        return ("This is a horror book");
    }


    //Misc
    public static String getMisc(){
        return Genre.misc;
    }

    public static String setMisc(String misc) {
        Genre.misc = misc;
        return ("This is a book from our miscellaneous collection");
    }

}

