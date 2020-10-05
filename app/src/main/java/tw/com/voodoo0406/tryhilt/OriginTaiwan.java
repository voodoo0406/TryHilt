package tw.com.voodoo0406.tryhilt;

import javax.inject.Inject;

public class OriginTaiwan implements Origin {

  @Inject
  public OriginTaiwan() {
  }

  @Override
  public String getOrigin() {
    return "Taiwan";
  }
}
