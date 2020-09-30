package tw.com.voodoo0406.tryhilt;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class FruitModule {

  @Binds
  public abstract Fruit bindApple(Apple apple);
}
