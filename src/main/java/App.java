import java.io.Console;
// import java.util.List;
// import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean runPartyProgram = true;
    int guests = 0;
    String meal = "";
    String bar = "";
    String entertainment = "";

    //WELCOME
    System.out.println("\nWelcome to Timberlake Event Planning");
    System.out.println("an all-inclusive party planning service");
    System.out.println("----------------------------------");
    System.out.println("Complementary non-alchoholic beverages included in all party packages!");
    System.out.println("The following coupons are available after your party planning information is submited:");
    System.out.println("* Ten percent off for 100+ guests");
    System.out.println("* Twenty percent off if you order both the DJ music option and Full Bar beverage option");
    System.out.println("----------------------------------");

    //USER PROMPT
    System.out.println("Please enter \"PARTY\" to plan your next party with us,");
    System.out.println("or enter \"EXIT\" to quit the program.");


    //NEW EVENT
    while (runPartyProgram) {
      String userInput = console.readLine().toUpperCase();
      if (userInput.equals("PARTY")) {
        System.out.println("\nWhat is your party size?: ");
        guests = Integer.parseInt(console.readLine());

        System.out.println("\nWhat type of food would you like?: lunch, dinner, light apps, heavy apps, or none");
        boolean accurateMealInput = true;
        while(accurateMealInput) {
          meal = console.readLine().toUpperCase();
          if(meal.equals("LUNCH") || meal.equals("DINNER") || meal.equals("LIGHT APPS") || meal.equals("HEAVY APPS")  || meal.equals("NONE") ){
            accurateMealInput = false;
          } else {
            System.out.println("\nI'm sorry, that is not a listed option. Please enter one of the following meal options: lunch, dinner, light apps, heavy apps, or none");
          }
        }

        System.out.println("\nWhat type of drink options would you like?: full bar, wine & beer, or none");
        boolean accurateBarInput = true;
        while(accurateBarInput) {
          bar = console.readLine().toUpperCase();
          if(bar.equals("FULL BAR") || bar.equals("WINE & BEER") || bar.equals("NONE")){
            accurateBarInput = false;
          } else {
            System.out.println("\nI'm sorry, that is not a listed option. Please enter one of the following bar options: full bar, wine & beer, or none");
          }
        }

        System.out.println("\nWhat type of entertainment would you like?: DJ, steel drum band, line dancing, magician, or none");
        boolean accurateEntertainmentInput = true;
        while(accurateEntertainmentInput) {
          entertainment = console.readLine().toUpperCase();
          if(entertainment.equals("DJ") || entertainment.equals("STEEL DRUM BAND") || entertainment.equals("LINE DANCING") || entertainment.equals("MAGICIAN")  || entertainment.equals("NONE") ){
            accurateEntertainmentInput = false;
          } else {
            System.out.println("\nI'm sorry, that is not a listed option. Please enter one of the following entertainment options: DJ, steel drum band, line dancing, magician, or none");
          }
        }
      } else if (userInput.equals("EXIT")) {
        runPartyProgram = false;
      } else {
        System.out.println("Did not recognize input - Enter \"PARTY\" to plan your next party with us, or \"EXIT\" to quit the program");
      }

      PartyPlanningService party = new PartyPlanningService (guests, meal, bar, entertainment);
      int cost = party.totalCost();

      System.out.print("\nYour party total is: $" + cost);
    //   // System.out.print("Your party total is: $%d", mTotalCost)
      runPartyProgram = false;
    }
    System.out.println("\n\nThank you for coming! We hope to be a part of your next party planning experience.");
  }
}
