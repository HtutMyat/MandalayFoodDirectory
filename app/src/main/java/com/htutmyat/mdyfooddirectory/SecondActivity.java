package com.htutmyat.mdyfooddirectory;

import Adapter.GridAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class SecondActivity extends ActionBarActivity {

  private ListView secondListView;
  private String[] teashop={"teashop1","teashop2","teashop3","teashop4","teashop5"};
  private String[] shanfood={"shop1","shop2","shop3","shop4","shop5"};
  private String[] myanmarfood={"shop1","shop2","shop3","shop4","shop5"};
  private String[] sushi={"shop1","shop2","shop3","shop4","shop5"};
  private String[] eufood={"shop1","shop2","shop3","shop4","shop5"};
  private String[] coffee={"shop1","shop2","shop3","shop4","shop5"};
  private String[] beer={"shop1","shop2","shop3","shop4","shop5"};
  private String[] colddrink={"shop1","shop2","shop3","shop4","shop5"};
  private String[] bar={"shop1","shop2","shop3","shop4","shop5"};
  //private String[] shanfood={"shop1","shop2","shop3","shop4","shop5"};


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    secondListView=(ListView)findViewById(R.id.listViewSecond);
    Intent SecondIntent=getIntent();
    String msg=SecondIntent.getStringExtra("choose");

    String [] choice={};

    switch (msg){
      case "Tea Shop":choice=teashop;
             break;
      case "Shan Food":choice=shanfood;
             break;
      case "Myanmar Traditioanl Food":choice=myanmarfood;
            break;
      case "Sushi":choice=sushi;
            break;
      case "Europian Food":choice=eufood;
            break;
      case "Coffee Shop":choice=coffee;
            break;
      case "Beer & BBQ":choice=beer;
            break;
      case "Cold Drink":choice=colddrink;
            break;
      case "Bar & Restaurent":choice=bar;
            break;
      default:choice=teashop;
            break;
    }
    GridAdapter secondGridAdapter=new GridAdapter(this,choice);
    secondListView.setAdapter(secondGridAdapter);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_second, menu);
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
