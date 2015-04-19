package com.jmather.rorc.raleighproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;


import android.widget.EditText;
import android.widget.ImageButton;

import org.json.JSONArray;


import java.sql.Time;
import java.util.Calendar;
import java.util.Stack;
import java.util.Timer;
import java.util.Date;

import java.util.Timer;






public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void dashboardButton(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, DashboardActivity.class);
        boolean recording = false;
        intent.putExtra("isRecording", recording);
        startActivity(intent);

        Log.i("MainActivity", "Starting Dashboard");

        startActivity(intent);
    }


    public void startButton(View view)
    {
        //start a thread to deal with the recording, then display the dashboard
        //RecordingDrive rd = new RecordingDrive(); //might be threaded later and need more

        GPSTracker gps = new GPSTracker(this);
        int dayOfYear = Calendar.DAY_OF_YEAR;
        String date = "" + dayOfYear;
        int getTime = Calendar.HOUR;
        String time = "" + getTime;
        int day = Calendar.DAY_OF_WEEK;
        String dayOfWeek = "" + day;
        String sDate = date.toString();
        boolean recording = true;
        while(recording = true)
        {
            Location ourLocation = gps.getLocation();
            double lat = ourLocation.getLatitude();
            double lon = ourLocation.getLongitude();
            DriveInstance locate = new DriveInstance(date, dayOfWeek, time, lat, lon);
        }

        Intent intent = new Intent(this, DashboardActivity.class);


        GPS startGPS = new GPS();
        startGPS.start();

        Intent gold = new Intent(this, DashboardActivity.class);
         recording = true;

        intent.putExtra("isRecording", recording);
        startActivity(intent);


    }


}
