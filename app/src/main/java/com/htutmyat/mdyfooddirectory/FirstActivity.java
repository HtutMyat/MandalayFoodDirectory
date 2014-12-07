package com.htutmyat.mdyfooddirectory;

import Adapter.GridAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class FirstActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(R.id.container, new PlaceholderFragment())
          .commit();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_first, menu);
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

  /**
   * A placeholder fragment containing a simple view.
   */
  public static class PlaceholderFragment extends Fragment {

    private GridView firstGridView;
    String [] Category={"Tea Shop","Shan Food","Myanmar Traditioanl Food","Sushi","Europian Food","Coffee Shop","Beer & BBQ","Cold Drink","Bar & Restaurent"};


    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_first, container, false);
      firstGridView=(GridView)rootView.findViewById(R.id.gViewFirst);
      GridAdapter myGridAdapter=new GridAdapter(getActivity(),Category);
      firstGridView.setAdapter(myGridAdapter);

      firstGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          Intent myIntent=new Intent(getActivity(),SecondActivity.class);
          myIntent.putExtra("choose",firstGridView.getItemAtPosition(i).toString());
          startActivity(myIntent);
        }
      });

      return rootView;
    }
  }
}
