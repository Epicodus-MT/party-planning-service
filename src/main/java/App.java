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
    System.out.println("* $100 discount for 100+ guests");
    System.out.println("* $250 discount if you order both the DJ music option and Full Bar beverage option");
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

        System.out.println("\nWhat type of food would you like (cost/person)?: lunch ($12), dinner($15), light apps ($7), heavy apps ($10), or none");
        boolean accurateMealInput = true;
        while(accurateMealInput) {
          meal = console.readLine().toUpperCase();
          if(meal.equals("LUNCH") || meal.equals("DINNER") || meal.equals("LIGHT APPS") || meal.equals("HEAVY APPS")  || meal.equals("NONE") ){
            accurateMealInput = false;
          } else {
            System.out.println("\nI'm sorry, that is not a listed option. Please enter one of the following meal options: lunch, dinner, light apps, heavy apps, or none");
          }
        }

        System.out.println("\nWhat type of drink options would you like (cost/person)?: full bar ($20), wine & beer ($10), or none");
        boolean accurateBarInput = true;
        while(accurateBarInput) {
          bar = console.readLine().toUpperCase();
          if(bar.equals("FULL BAR") || bar.equals("WINE & BEER") || bar.equals("NONE")){
            accurateBarInput = false;
          } else {
            System.out.println("\nI'm sorry, that is not a listed option. Please enter one of the following bar options: full bar, wine & beer, or none");
          }
        }

        System.out.println("\nWhat type of entertainment would you like?: DJ ($1200), steel drum band ($150), line dancing ($300), magician ($200), or none");
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

      Event party = new Event (guests, meal, bar, entertainment);
      int cost = party.getTotalCost();

      if (party.getGuests() >= 100) {
          System.out.println("\nSince you have 100+ guests, you have qualified for a $100 discount.");
      }
      if (party.getBar().equals("FULL BAR")) {
        if (party.getEntertainment().equals("DJ")) {
          System.out.println("\nSince you have combined the Full Bar Service and DJ Entertainment, you have qualified for a $250 discount.");
        }
      }

      System.out.print("\nYour party total is: $" + cost);
      runPartyProgram = false;
    }
    System.out.println("\n\nThank you for coming! We hope to be a part of your next party planning experience.\b");
  }
}
