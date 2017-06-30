import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean runPartyProgram = true;
    // boolean drawLoop = true;

    int guestNumbers = 0;
    String meal = "";
    String bar = "";
    String entertainment = "";

    //WELCOME
    System.out.println("Welcome to Timberlake Event Planning");
    System.out.println("an all-inclusive party planning service");
    System.out.println("----------------------------------");

    //NEW EVENT
    Party party = new Party();
    party.initializeParty();

    while (runPartyProgram) {
      //USER PROMPT
      System.out.println("Please enter \"PARTY\" to plan your next party with us,");
      System.out.println("or enter \"EXIT\" to quit the program.");
      String userInput = console.readLine().toUpperCase();

      if (userInput.equals("PARTY")) {
        //~~~~~~~~UPDATE DETAILS~~~~~~~
        System.out.println("What is your party size?: ");
        int userGuestNumbers = Integer.parseInt(console.readLine());

        System.out.println("What type of food would you like?: lunch, dinner, light apps, heavy apps, or none");
        String userMealType = console.readLine();

        System.out.println("What type of drink options would you like?: full bar, wine & beer, or none");
        String userBarType = console.readLine();

        System.out.println("What type of entertainment would you like?: DJ, steel drum band,line dancing, magician, or none");
        String userEntertainmentType = console.readLine();

        PartyPlanningService userDetails = new PartyPlanningService(userGuestNumbers, userMealType, userBarType, userEntertainmentType);

        System.out.println("PARTY DETAILS:")
        System.out.println("----------------------------------");
        System.out.println("Guest Numbers: " + userDetails.getGuestNumbers());
        System.out.println("Meal Plan: " + userDetails.getMealType());
        System.out.println("Bar Plan: " + userDetails.getBarType());
        System.out.println("Entertainment: " + userDetails.getEntertainmentType());




      } else if(userInput.equals("EXIT")) {
        runPartyProgram = false;
      } else {
        System.out.println("Did not recognize input - Enter \"PARTY\" to plan your next party with us, or \"EXIT\" to quit the program");
      }
    }
    System.out.println("Thank you for coming! We hope to be a part of your next party planning experience.");
  }
}
