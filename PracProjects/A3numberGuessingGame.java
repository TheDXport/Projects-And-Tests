package PracProjects;
import java.util.Random;
import java.util.Scanner;

public class A3numberGuessingGame { // start of the class

   public static void main(String[] args) { // start of the main method

      try (Scanner s = new Scanner(System.in)) {
         System.out.println("What mode do you want?\n");
         System.out.println("                    Available Modes        ");
         System.out.println("----------------------------------------------------------");
         System.out.println("|  Easy   |   Medium  |  Hard  |  Impossible  |  Custom  |");
         System.out.println("----------------------------------------------------------");
         String modeINPUT = s.nextLine();
         modeINPUT = modeINPUT.toUpperCase();
         modeINPUT = modeINPUT.replaceAll(" ", "");

         if (modeINPUT.equals("EASY")) {
            easyDiff();
         } else if (modeINPUT.equals("MEDIUM")) {
            mediumDiff();
         } else if (modeINPUT.equals("HARD")) {
            hardDiff();
         } else if (modeINPUT.equals("IMPOSSIBLE")) {
            impossibleDiff();
         } else if (modeINPUT.equals("CUSTOM")) {
            customMode();
         }
      }
      
      } // end of main method 
      

      public static void easyDiff() { // start of easyDiff method

         int difference;
         Random random = new Random(); 
         try (Scanner scanner = new Scanner(System.in)) {
            int number = random.nextInt(10) + 1; // generates a random number between 1 - 100
            System.out.println("I am guessing a number between 1-10, what is it?");
            int userIntGuess = scanner.nextInt(); // receives user input in the terminal
  
            if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
  System.out.println("Congrats! The Number that I was thinking of is: " + number);
  
            } else {
               difference = Math.abs(number - userIntGuess); // finds the absolute value of the difference between the user's inputted number and the randomly generated number
               System.out.println("The number that I was guessing was " + number);
               System.out.println("You were off by " + difference + ", u suck!");
  
  
  
    }
         }
   } // end of easyDiff method
   

   public static void mediumDiff() { // start of mediumDiff

      int difference;
      Random random = new Random(); 
      try (Scanner scanner = new Scanner(System.in)) {
         int number = random.nextInt(100) + 1; // generates a random number between 1 - 100
         System.out.println("I am guessing a number between 1-100, what is it?");
         int userIntGuess = scanner.nextInt(); // receives user input in the terminal

         if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congrats! The Number that I was thinking of is: " + number);

         } else {
            difference = Math.abs(number - userIntGuess); // finds the absolute value of the difference between the user's inputted number and the randomly generated number
            System.out.println("The number that I was guessing was " + number);
            System.out.println("You were off by " + difference + ", u suck!");

  }// end of else statement
      }


   } // end of mediumDiff method

public static void hardDiff() { // start of hardDiff


   int difference;
   Random random = new Random(); 
   try (Scanner scanner = new Scanner(System.in)) {
      int number = random.nextInt(1000) + 1; // generates a random number between 1 - 100
      System.out.println("I am guessing a number between 1-1000, what is it?");
      int userIntGuess = scanner.nextInt(); // receives user input in the terminal

      if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congrats! The Number that I was thinking of is: " + number);

      } else {
         difference = Math.abs(number - userIntGuess); // finds the absolute value of the difference between the user's inputted number and the randomly generated number
         System.out.println("The number that I was guessing was " + number);
         System.out.println("You were off by " + difference + ", u suck!");
}
   }
} // end of hardDiff

public static void impossibleDiff() { // start of impossibleDiff
   int difference;
   Random random = new Random();
   try (Scanner scanner = new Scanner(System.in)) {
      int number = 0;
      System.out.println("I am guessing a number between 1-7, what is it?");
      int userIntGuess = scanner.nextInt(); // receives user input in the terminal
       if (userIntGuess < 8 && userIntGuess > 1) {
         int localRandomizer = random.nextInt(1)+1;
         number = userIntGuess - localRandomizer;
      } else if (userIntGuess == 1) {
         int localRandomizer = random.nextInt(6)+1;
         number = userIntGuess + localRandomizer;
      } else if (userIntGuess < 1) {
         System.out.println("This is not a number 1-7");
      }
      
      
      if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congrats! The Number that I was thinking of is: " + number);

      } else {
         difference = Math.abs(number - userIntGuess); // finds the absolute value of the difference between the user's inputted number and the randomly generated number
         System.out.println("The number that I was guessing was " + number);
         System.out.println("You were off by " + difference + ", u suck!");
}
   }
} // end of impossibleDiff

public static void customMode() { // start of customMode

   try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Set your desired minimum range:");
      int minimumINPUT = scanner.nextInt();
      System.out.println("Set your desired maximum range:");
      int maximumINPUT = scanner.nextInt();
      
      
      int mysteryNum = (int)(Math.random() * (maximumINPUT - minimumINPUT + 1) + minimumINPUT);
      System.out.println("I'm guessing a number between " + minimumINPUT + " and " + maximumINPUT + ", what is it?");
      int userINPUT = scanner.nextInt();
      int difference = 0;

         if (userINPUT == mysteryNum) {
            System.out.println("Congrats! The Number that I was thinking of is: " + mysteryNum);         
         } else {
               difference = Math.abs(userINPUT - mysteryNum);
               System.out.println("The number that I was guessing was " + mysteryNum);
               System.out.println("You were off by " + difference + ", u suck!");
         }
   }





} // end of customMode


} // end of class