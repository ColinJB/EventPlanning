class EventPlanning {
  private int mGuests;
  private String mFood;
  private String mBeverage;
  private String mEntertainment;
  private String mCoupon;

  public EventPlanning(int guests, String food, String beverage, String entertainment, String coupon) {
    mGuests = guests;
    mFood = food;
    mBeverage = beverage;
    mEntertainment = entertainment;
    mCoupon = coupon;
  }

  String[] foodChoices = {"Barbeque", "Seafood", "Soul-food"};
  String[] beverageChoices = {"Open-bar", "Soda-bar", "Margaritas"};
  String[] entertainmentChoices = {"Live-band", "Laser-tag", "Pool-party"};
  String[] couponOptions = {"New Customer", "VIP", "N/A"};

  public int getGuests() {
    return mGuests;
  }
  public String getFood() {
    return mFood;
  }
  public String getBeverage() {
    return mBeverage;
  }
  public String getEntertainment() {
    return mEntertainment;
  }
  public String getCoupon() {
    return mCoupon;
  }

  public Integer getCost() {
    Integer cost = 0;
    cost += (mGuests * 5);

    if ( mFood.equals("Barbeque") ) {
      cost += (mGuests * 7);
    } else if ( mFood.equals("Seafood") ) {
      cost += (mGuests * 10);
    } else if ( mFood.equals("Soul-food") ) {
      cost += (mGuests * 5);
    }

    if ( mBeverage.equals("Open-bar") ) {
      cost += (mGuests * 10);
    } else if ( mBeverage.equals("Soda-bar") ) {
      cost += (mGuests / 2);
    } else if ( mBeverage.equals("Margaritas") ) {
      cost += (mGuests * 5);
    }

    if ( mEntertainment.equals("Live-band") ) {
      cost += 200;
    } else if ( mEntertainment.equals("Laser-tag") ) {
      cost += 100;
    } else if ( mEntertainment.equals("Pool-party") ) {
      cost += 75;
    }

    if ( mCoupon.equals("VIP") ) {
      cost -= 100;
    } else if ( mCoupon.equals("New Customer") ) {
      cost -= 50;
    } else if ( mCoupon.equals("N/A") ) {
      cost += 0;
    }
    return cost;
  }
}
