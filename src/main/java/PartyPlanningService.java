import java.util.*;

public class PlanningServiceTest {
  private int mGuestNumbers;
  private String mMealOptions;
  private String mBarOptions;
  private String mEntertainmentOptions;
  private int mMealCost;
  private int mBarCost;
  private int mEntertainmentCost;
  private int mTotalCost;

  public Party (int guests, String meal, String bar, String entertainment) {
    mGuestNumbers = guests;
    mMealOptions = meal.toUpperCase();
    mBarOptions = bar.toUpperCase();
    mEntertainmentOptions = entertainment.toUpperCase();
  }


  // List<String> party = new ArrayList<String>();
  // public void initializeParty() {
  //
  // }
  //
  // public List<String> userPlanParty(){
  //   party.clear();
  //   //plan new party
  //
  //
  // }
  //
  // public int getTotalCosts(List<string> eventsChosen) {
  //   int total = 0;
  //   for (String event : eventsChosen) {
  //     String[] eventArray = event.split(" ");
  //       if(eventArray[0].equals("breakfast")) {
  //         total += 10;
  //       } else if (eventArray[0].equals("lunch")) {
  //         total += 12;
  //       } else if (eventArray[0].equals("dinner")) {
  //       total += 12;
  //       }
  //     }
  // for (String event : eventsChosen) {
  //
  //   }
  //   return total;
  // }
}
