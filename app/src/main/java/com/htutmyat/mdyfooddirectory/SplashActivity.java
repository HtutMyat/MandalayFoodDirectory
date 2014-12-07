package com.htutmyat.mdyfooddirectory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    Thread timer=new Thread(){

      public void run()
      {
        super.run();
        try {
          sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }finally {
          final Intent openIntent=new Intent(SplashActivity.this,FirstActivity.class);
          openIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
          startActivity(openIntent);
          finish();
        }
      }

    };
    timer.start();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_splash, menu);

    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
