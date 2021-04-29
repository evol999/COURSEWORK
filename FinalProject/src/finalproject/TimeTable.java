/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
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
        this.setBaseTimeStamp();
    }

    public TimeTable(ArrayList<TimeSlot> tsList) {
        this.tsList = tsList;
        this.setBaseTimeStamp();
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
     * @param baseTimeStamp the baseTimeStamp to set
     */
    private void setBaseTimeStamp() {
        // current time
        Timestamp tempTimestamp = new Timestamp(System.currentTimeMillis());
        // finds next sunday
        LocalDate currentDate = tempTimestamp.toLocalDateTime().toLocalDate();
        LocalDate nextSunday = currentDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("currentDate: " + currentDate);
        System.out.println("nextSunday: " + nextSunday);
        this.baseTimeStamp = Timestamp.valueOf(nextSunday.atStartOfDay());
        System.out.println(this.baseTimeStamp);
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
        // System.out.println("TimeStamp: " + this.baseTimeStamp.toString());
        TimeSlot tempTimeSlot = new TimeSlot(this.baseTimeStamp, strValue);
        tsList.add(tempTimeSlot);
        // convert to array organize
        // convert to arraylist
        // set as availbe slot
        // Add for four weeks

    }
}
