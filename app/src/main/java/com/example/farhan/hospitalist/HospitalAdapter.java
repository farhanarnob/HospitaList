package com.example.farhan.hospitalist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class HospitalAdapter extends ArrayAdapter<Hospital> {


    public HospitalAdapter(Context context, ArrayList<Hospital> hospital) {
        super(context, 0, hospital);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        Hospital hospital = getItem(position);

        TextView hospitalName = (TextView) listItemView.findViewById(R.id.hospital_name);
        hospitalName.setText(hospital.getHospitalName()+"");

        TextView hospitalMobile = (TextView) listItemView.findViewById(R.id.hospital_mobile);
        hospitalMobile.setText(hospital.getHospitalNumber());

        ImageView imageView = (ImageView ) listItemView.findViewById(R.id.hospital_call);
        imageView.setImageResource(hospital.getHospitalCall());



        return listItemView;
    }
}
