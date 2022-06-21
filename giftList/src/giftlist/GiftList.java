/** ****************************************************************************
 * GiftList.java
 * Kevin Bell
 *
 * This program creates and displays a simple gift list using an array
 **************************************************************************** */
package giftlist;

import java.util.Scanner;

public class GiftList {

    public static void main(String[] args) {
        Scanner computerKeyboadInput = new Scanner(System.in);
        Gift[] giftList = new Gift[4];  //Declare array called giftList of 4 gift objects
        String name, occasion, notes;   //input variables for each gift object
        int quantity;                   //input variable for each gift object
        System.out.println("Ch 9 Gifts by Kevin Bell\n");
        for (int i = 0; i < 4; i++) {
            System.out.print("What gift do you want to add to the list? ");
            name = computerKeyboadInput.nextLine();
            System.out.print("What occasion? ");
            occasion = computerKeyboadInput.nextLine();
            System.out.print("How many do you want? ");
            quantity = computerKeyboadInput.nextInt();
            computerKeyboadInput.nextLine(); //flush newline
            System.out.print("Notes about this gift: ");
            notes = computerKeyboadInput.nextLine();
            giftList[i] = new Gift(name, occasion, quantity, notes); //instantiate each object
        } //end for
        System.out.println("\nAll done, now review the list");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Gift: %d %s for %s, notes: %s\n",
                    giftList[i].getQuantity(), giftList[i].getName(),
                    giftList[i].getOccasion(), giftList[i].getNotes());
        } //end for
    } //end main   
} //end class GiftList
