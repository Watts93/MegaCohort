package com.softwareinstitute;


public abstract class Genre extends com.softwareinstitute.Library implements BookDetails{


    public Genre(String BookTitle, String ABookTitle) {
        super(BookTitle, ABookTitle);
    }

    ////////////////////////////// Attributes ///////////////////////////////

    private static String Educational;
    private static String Scifi;
    private static String Romance;
    private static String Horror;
    private static String Misc;

    ////////////////////////////// Contructors ///////////////////////////////

    public static void Genre(String Educational, String Scifi, String Romance, String Horror, String Misc){
        Genre.Educational = Educational;
        Genre.Scifi = Scifi;
        Genre.Romance = Romance;
        Genre.Horror = Horror;
        Genre.Misc = Misc;
    }

    ///////////////////////////// Methods //////////////////////////////

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

    //Author
    public static String getEducational(){
        return Educational;
    }

    public static void setEducational(String Educational) {
        Genre.Educational = Educational;
        System.out.println("You have selected an educational book");
    }


    //Scifi
    public static String getScifi(){
        return Scifi;
    }

    public static void setScifi(String Scifi) {
        Genre.Scifi = Scifi;
        System.out.println("This is a Sci-Fi book");
    }



    //Romance
    public static String getRomance(){
        return Romance;
    }

    public static void setRomance(String Romance) {
        Genre.Romance = Romance;
        System.out.println("This is a romance");
    }


    //Horror
    public static String getHorror(){
        return Horror;
    }

    public static void setHorror(String Horror) {
        Genre.Horror = Horror;
        System.out.println("This is a horror book");
    }


    //Misc
    public static String getMisc(){
        return Misc;
    }

    public static void setMisc(String Misc) {
        Genre.Misc = Misc;
        System.out.println("This is a book from our miscellaneous collection");
    }

}

