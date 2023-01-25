package PracProjects;
import java.util.Scanner;

public class XinsCinemas { // start of class

    public static void main(String[] args) { // start of main

        
        
        System.out.println("---------------------------------------------------");
        System.out.println("|            WELCOME TO XIN's CINEMAS!!           |");
        System.out.println("|               Movie Ticket Prices               | ");           
        System.out.println("---------------------------------------------------");
        System.out.println("|       Ticket Type         |         Price       |");
        System.out.println("---------------------------------------------------");
        System.out.println("|    Adults (over 12 yrs)   |          $8         |");
        System.out.println("|    Kids (under 13 yrs)    |          $5         |");
        System.out.println("|    Seniors (over 65 yrs)  |          $6         |");
        System.out.println("---------------------------------------------------");

        System.out.println("\n---------------------------------------------------");
        System.out.println("|   Foods and Beverages  |   Size   |    Price    |");
        System.out.println("---------------------------------------------------");
        System.out.println("|        Popcorn         |   S-M-L  |  $6-$8-$10  |");
        System.out.println("|        Drinks          |   S-M-L  |  $3-$5-$6   |");
        System.out.println("|     French Fries       |    S-M   |   $7-$9     |");
        System.out.println("---------------------------------------------------");

        System.out.println("\n-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|       15% Discount on Orders $35 and over!        |");
        System.out.println("|                                                   |");
        System.out.println("-----------------------------------------------------");

// Variables

// Names
String popcornString = "Popcorn";
String drinksString = "Drinks";
String frenchfriesString = "French Fries";

String adultTicketString = "Adult Ticket";
String kidsTicketString = "Kids Ticket";
String seniorTicketString = "Senior Ticket";

// Ticket Prices
int adultTicketPrice = 8;
int kidsTicketPrice = 5;
int seniorTicketPrice = 6;

// Food and Beverage Prices
int popcornSmallPrice = 6;
int popcornMediumPrice = 8;
int popcornLargePrice = 10;

int drinksSmallPrice = 3;
int drinksMediumPrice = 5;
int drinksLargePrice = 6;

int frenchfriesSmallPrice = 7;
int frenchfriesMediumPrice = 9;

double discount = .85;
double tax = 0.04; // Sales Tax for Amusement Services in NY


try (Scanner scanner = new Scanner(System.in)) {
    int totalKidsTicket;
    int totalAdultTicket;
    int totalSeniorTicket;
    System.out.println("**************************************");
    System.out.println("| How many kids tickets do you want? |");
    System.out.println("**************************************");

    int numKidsTicket = (scanner.nextInt());
    totalKidsTicket = (numKidsTicket * kidsTicketPrice);
    
    System.out.println("***************************************");
    System.out.println("| How many adult tickets do you want? |");
    System.out.println("***************************************");

    int numAdultTicket = scanner.nextInt();
    totalAdultTicket = (numAdultTicket * adultTicketPrice);

    System.out.println("****************************************");
    System.out.println("| How many senior tickets do you want? |");
    System.out.println("****************************************");

    int numSeniorTicket = scanner.nextInt();
    totalSeniorTicket = (numSeniorTicket * seniorTicketPrice);
    
    
    String popcornSizeLetterForm = "N/A";
    int popcornTOTALCOST = 0;
    
    System.out.println("*****************************************");
    System.out.println("| How many bags of popcorn do you want? |");
    System.out.println("*****************************************");

    int numPopcornINPUT = scanner.nextInt();
    if (numPopcornINPUT == 0) {
        System.out.print("");
    } else {
        System.out.println("**************************");
        System.out.println("| What size do you want? |");
        System.out.println("**************************");
        System.out.println("_________________________________________________________________________");
        System.out.println("*\t1 for Small\t|\t2 for Medium\t|\t3 for Large\t*");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        int popcornSizeOption = scanner.nextInt();
    if (popcornSizeOption == 1) {
         popcornTOTALCOST = (numPopcornINPUT * popcornSmallPrice);
         popcornSizeLetterForm = "S";
    } if (popcornSizeOption == 2) {
         popcornTOTALCOST = (numPopcornINPUT * popcornMediumPrice);
         popcornSizeLetterForm = "M";
    } if (popcornSizeOption == 3) {
         popcornTOTALCOST = (numPopcornINPUT * popcornLargePrice); 
         popcornSizeLetterForm = "L";
    }
    }
    
    int drinksTOTALCOST = 0;
    String drinksSizeLetterForm = "N/A";
    
    System.out.println("********************************");
    System.out.println("| How many drinks do you want? |");
    System.out.println("********************************");

    int numDrinksINPUT = scanner.nextInt();
    if (numDrinksINPUT == 0) {
        System.out.print("");
    } else {
        System.out.println("**************************");
        System.out.println("| What size do you want? |");
        System.out.println("**************************");
        System.out.println("_________________________________________________________________________");
        System.out.println("*\t1 for Small\t|\t2 for Medium\t|\t3 for Large\t*");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        int drinksSizeOption = scanner.nextInt();
    if (drinksSizeOption == 1) {
        drinksTOTALCOST = (numDrinksINPUT * drinksSmallPrice);
        drinksSizeLetterForm = "S";
    } if (drinksSizeOption == 2) {
        drinksTOTALCOST = (numDrinksINPUT * drinksMediumPrice);
        drinksSizeLetterForm = "M";
    } if (drinksSizeOption == 3) {
        drinksTOTALCOST = (numDrinksINPUT * drinksLargePrice);
        drinksSizeLetterForm = "L";
    } 
    }
    
    
    int frenchfriesTOTALCOST = 0;
    String frenchfriesSizeLetterForm = "N/A";
    
    System.out.println("***********************************************");
    System.out.println("| How many packs of French Fries do you want? |");
    System.out.println("***********************************************");

    int numFrenchfriesINPUT = scanner.nextInt();
    if (numFrenchfriesINPUT == 0) {
        System.out.print("");
    } else {
        System.out.println("**************************");
        System.out.println("| What size do you want? |");
        System.out.println("**************************");
        System.out.println("_________________________________________________");
        System.out.println("*\t1 for Small\t|\t2 for Medium\t*");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        int frenchfriesSizeOPTION = scanner.nextInt();
    if (frenchfriesSizeOPTION == 1) {
        frenchfriesTOTALCOST = (numFrenchfriesINPUT * frenchfriesSmallPrice);
        frenchfriesSizeLetterForm = "S";
    } if (frenchfriesSizeOPTION == 2) {
        frenchfriesTOTALCOST = (numFrenchfriesINPUT * frenchfriesMediumPrice);
        frenchfriesSizeLetterForm = "M";
    } 
    }
    
    
    
    int SUBTOTAL = calculate(totalKidsTicket, totalAdultTicket, totalSeniorTicket, popcornTOTALCOST, drinksTOTALCOST, frenchfriesTOTALCOST);
    double TOTAL = 0;
    double taxForSubtotal = (SUBTOTAL * tax);
    if (SUBTOTAL > 34) {
        TOTAL = Math.round(((SUBTOTAL * discount) + taxForSubtotal)*100)/100.00;
    
        double discountedValue = Math.round(((totalAdultTicket + totalKidsTicket + totalSeniorTicket + popcornTOTALCOST + drinksTOTALCOST + frenchfriesTOTALCOST) * .15) * 100.00)/100.00;
        double subtotalAfterDiscount = (SUBTOTAL - discountedValue);
    System.out.println("\n-------------------------------------------------------");
    System.out.println("                      RECEIPT                       ");
    ticketReceipt(adultTicketString, numAdultTicket, totalAdultTicket);
    ticketReceipt(kidsTicketString, numKidsTicket, totalKidsTicket);
    ticketReceipt(seniorTicketString, numSeniorTicket, totalSeniorTicket);
    foodReceipt(popcornString, numPopcornINPUT, popcornSizeLetterForm, popcornTOTALCOST);
    foodReceipt(drinksString, numDrinksINPUT, drinksSizeLetterForm, drinksTOTALCOST);
    foodReceipt(frenchfriesString, numFrenchfriesINPUT, frenchfriesSizeLetterForm, frenchfriesTOTALCOST);
    System.out.println("         Applied Discount (15%)"+"       " + "- $" + discountedValue);
    System.out.println("-------------------------------------------------------");
    System.out.println("\t Subtotal:\t\t\t" + "$" + subtotalAfterDiscount);
    System.out.println("\t Tax:\t\t\t\t" + "$" + Math.round(taxForSubtotal * 100)/100.0);
    System.out.println("\t Total:\t\t\t\t" + "$"+TOTAL);
    System.out.println("-------------------------------------------------------");
    
    
    } else {
        TOTAL = SUBTOTAL + taxForSubtotal;
        System.out.println("\n---------------------------------------------------");
    System.out.println("                      RECEIPT                       ");
    ticketReceipt(adultTicketString, numAdultTicket, totalAdultTicket);
    ticketReceipt(kidsTicketString, numKidsTicket, totalKidsTicket);
    ticketReceipt(seniorTicketString, numSeniorTicket, totalSeniorTicket);
    foodReceipt(popcornString, numPopcornINPUT, popcornSizeLetterForm, popcornTOTALCOST);
    foodReceipt(drinksString, numDrinksINPUT, drinksSizeLetterForm, drinksTOTALCOST);
    foodReceipt(frenchfriesString, numFrenchfriesINPUT, frenchfriesSizeLetterForm, frenchfriesTOTALCOST);
        System.out.println("---------------------------------------------------");
        System.out.println("\t Subtotal:\t\t\t" + "$" + SUBTOTAL);
        System.out.println("\t Tax:\t\t\t\t" + "$" + taxForSubtotal);
        System.out.println("\t Total:\t\t\t\t" + "$"+TOTAL);
        System.out.println("---------------------------------------------------");
    
        }
}
    
    } // end of main



    //METHODS --------------------METHODS------------------------METHODS-------------------------METHODS-------------------------------------------------

    public static int calculate(int adultTicket, int childTicket, int seniorTicket, int popcornTOTALCOST, int drinksTOTALCOST, int frenchfriesTOTALCOST) {

        int total = adultTicket + childTicket + seniorTicket + popcornTOTALCOST + drinksTOTALCOST + frenchfriesTOTALCOST;
        return total;

    }

    public static void foodReceipt(String foodName, int num, String size, int totalCost) {

        String popcorn = "Popcorn";
        String drinks = "Drinks";
        String frenchfries = "French Fries";
            if (num == 0) {
                System.out.print("");
            }
            else if ((foodName==popcorn)) {
            System.out.println("         "+foodName+"(" + size + ")" + "\t\tx"+ num + "\t$" + totalCost);
              }  

            else if ((foodName==drinks)) {
                System.out.println("         "+foodName+"(" + size + ")" + "\t\tx"+ num + "\t$" + totalCost);
            } 

            else if ((foodName==frenchfries)) {
                System.out.println("         "+foodName+"(" + size + ")" + "\tx"+ num + "\t$" + totalCost);

            } 
        
        
           
}

public static void ticketReceipt(String ticketType, int num, int total) {

    String adultTicketString = "Adult Ticket";
    String kidsTicketString = "Kids Ticket";
    String seniorTicketString = "Senior Ticket";

    if(num == 0) {
        System.out.print("");
        
    } else if(ticketType == adultTicketString) {
        System.out.print("         Adult Ticket\t\tx"+num+   "\t$" + total+"\n");
    } else if (ticketType == kidsTicketString) {
        System.out.print("         Kids Ticket\t\tx"+num+   "\t$" + total+"\n");
    } else if (ticketType == seniorTicketString) {
        System.out.print("         Senior Ticket\t\tx"+num+   "\t$" + total+"\n");

    }
}   

    
    }// end of class


// Notes
// Something like this will result in an error.
// String hello; 
// int value;
// In order to avoid this error, you have to set the variable to something that corresponds with its type:
// String hello = "hello!";
// int value = 9