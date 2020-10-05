package tw.com.voodoo0406.tryhilt;

import android.util.Log;

public abstract class Fruit {

  private final Origin origin;

  public Fruit(Origin origin) {
    this.origin = origin;
  }

  public void printInfo() {
    Log.d("GGGGG", getName() + ": " + getPrice() + ", origin from " + origin.getOrigin());
  }

  abstract String getName();

  abstract int getPrice();
}
