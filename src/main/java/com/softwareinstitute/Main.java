package com.softwareinstitute;

public class Main {

    public static void main(String[] args){

        Childrens childrens = new Childrens("Cat in the Hat", "Cat in the Hat Audio");
        com.softwareinstitute.Childrens.setBookTitle("Cat in the Hat");
        com.softwareinstitute.Childrens.setABookTitle("Cat in the Hat Audio");
        com.softwareinstitute.Childrens.setAuthor("Dr. Seues");
        com.softwareinstitute.Childrens.setTargetAge(5);
        com.softwareinstitute.Childrens.setNurseryRhymes(" ");

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
        com.softwareinstitute.Teen.setBookTitle("Twilight");
        com.softwareinstitute.Teen.setABookTitle("Twilight Audio");
        com.softwareinstitute.Teen.setAuthor("Stephany Meyer");
        com.softwareinstitute.Teen.setRomance("Fantasy Romance");

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
        com.softwareinstitute.Adult.setBookTitle("A Million Little Pieces");
        com.softwareinstitute.Adult.setABookTitle("A Million Little Pieces Audio");
        com.softwareinstitute.Adult.setAuthor("James Frey");
        com.softwareinstitute.Adult.setQuickReads(" ");
        com.softwareinstitute.Adult.setMisc(" ");

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
