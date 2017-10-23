package com.example.amin2.hangout.Model;

/**
 * Created by Mojibul on 10/23/2017.
 */

public class Travel_Event_Model {
    String destination;
    String budget;
    String fdate;
    String tdate;
    String key;

    public Travel_Event_Model(String destination, String budget, String fdate, String tdate, String key) {
        this.destination = destination;
        this.budget = budget;
        this.fdate = fdate;
        this.tdate = tdate;
        this.key = key;
    }

    public Travel_Event_Model() {

    }

    public String getBudget() {
        return budget;
    }

    public String getDestination() {
        return destination;
    }

    public String getFdate() {
        return fdate;
    }

    public String getTdate() {
        return tdate;
    }

    public String getKey() {
        return key;
    }
}
