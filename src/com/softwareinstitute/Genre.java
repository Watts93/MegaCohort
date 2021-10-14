package com.softwareinstitute;

public abstract class Genre extends Library implements BookDetails{

    public Genre(String books) {
        super(books);
    }

    ////////////////////////////// Attributes ///////////////////////////////

    private static String Educational;
    private static String Scifi;
    private static String Romance;
    private static String Horror;
    private static String Misc;

    ////////////////////////////// Contructors ///////////////////////////////

    public void Genre(){
        this.Educational = Educational;
        this.Scifi = Scifi;
        this.Romance = Romance;
        this.Horror = Horror;
        this.Misc = Misc;
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

    public void setEducational(String Educational) {
        this.Educational = Educational;
        System.out.println("You have selected an educational book");
    }


    //Scifi
    public static String getScifi(){
        return Scifi;
    }

    public void setScifi(String Scifi) {
        this.Scifi = Scifi;
        System.out.println("This is a Sci-Fi book");
    }



    //Romance
    public static String getRomance(){
        return Romance;
    }

    public void setRomance(String Romance) {
        this.Romance = Romance;
        System.out.println("This is a romance");
    }


    //Horror
    public static String getHorror(){
        return Horror;
    }

    public void setHorror(String Horror) {
        this.Horror = Horror;
        System.out.println("This is a horror book");
    }


    //Misc
    public static String getMisc(){
        return Misc;
    }

    public void setMisc(String Misc) {
        this.Misc = Misc;
        System.out.println("This is a book from our miscellaneous collection");
    }

}

