package com.example.myapplication;

import android.os.Build;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.O_MR1)
public class WelcomeActivityTest {

  @Test
  public void clickingLogin_shouldStartLoginActivity() {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);

    String actual = activity.getResources().getString(R.string.action_settings);

    assertThat(actual, CoreMatchers.equalTo("Настройки"));
  }
}