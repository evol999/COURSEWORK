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
import java.util.Calendar;
import java.util.Collections;

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
        // Add for four weeks

    }

    void parseTimeSlots(String property) {
        String[] timeSlots = property.split(";");
        for (String timeSlot : timeSlots) {
            System.out.println(timeSlot);
            addTimeSlot(timeSlot.trim());
        }

//        System.out.println("Unsorted array start:");
//        for (TimeSlot temp : tsList) {
//            System.out.println(temp.getTimeStampStart());
//        }
//        System.out.println("Unsorted array end");
        sortTimeSlots();

//        System.out.println("Sorted array start:");
//        for (TimeSlot temp : tsList) {
//            System.out.println(temp.getTimeStampStart());
//        }
//        System.out.println("Sorted array end");
    }

    private void sortTimeSlots() {
        // convert to array organize
        //        Object[] arrayTimeSlots = tsList.toArray();
        Collections.sort(tsList);

        // convert to arraylist
        // set as availbe slot
    }

    Timestamp incTimestampOneDay(Timestamp baseTimeStamp) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(baseTimeStamp);
        cal.add(Calendar.DAY_OF_WEEK, 1);
        baseTimeStamp.setTime(cal.getTime().getTime()); // or
//        baseTimeStamp = new Timestamp(cal.getTime().getTime());
        return baseTimeStamp;

    }

    Timestamp incTimestampOneWeek(Timestamp baseTimeStamp) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(baseTimeStamp);
        cal.add(Calendar.DAY_OF_WEEK, 7);
        baseTimeStamp.setTime(cal.getTime().getTime()); // or
//        baseTimeStamp = new Timestamp(cal.getTime().getTime());
        return baseTimeStamp;

    }

    ArrayList<TimeSlot> removeSlot(ArrayList<TimeSlot> tTable1, TimeSlot timeSlot) {

//        ArrayList<TimeSlot> tTableBig;
//        ArrayList<TimeSlot> tTableSmall;
        ArrayList<TimeSlot> tTableResult = new ArrayList<>();

//        if(tTable2.size() < tTable1.size()) {
//            tTableSmall = new ArrayList<>(tTable2);
//            tTableBig = new ArrayList<>(tTable1);
//        } else {
//            tTableSmall = new ArrayList<>(tTable1);
//            tTableBig = new ArrayList<>(tTable2);
//
//        }
        for (TimeSlot timeSlotl : tTable1) {
            if (timeSlot.isIncludedIn(timeSlotl)) {
                // Split timeslot
                tTableResult.addAll(timeSlotl.substract(timeSlot));
                // add splited
            } else {
                tTableResult.add(timeSlotl);
            }

        }
        return tTableResult;
    }
}
