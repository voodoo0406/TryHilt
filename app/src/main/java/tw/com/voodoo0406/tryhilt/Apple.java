package tw.com.voodoo0406.tryhilt;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

public class Apple extends Fruit {

  @Inject
  public Apple(@ApplicationContext Context applicationContext, Application application,
      Origin origin) {
    super(origin);
    Log.d("GGGGG",
        "applicationContext is " + (applicationContext == null ? "null" : "NOT null") + ", "
            + applicationContext);
    Log.d("GGGGG",
        "application is " + (application == null ? "null" : "NOT null") + ", " + application);
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
