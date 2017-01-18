package com.example.farhan.hospitalist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital);

        // Create a fake list of hospital locations.
        ArrayList<Hospital> hospitals = new ArrayList<>();
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list_item);

        // Create a new {@link ArrayAdapter} of hospital
        HospitalAdapter  hospitalAdapter = new HospitalAdapter(this,hospitals);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(hospitalAdapter);
    }
}
