package com.example.amin2.hangout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.amin2.hangout.Model.Travel_Event_Model;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Add_travel_Event extends AppCompatActivity implements View.OnClickListener {

    EditText etBudget,etDestination,etfrom_date,etTo_date;
    Button btnSubmit,btnView;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_travel__event);

        firebaseDatabase=FirebaseDatabase.getInstance();
        ini();
    }

    private void ini() {

        etBudget= (EditText) findViewById(R.id.etBudget);
        etDestination= (EditText) findViewById(R.id.etDestination);
        etfrom_date= (EditText) findViewById(R.id.etFormdate);
        etTo_date= (EditText) findViewById(R.id.to_date);

        btnSubmit= (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSubmit:
                String budget=etBudget.getText().toString();
                String destination=etDestination.getText().toString();
                String fromdate=etfrom_date.getText().toString();
                String todate=etTo_date.getText().toString();
                DatabaseReference reference = firebaseDatabase.getReference().child("Information");
                String key=reference.push().getKey();
                Travel_Event_Model event =new Travel_Event_Model(destination,budget,fromdate,todate,key);
                reference.push().setValue(event);
                finish();
                break;

        }
    }
}
