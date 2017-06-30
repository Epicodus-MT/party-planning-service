import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlanning {

  @Test
  public void runPartyPlanningService_instantiation() {
    Party testParty = new Party(100, "lunch", "none", "magician");
    assertEquals(true, testParty instanceOf Party);
  }

}
