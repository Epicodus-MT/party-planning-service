import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlanning {

  @Test
  public void runPartyPlanningService_instantiation() {
    Party testParty = new Party(100, "lunch", "none", "magicianS");
    assertEquals(true, testParty instanceOf Party);
  }

  @Test
  public void runPartyPlanningService_calculateCostOf250() {
    Party testParty = new Party(0, "none", "none", "none");
    assertEquals(true, testParty instanceOf Party);
  }

  @Test
  public void runPartyPlanningService_CalculateCostOf1388() {
    Party testParty = new Party(99, "lunch", "none", "magician");
    assertEquals(true, testParty instanceOf Party);
  }
  @Test //100+ people = 10 % discount
  public void runPartyPlanningService_CalculateCostOf1260() {
    Party testParty = new Party(100, "lunch", "none", "magician");
    assertEquals(true, testParty instanceOf Party);
  }
}
