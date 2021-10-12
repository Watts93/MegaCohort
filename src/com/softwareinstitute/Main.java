package com.softwareinstitute;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare variables
        double roomHeight;
        double roomWidth;
        double roomLength;
        double wallArea;

        //input height of room
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the room in feet: ");
        roomLength = input.nextDouble();

        //input width of room
        System.out.println("Please enter the width of the room in feet: ");
        roomWidth = input.nextDouble();

        //input length of room
        System.out.println("Please enter the height of the room in feet: ");
        roomHeight = input.nextDouble();

        //paint can sizes in ml
        int tinPaint = 2000;

        //sum total area
        wallArea = (2 * (roomLength * roomWidth + roomLength * roomHeight + roomWidth * roomHeight));
        double totalArea =  wallArea;

        //amount to buy
        double toBuy;
        toBuy = totalArea / tinPaint;
        System.out.println("Amount of tins you need to buy is " + toBuy);

        // area paint to cover
        double paintCover;
        paintCover = toBuy * tinPaint;
        System.out.println("Amount of wall it will cover is " + paintCover);


    String message;
    if (toBuy <= 2) {
        message = "You can afford the paint";
    }
    else {
        message = "This is too expensive!";
    }
    System.out.println(message);

    }
}
