import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    EventPlanning testEvent = new EventPlanning();
    assertEquals(true, testEvent instanceof EventPlanning);
  }
}
