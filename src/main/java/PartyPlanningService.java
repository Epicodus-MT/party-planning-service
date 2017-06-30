import java.util.*;

public class PlanningServiceTest {

  List<String> party = new ArrayList<String>();
  public void initializeParty() {

  }

  public List<String> userPlanParty(){
    party.clear();
    //plan new party


  }

  public int getTotalCosts(List<string> eventsChosen) {
    int total = 0;
    for (String event : eventsChosen) {
      String[] eventArray = event.split(" ");
        if(eventArray[0].equals("breakfast")) {
          total += 10;
        } else if (eventArray[0].equals("lunch")) {
          total += 12;
        } else if (eventArray[0].equals("dinner")) {
        total += 12;
        }
      }
    // for (String event : eventsChosen) {

    }
    return total;
  }
}
