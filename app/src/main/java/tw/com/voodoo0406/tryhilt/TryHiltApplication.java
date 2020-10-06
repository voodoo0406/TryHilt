package tw.com.voodoo0406.tryhilt;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;

@HiltAndroidApp
public class TryHiltApplication extends Application {

  @Inject
  public GlobalData globalData;
}
