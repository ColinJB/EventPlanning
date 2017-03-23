class EventPlanning {
  private int mGuests;
  private String mFood;
  private String mBeverage;
  private String mEntertainment;

  public EventPlanning(int guests, String food, String beverage, String entertainment) {
    mGuests = guests;
    mFood = food;
    mBeverage = beverage;
    mEntertainment = entertainment;
  }
  public int getGuests() {
    return mGuests;
  }
  public String getFood() {
    return mFood;
  }

  public String getBeverage() {
    return mBeverage;
  }
}
