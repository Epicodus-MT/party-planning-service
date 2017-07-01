import java.io.Console;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiation() {
    Event testEvent = new Event(0, "none", "none", "none");
    assertEquals(testEvent.getTotalCost(), 250);
  }

  @Test //with $100 discount
  public void newEvent_calculateCostOf1550() {
    Event testEvent = new Event(100, "lunch", "none", "magician");
    assertEquals(testEvent.getGuests(), 100);
    assertEquals(testEvent.getMeal(), "LUNCH");
    assertEquals(testEvent.getBar(), "NONE");
    assertEquals(testEvent.getEntertainment(), "MAGICIAN");
    assertEquals(testEvent.getTotalCost(), 1550);
  }

  @Test //without $100 discount
  public void newEvent_calculateCostOf1638() {
    Event testEvent = new Event(99, "lunch", "none", "magician");
    assertEquals(testEvent.getGuests(), 99);
    assertEquals(testEvent.getMeal(), "LUNCH");
    assertEquals(testEvent.getBar(), "NONE");
    assertEquals(testEvent.getEntertainment(), "MAGICIAN");
    assertEquals(testEvent.getTotalCost(), 1638);
  }
}
