import java.util.*;

public class PartyPlanningService {
  private int mGuestNumbers;
  private String mMealOptions;
  private String mBarOptions;
  private String mEntertainmentOptions;
  private int mTotalCost;

  public Party (int guests, String meal, String bar, String entertainment) {
    mGuestNumbers = guests;
    mMealOptions = meal.toUpperCase();
    mBarOptions = bar.toUpperCase();
    mEntertainmentOptions = entertainment.toUpperCase();
  }

  public int totalCost() {
    mTotalCost = 1;
    if (mMealOptions.equals("LUNCH")) {
      mTotalCost += 12;
    } else if (mMealOptions.equals("DINNER")) {
      mTotalCost += 15;
    } else if (mMealOptions.equals("LIGHT APPS")) {
    mTotalCost += 7;
    } else if (mMealOptions.equals("HEAVY APPS")) {
      mTotalCost += 10;

    if (mBarOptions.equals("FULL BAR")) {
      mTotalCost += 20;
    } else if (mBarOptions.equals("WINE & BEER")) {
      mTotalCost += 10;
    }
    mTotalCost *= mGuestNumbers;

    if (mEntertainmentOptions.equals("DJ")) {
      mTotalCost += 1200;
    } else if (mEntertainmentOptions.equals("STEEL DRUM BAND")) {
      mTotalCost += 400;
    } else if (mEntertainmentOptions.equals("LINE DANCING")) {
      mTotalCost += 700;
    } else if (mEntertainmentOptions.equals("MAGICIAN")) {
      mTotalCost += 200;
    }
  return mTotalCost;
  }
}
