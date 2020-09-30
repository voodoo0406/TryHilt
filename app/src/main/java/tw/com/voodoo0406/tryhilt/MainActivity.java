package tw.com.voodoo0406.tryhilt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

  @Inject
  Fruit apple;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    apple.printInfo();
  }
}
