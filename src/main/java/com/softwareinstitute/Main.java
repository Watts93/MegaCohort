package com.softwareinstitute;

public class Main {

    public static void main(String[] args){

        Childrens childrens = new Childrens("Cat in the Hat", "Cat in the Hat Audio");
        childrens.setBookTitle("Cat in the Hat");
        childrens.setABookTitle("Cat in the Hat Audio");
        childrens.setAuthor("Dr. Seues");
        childrens.setTargetAge(5);
        childrens.setNurseryRhymes(" ");

        System.out.println(childrens.getBookTitle());
        System.out.println(childrens.getABookTitle());
        System.out.println(childrens.getAuthor());
        System.out.println(childrens.getTargetAge());
        System.out.println(childrens.getNurseryRhymes());


    //    System.out.println(Childrens.getAuthor());
    //    System.out.println(Childrens.getTargetAge());
    //    System.out.println(Childrens.getNurseryRhymes());
    //    System.out.println(Childrens.getInteractive());
    //    System.out.println(Childrens.getPicture());


        Teen teens = new Teen("Twilight", "Twilight Audio");
        teens.setBookTitle("Twilight");
        teens.setABookTitle("Twilight Audio");
        teens.setAuthor("Stephany Meyer");
        teens.setRomance("Fantasy Romance");

        System.out.println(Teen.getBookTitle());
        System.out.println(Teen.getABookTitle());
        System.out.println(Teen.getAuthor());
        System.out.println(Teen.getRomance());


    //    System.out.println(Teen.getAuthor());
    //    System.out.println(Teen.getGCSE());
    //    System.out.println(Teen.getALevel());
    //    System.out.println(Teen.getTeenQuickReads());


        Adult adults = new Adult("A Million Little Pieces", "A Million little Pieces Audio");
        adults.setBookTitle("A Million Little Pieces");
        adults.setABookTitle("A Million Little Pieces Audio");
        adults.setAuthor("James Frey");
        adults.setQuickReads(" ");
        adults.setMisc(" ");

        System.out.println(adults.getBookTitle());
        System.out.println(adults.getABookTitle());
        System.out.println(adults.getAuthor());
        System.out.println(adults.getQuickReads());
        System.out.println(adults.getMisc());

    //    System.out.println(Adult.getAuthor());
    //    System.out.println(Adult.getPlus18());
    //    System.out.println(Adult.getFEducation());
    //    System.out.println(Adult.getQuickReads());
    //    System.out.println(Adult.getBiographies());





    }


}
