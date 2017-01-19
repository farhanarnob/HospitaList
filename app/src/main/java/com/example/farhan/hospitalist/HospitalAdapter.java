package com.example.farhan.hospitalist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
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

    Context context;
    public HospitalAdapter(Context context, ArrayList<Hospital> hospital) {
        super(context, 0, hospital);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        final Hospital hospital = getItem(position);

        TextView hospitalName = (TextView) listItemView.findViewById(R.id.hospital_name);
        hospitalName.setText(hospital.getHospitalName()+"");

        TextView hospitalMobile = (TextView) listItemView.findViewById(R.id.hospital_mobile);
        hospitalMobile.setText(hospital.getHospitalNumber());

        final ImageView imageView = (ImageView ) listItemView.findViewById(R.id.hospital_call);
        imageView.setImageResource(R.drawable.call);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(imageView," do you want to call : "+ hospital.getHospitalNumber(),Snackbar.LENGTH_INDEFINITE)
                        .setAction("Call", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(
                                        "tel", hospital.getHospitalNumber(), null));
                                context.startActivity(intent);
                            }
                        });

                snackbar.show();
            }
        });



        return listItemView;
    }
}
