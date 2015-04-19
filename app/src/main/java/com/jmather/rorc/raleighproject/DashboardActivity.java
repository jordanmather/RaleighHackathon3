package com.jmather.rorc.raleighproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class DashboardActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle.getBoolean("isRecording"))
        {
            Button endTrip = (Button)findViewById(R.id.endRecording);
            endTrip.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
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
    public void avgDay(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgDay.class);

        startActivity(intent);
    }
    public void avgWeek(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgWeek.class);

        startActivity(intent);
    }
    public void avgMonth(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgMonth.class);

        startActivity(intent);
    }
    public void avgYear(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgYear.class);

        startActivity(intent);
    }
}
