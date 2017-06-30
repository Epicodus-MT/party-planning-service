import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlanningServiceTest {

  @Test
  public void runPartyPlanningService_instatiates() {
    PartyPlanningService testPartyPlanningService = new PartyPlanningService();
    assertEquals(true, testPartyPlanningService instanceOf PartyPlanningService);
  }

}
