package tw.com.voodoo0406.tryhilt;

import android.content.Context;
import android.util.Log;
import dagger.hilt.android.qualifiers.ApplicationContext;

public class GlobalData {

  Context context;
  public GlobalData(@ApplicationContext Context context) {
    this.context = context;
  }

  public void printInfo() {
    Log.d("GGGGG", "Hello GlobalData: " + context);
  }
}
