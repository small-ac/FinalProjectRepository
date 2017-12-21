package com.example.alexi.cst2335_finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Dashboard extends AppCompatActivity {

    private View dashboardLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dashboardLayout = findViewById(R.id.dashboard_content);

        final FloatingActionButton fabAdd = (FloatingActionButton) findViewById(R.id.info);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(dashboardLayout, "Created By Alexis Small,  Elie Massaad, Eric Laroche," +
                        " and Alex Mastropietro", Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.automobile:
                Log.i("Activity Selected:", "Automobile Tracker");
                Intent autoActivity = new Intent(this, AutoActivity.class);
                startActivity(autoActivity);
                break;

            case R.id.nutrition:
                Log.i("Activity Selected:", "Nutrition Tracker");
                break;

            case R.id.activity:
                Log.i("Activity Selected:", "Activity Tracker");
                break;

            case R.id.thermostat:
                Log.i("Activity Selected:", "Thermostat Tracker");
                break;
        }

            return super.onOptionsItemSelected(item);
        }

}