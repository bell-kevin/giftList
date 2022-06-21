/** ****************************************************************************
 * Gift.java
 * Kevin Bell
 *
 * This class of objects stores information about individual gifts
 **************************************************************************** */
package giftlist;

import java.util.Scanner;

public class Gift {

    Scanner computerKeyboadInput = new Scanner(System.in);
    private final String name;
    private final String occasion;
    private final int quantity;
    private final String notes;

    //************************************************************************* 
    public Gift(String name, String occasion, int quantity, String notes) {
        this.name = name;
        this.occasion = occasion;
        this.quantity = quantity;
        this.notes = notes;
    } //end Gift constructor  

    public String getName() {
        return name;
    } //end getName  

    public String getOccasion() {
        return occasion;
    } // end getOccasion   

    public int getQuantity() {
        return quantity;
    } //end get Quantity  

    public String getNotes() {
        return notes;
    } //end getNotes  
} //end class Gift
