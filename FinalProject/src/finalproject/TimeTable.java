/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author evol9
 */
public class TimeTable {

    private ArrayList<TimeSlot> tsList;
    private Timestamp baseTimeStamp;

    public TimeTable() {
        this.tsList = new ArrayList<>();
        this.baseTimeStamp = new Timestamp(0);
    }

    public TimeTable(ArrayList<TimeSlot> tsList) {
        this.tsList = tsList;
    }

    /**
     * @return the baseTimeStamp
     */
    public Timestamp getBaseTimeStamp() {
        return baseTimeStamp;
    }

    /**
     * @param baseTimeStamp the baseTimeStamp to set
     */
    public void setBaseTimeStamp(Timestamp baseTimeStamp) {
        this.baseTimeStamp = baseTimeStamp;
    }

    /**
     * @return the tsList
     */
    public ArrayList<TimeSlot> getTsList() {
        return tsList;
    }

    /**
     * @param tsList the tsList to set
     */
    public void setTsList(ArrayList<TimeSlot> tsList) {
        this.tsList = tsList;
    }

    public void addTimeSlot(String strValue) {
        // MON 0700 0800

        TimeSlot tempTimeSlot = new TimeSlot(baseTimeStamp, baseTimeStamp, Boolean.TRUE);
        tsList.add(tempTimeSlot);
        // convert to array organize
        // convert to arraylist
        // set as availbe slot
        // Add for four weeks

    }

    public enum Days {
        SUN,
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT
    }

}
