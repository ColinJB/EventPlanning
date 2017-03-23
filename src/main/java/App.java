import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();
    System.out.println("Hello! Welcome to Pete's Party Planner! Please choose from the following options to create your party's itinerary. After your selections have been gathered, I will give you a summary of your event as well as the total cost.");
    System.out.println("How many guests will be attending?");
    String stringGuests = userConsole.readLine();
    int guests = Integer.parseInt(stringGuests);
    System.out.println("What kind of food would you like catered? Please enter one of the following: Barbeque, Seafood, or Soul-food.");
    String food = userConsole.readLine();
    System.out.println("What kind of beverages would you like provided? Please enter one of the following: Open-bar, Soda-bar, or Margaritas.");
    String beverages = userConsole.readLine();
    System.out.println("What kind of entertainment are we having? Please enter one of the following: Live-band, Laser-tag, or Pool-party.");
    String entertainment = userConsole.readLine();
    System.out.println("Do you have a coupon to be applied? Please enter the coupon; or if not, enter 'N/A'");
    String coupon = userConsole.readLine();
    EventPlanning event = new EventPlanning(guests, food, beverages, entertainment, coupon);
    System.out.println("Great! Thanks for your patience. Here are the details for your party:");
    System.out.println("-----------------");
    System.out.println("Number of Guests: " + stringGuests);
    System.out.println("Food: " + food);
    System.out.println("Beverages: " + beverages);
    System.out.println("Entertainment: " + entertainment);
    System.out.println("Coupon applied: " + coupon);

    int total = event.getCost();
    String stringTotal = Integer.toString(total);
    System.out.println("Total: $" + stringTotal);
  }
}
