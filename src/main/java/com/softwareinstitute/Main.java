package com.softwareinstitute;

public class Main {

    public static void main(String[] args){

        new Childrens("Cat in the Hat", "Cat in the Hat Audio");
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


        new Teen("Twilight", "Twilight Audio");
        com.softwareinstitute.Teen.setBookTitle("Twilight");
        com.softwareinstitute.Teen.setABookTitle("Twilight Audio");
        com.softwareinstitute.Teen.setAuthor("Stephany Meyer");
        com.softwareinstitute.Teen.setRomance("Fantasy Romance");

        System.out.println(com.softwareinstitute.Teen.getBookTitle());
        System.out.println(com.softwareinstitute.Teen.getABookTitle());
        System.out.println(com.softwareinstitute.Teen.getAuthor());
        System.out.println(com.softwareinstitute.Teen.getRomance());


        new Adult("A Million Little Pieces", "A Million little Pieces Audio");
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


    }


}
