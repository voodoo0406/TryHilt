package tw.com.voodoo0406.tryhilt;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class FruitModule {

  @Binds
  public abstract Fruit bindApple(Apple apple);

  @Binds
  public abstract Origin bindOrigin(OriginTaiwan originTaiwan);
}
