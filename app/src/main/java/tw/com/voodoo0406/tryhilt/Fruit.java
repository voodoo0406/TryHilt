package tw.com.voodoo0406.tryhilt;

import android.util.Log;

public abstract class Fruit {

  abstract String getName();
  abstract int getPrice();
  public void printInfo() {
    Log.d("GGGGG", getName() + ": " + getPrice());
  }
}
