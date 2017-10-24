package com.example.amin2.hangout;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intentHome= new Intent(DashboardActivity.this,HomeActivity.class);
                    startActivity(intentHome);
                    break;
                case R.id.navigation_dashboard:

                    break;
                case R.id.navigation_camera:
                    Intent intentCamera= new Intent(DashboardActivity.this,cameraActivity.class);
                    startActivity(intentCamera);
                    break;
                case R.id.navigation_weather:
                    break;
                case R.id.navigation_nearby:
                    Intent intentNearBy= new Intent(DashboardActivity.this,NearByActivity.class);
                    startActivity(intentNearBy);
                    break;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


}
