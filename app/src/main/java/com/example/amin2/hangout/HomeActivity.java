package com.example.amin2.hangout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private Activity camera;
    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(HomeActivity.this,Add_travel_Event.class);
                startActivity(intent);
            }
        });

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    break;

                case R.id.navigation_dashboard:
                    Intent intentDashboard= new Intent(HomeActivity.this,DashboardActivity.class);
                    startActivity(intentDashboard);
                    break;
                case R.id.navigation_camera:
                    Intent intentCamera= new Intent(HomeActivity.this,cameraActivity.class);
                    startActivity(intentCamera);
                    break;
                case R.id.navigation_weather:
                    break;
                case R.id.navigation_nearby:
                    Intent intentNearBy= new Intent(HomeActivity.this,NearByActivity.class);
                    startActivity(intentNearBy);
                    break;
            }
            return false;
        }

    };

}
