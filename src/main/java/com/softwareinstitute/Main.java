package com.softwareinstitute;

public class Main {

    public static void main(String[] args){

        Childrens childrens = new Childrens("Cat in the Hat", "Cat in the Hat Audio");
        childrens.setBookTitle("Cat in the Hat");
        childrens.setABookTitle("Cat in the Hat Audio");
        childrens.setAuthor("Dr. Seues");
        childrens.setTargetAge(5);
        childrens.setNurseryRhymes(" ");

        System.out.println(com.softwareinstitute.Childrens.getBookTitle());
        System.out.println(com.softwareinstitute.Childrens.getABookTitle());
        System.out.println(com.softwareinstitute.Childrens.getAuthor());
        System.out.println(com.softwareinstitute.Childrens.getTargetAge());
        System.out.println(com.softwareinstitute.Childrens.getNurseryRhymes());

    //    System.out.println(Childrens.getAuthor());
    //    System.out.println(Childrens.getTargetAge());
    //    System.out.println(Childrens.getNurseryRhymes());
    //    System.out.println(Childrens.getInteractive());
    //    System.out.println(Childrens.getPicture());

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

        System.out.println(com.softwareinstitute.Teen.getBookTitle());
        System.out.println(com.softwareinstitute.Teen.getABookTitle());
        System.out.println(com.softwareinstitute.Teen.getAuthor());
        System.out.println(com.softwareinstitute.Teen.getRomance());


    //    System.out.println(Teen.getAuthor());
    //    System.out.println(Teen.getGCSE());
    //    System.out.println(Teen.getALevel());
        //    System.out.println(Teen.getTeenQuickReads());
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

        System.out.println(com.softwareinstitute.Adult.getBookTitle());
        System.out.println(com.softwareinstitute.Adult.getABookTitle());
        System.out.println(com.softwareinstitute.Adult.getAuthor());
        System.out.println(com.softwareinstitute.Adult.getQuickReads());
        System.out.println(com.softwareinstitute.Adult.getMisc());


    //    System.out.println(Adult.getAuthor());
    //    System.out.println(Adult.getPlus18());
    //    System.out.println(Adult.getFEducation());
    //    System.out.println(Adult.getQuickReads());
    //    System.out.println(Adult.getBiographies());
        //    System.out.println(Adult.getAuthor());
        //    System.out.println(Adult.getPlus18());
        //    System.out.println(Adult.getFEducation());
        //    System.out.println(Adult.getQuickReads());
        //    System.out.println(Adult.getBiographies());


    }


}
