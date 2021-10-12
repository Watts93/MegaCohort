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
        double totalArea = wallArea;

        //amount to buy
        double toBuy;
        toBuy = totalArea / tinPaint;
        System.out.println("Amount of tins you need to buy is " + toBuy);

        // area paint to cover
        double paintCover;
        paintCover = toBuy * tinPaint;
        System.out.println("Amount of wall it will cover is " + paintCover);

/*
    String message;
    if (toBuy <= 2) {
        message = "You can afford the paint";
    }
    else {
        message = "This is too expensive!";
    }
    System.out.println(message);
*/
        switch ((int) toBuy) {
            case 0:
                toBuy = 1;
                System.out.println("You can afford the paint");
                break;
            case 1:
                toBuy = 2;
                System.out.println("You can afford the paint");
                break;
            case 2:
                toBuy = 3;
                System.out.println("This is too much!");
                break;
            case 3:
                toBuy = 4;
                System.out.println("This is too much!");
                break;
            case 4:
                toBuy = 5;
                System.out.println("This is too much!");
                break;
            case 5:
                toBuy = 6;
                System.out.println("This is too much!");
                break;

            default:
                System.out.println("Something went wrong, unable to determine budget");
        }

        boolean goPro = true;
        while (goPro == true) {

            if (paintCover > 2000) {
                System.out.println("You're going to need a professional!");
            } else {
                goPro = false;
                System.out.println("You got this!");
            }
            break;
        }


    }
}

