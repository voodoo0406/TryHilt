package tw.com.voodoo0406.tryhilt;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class MyApplicationModule {
  @Provides
  @Singleton
  public static GlobalData provideGlobalData(@ApplicationContext Context context) {
    return new GlobalData(context);
  }
}
