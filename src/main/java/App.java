import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean runPartyProgram = true;
    // boolean drawLoop = true;

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
      String userInput = console.readLine();

      if (userInput.equals("PARTY")) {
        //~~~~~~~~UPDATE DETAILS~~~~~~~
        System.out.println("You have chosen to party! Nice!!");

      } else if(userInput.equals("EXIT")) {
        runPartyProgram = false;
      } else {
        System.out.println("Did not recognize input - Enter \"PARTY\" to plan your next party with us, or \"EXIT\" to quit the program");
      }
    }
  System.out.println("Thank you for coming! We hope to be a part of your next party planning experience.");
}
