import java.util.*;


class Event {
  private int mGuestNumbers;
  private String mMealOptions;
  private String mBarOptions;
  private String mEntertainmentOptions;
  private int mTotalCost;
  private int mFacilityRentalCost = 250;

  public Event (int guests, String meal, String bar, String entertainment) {
    mGuestNumbers = guests;
    mMealOptions = meal.toUpperCase();
    mBarOptions = bar.toUpperCase();
    mEntertainmentOptions = entertainment.toUpperCase();
  }

  public int getGuests() {
    return mGuestNumbers;
  }

  public String getMeal() {
    return mMealOptions;
  }

  public String getBar() {
    return mBarOptions;
  }

  public String getEntertainment() {
    return mEntertainmentOptions;
  }

  public int getTotalCost() {
    mTotalCost = 0;
// 100, "lunch", "none", "magician"
    if (mMealOptions.equals("LUNCH")) {
      mTotalCost += 12;
    } else if (mMealOptions.equals("DINNER")) {
      mTotalCost += 15;
    } else if (mMealOptions.equals("LIGHT APPS")) {
    mTotalCost += 7;
    } else if (mMealOptions.equals("HEAVY APPS")) {
      mTotalCost += 10;
    }

    if (mBarOptions.equals("FULL BAR")) {
      mTotalCost += 20;
    } else if (mBarOptions.equals("WINE & BEER")) {
      mTotalCost += 10;
    }
    mTotalCost *= mGuestNumbers; // 1188
    // mTotalCost += mFacilityRentalCost;

    if (mEntertainmentOptions.equals("DJ")) {
      mTotalCost += 1200;
    } else if (mEntertainmentOptions.equals("STEEL DRUM BAND")) {
      mTotalCost += 150;
    } else if (mEntertainmentOptions.equals("LINE DANCING")) {
      mTotalCost += 300;
    } else if (mEntertainmentOptions.equals("MAGICIAN")) {
      mTotalCost += 200;
    }

    if (mGuestNumbers >= 100) {
      mTotalCost -= 100;
    }

    if (mEntertainmentOptions.equals("DJ") && mBarOptions.equals("FULL BAR")) {
      mTotalCost -= 250;
    }

    mTotalCost += mFacilityRentalCost;
    return mTotalCost;
  }
}
