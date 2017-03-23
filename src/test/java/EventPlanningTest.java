import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    assertEquals(true, testEvent instanceof EventPlanning);
  }

  @Test
  public void getGuests_returnsNumberOfGuests_int() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    int expected = 100;
    assertEquals(expected, testEvent.getGuests());
  }

  @Test
  public void getFood_returnsFoodChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    String expected = "Barbeque";
    assertEquals(expected, testEvent.getFood());
  }

  @Test
  public void getBeverage_returnsBeverageChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    String expected = "Open-bar";
    assertEquals(expected, testEvent.getBeverage());
  }

  @Test
  public void getEntertainment_returnsEntertainmentChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    String expected = "Live-band";
    assertEquals(expected, testEvent.getEntertainment());
  }
}
