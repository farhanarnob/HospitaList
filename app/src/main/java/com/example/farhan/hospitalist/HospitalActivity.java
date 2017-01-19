package com.example.farhan.hospitalist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class HospitalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital);

        // Create a fake list of hospital locations.
        DatabaseHandlerHospital databaseHandlerHospital = new DatabaseHandlerHospital(this);
        if(databaseHandlerHospital.insertOrNot()){
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
            databaseHandlerHospital.addContact(new Hospital("Bardem", "01756008999"));
            databaseHandlerHospital.addContact(new Hospital("Square", "01758660155"));
        }
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        ArrayList<Hospital> hospitals = databaseHandlerHospital.getAllContacts();


//        // Create a fake list of hospital locations.
//        ArrayList<Hospital> hospitals = new ArrayList<>();
//        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","0175865",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665asdf",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758655",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01755855",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","0175855",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));
//        hospitals.add(new Hospital("Bardem","01758665855",R.drawable.call));

        // Find a reference to the {@link ListView} in the layout
        ListView hospitalListView = (ListView) findViewById(R.id.list_item);

        // Create a new {@link ArrayAdapter} of hospital
        HospitalAdapter  hospitalAdapter = new HospitalAdapter(this,hospitals);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        hospitalListView.setAdapter(hospitalAdapter);
    }
}
