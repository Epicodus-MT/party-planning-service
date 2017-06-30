import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean runPartyProgram = true;

    //WELCOME
    System.out.println("Welcome to Timberlake Event Planning");
    System.out.println("an all-inclusive party planning service");
    System.out.println("----------------------------------");

    //USER PROMPT
    System.out.println("Please enter \"PARTY\" to plan your next party with us,");
    System.out.println("or enter \"EXIT\" to quit the program.");
    // String userInput = console.readLine().toUpperCase();

    //NEW EVENT
    while (runPartyProgram) {
      if (userInput.equals("PARTY")) {
        System.out.println("What is your party size?: ");
        int guests = Integer.parseInt(console.readLine());

        boolean accurateMealInput = true;
        while(accurateMealInput) {
          System.out.println("What type of food would you like?: lunch, dinner, light apps, heavy apps, or none");
          String meal = console.readLine().toUpperCase();
          if(meal.equals("LUNCH") || meal.equals("DINNER") || meal.equals("LIGHT APPS") || meal.equals("HEAVY APPS")  || meal.equals("NONE") ){
            accurateMealInput = false;
          } else {
            System.out.println("I'm sorry, that is not a listed option. Please enter one of the following meal options: lunch, dinner, light apps, heavy apps, or none");
          }
        }

        boolean accurateBarInput = true;
        while(accurateBarInput) {
          System.out.println("What type of drink options would you like?: full bar, wine & beer, or none");
          String bar = console.readLine().toUpperCase();
          if(bar.equals("FULL BAR") || bar.equals("WINE & BEER") || bar.equals("NONE")){
            accurateBarInput = false;
          } else {
            System.out.println("I'm sorry, that is not a listed option. Please enter one of the following bar options: full bar, wine & beer, or none");
          }
        }


        boolean accurateEntertainmentInput = true;
        while(accurateEntertainmentInput) {
          System.out.println("What type of entertainment would you like?: DJ, steel drum band, line dancing, magician, or none");
          String entertainment = console.readLine().toUpperCase();
          if(entertainment.equals("DJ") || entertainment.equals("STEEL DRUM BAND") || entertainment.equals("LINE DANCING") || entertainment.equals("MAGICIAN")  || entertainment.equals("NONE") ){
            accurateEntertainmentInput = false;
          } else {
            System.out.println("I'm sorry, that is not a listed option. Please enter one of the following entertainment options: DJ, steel drum band, line dancing, magician, or none");
          }
        }

        runPartyProgram = false;
        int cost = party.totalCost();
        System.out.print("Your party total is: A LOT!");
        // System.out.print("Your party total is: $%d", mTotalCost)
        }



        //NEW EVENT
        // PartyPlanningService party = new PartyPlanningService();
        // party.initializeParty();




        // System.out.println("PARTY DETAILS:");
        // System.out.println("----------------------------------");
        // System.out.println("Guest Numbers: " + userDetails.getGuestNumbers());
        // System.out.println("Meal Plan: " + userDetails.getMealType());
        // System.out.println("Bar Plan: " + userDetails.getBarType());
        // System.out.println("Entertainment: " + userDetails.getEntertainmentType());
        // System.out.println("----------------------------------");

      } else if(userInput.equals("EXIT")) {
        runPartyProgram = false;
      } else {
        System.out.println("Did not recognize input - Enter \"PARTY\" to plan your next party with us, or \"EXIT\" to quit the program");
      }
    }
    System.out.println("Thank you for coming! We hope to be a part of your next party planning experience.");

  }
}
