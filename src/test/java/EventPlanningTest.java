import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    EventPlanning testEvent = new EventPlanning(100, "Barbeque", "Open-bar", "Live-band");
    assertEquals(true, testEvent instanceof EventPlanning);
  }
}
