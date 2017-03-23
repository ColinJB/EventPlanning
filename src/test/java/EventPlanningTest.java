import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    assertEquals(true, testEvent instanceof EventPlanning);
  }

  @Test
  public void getGuests_returnsNumberOfGuests_int() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    int expected = 100;
    assertEquals(expected, testEvent.getGuests());
  }

  @Test
  public void getFood_returnsFoodChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    String expected = "Barbeque";
    assertEquals(expected, testEvent.getFood());
  }

  @Test
  public void getBeverage_returnsBeverageChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    String expected = "Open-bar";
    assertEquals(expected, testEvent.getBeverage());
  }

  @Test
  public void getEntertainment_returnsEntertainmentChoice_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    String expected = "Live-band";
    assertEquals(expected, testEvent.getEntertainment());
  }

  @Test
  public void getCost_returnsCostOfEvent_Integer() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    Integer expected = 2400;
    assertEquals(expected, testEvent.getCost());
  }

  @Test
  public void getCoupon_returnsCouponOption_String() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band", "VIP");
    String expected = "VIP";
    assertEquals(expected, testEvent.getCoupon());
  }
}
