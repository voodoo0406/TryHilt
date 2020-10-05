package tw.com.voodoo0406.tryhilt;

import javax.inject.Inject;

public class Apple extends Fruit {

  @Inject
  public Apple(Origin origin) {
    super(origin);
  }

  @Override
  public String getName() {
    return "Apple";
  }

  @Override
  public int getPrice() {
    return 50;
  }
}
