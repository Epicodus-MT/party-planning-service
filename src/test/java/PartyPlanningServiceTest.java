import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlanning {

  @Test
  public void runPartyPlanningService_instatiates() {
    PartyPlanning testPartyPlanning = new PartyPlanning(100, "lunch", "none", "none");
    assertEquals(true, testPartyPlanning instanceOf PartyPlanning);
  }

}
