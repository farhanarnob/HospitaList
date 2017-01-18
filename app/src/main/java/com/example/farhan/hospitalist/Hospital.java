package com.example.farhan.hospitalist;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class Hospital {
    String hospitalName, hospitalNumber;
    int hospitalCall;
    public Hospital(String hospitalName, String hospitalNumber, int hospitalCall){
        this.hospitalName = hospitalName;
        this.hospitalNumber = hospitalNumber;
        this.hospitalCall = hospitalCall;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }
    public int getHospitalCall() {
        return hospitalCall;
    }

}
