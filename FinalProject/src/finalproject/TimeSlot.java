/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author evol9
 */
public class TimeSlot implements Comparable<TimeSlot> {

    private Timestamp timeStampStart;
    private Timestamp timeStampEnd;
//    private Boolean isAvailable;
//    private Boolean isConsultation;

    TimeSlot(Timestamp baseTimeStamp, String strValue) {
        int hour;
        int minute;
        int daysToAdd;

//        System.out.println("strValue: " + strValue);
        // set timeStampStart
        // split string
        // MON 0700 0800
        daysToAdd = getDaysToAdd(strValue.trim().substring(0, 3));
        hour = Integer.parseInt(strValue.trim().substring(4, 6));
        minute = Integer.parseInt(strValue.trim().substring(6, 8));

        this.timeStampStart = calcNewTimestamp(baseTimeStamp, daysToAdd, hour, minute);
        System.out.println("timeStampStart: " + this.timeStampStart);

        hour = Integer.parseInt(strValue.trim().substring(9, 11));
        minute = Integer.parseInt(strValue.trim().substring(11, 13));

        this.timeStampEnd = calcNewTimestamp(baseTimeStamp, daysToAdd, hour, minute);
        System.out.println("timeStampEnd: " + this.timeStampEnd);

//        this.isAvailable = Boolean.TRUE;
//        this.isConsultation = Boolean.FALSE;
    }

    /**
     * @return the isConsultation
     */
//    public Boolean getIsConsultation() {
//        return isConsultation;
//    }
    /**
     * @param isConsultation the isConsultation to set
     */
//    public void setIsConsultation(Boolean isConsultation) {
//        this.isConsultation = isConsultation;
//    }
    /**
     * @return the timeStampStart
     */
    public Timestamp getTimeStampStart() {
        return timeStampStart;
    }

    /**
     * @param timeStampStart the timeStampStart to set
     */
    public void setTimeStampStart(Timestamp timeStampStart) {
        this.timeStampStart = timeStampStart;
    }

    /**
     * @return the timeStampEnd
     */
    public Timestamp getTimeStampEnd() {
        return timeStampEnd;
    }

    /**
     * @param timeStampEnd the timeStampEnd to set
     */
    public void setTimeStampEnd(Timestamp timeStampEnd) {
        this.timeStampEnd = timeStampEnd;
    }

    /**
     * @return the isAvailable
     */
//    public Boolean getIsAvailable() {
//        return isAvailable;
//    }
    /**
     * @param isAvailable the isAvailable to set
     */
//    public void setIsAvailable(Boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }
    private int getDaysToAdd(String day) {
        int retVal;
        Days enumDay = Days.valueOf(day);

        switch (enumDay) {
            case MON:
                retVal = 1;
                break;
            case TUE:
                retVal = 2;
                break;
            case WED:
                retVal = 3;
                break;
            case THU:
                retVal = 4;
                break;
            case FRI:
                retVal = 5;
                break;
            case SAT:
                retVal = 6;
                break;
            case SUN:
            default:
                retVal = 0;
                break;
        }
        return retVal;
    }

    private Timestamp calcNewTimestamp(Timestamp baseTimeStamp, int daysToAdd, int hour, int minute) {

        Timestamp retTimestamp;
        Calendar calTimestamp = Calendar.getInstance();
        calTimestamp.setTime(baseTimeStamp);
        calTimestamp.add(Calendar.DAY_OF_WEEK, daysToAdd);
        calTimestamp.set(Calendar.HOUR_OF_DAY, hour);
        calTimestamp.set(Calendar.MINUTE, minute);
//        baseTimeStamp.setTime(calTimestamp.getTime().getTime());
        retTimestamp = new Timestamp(calTimestamp.getTime().getTime());
//        System.out.println("retTimestamp: " + retTimestamp);
        return retTimestamp;
//        return new Timestamp(calTimestamp.getTime().getTime());

    }

    @Override
    public int compareTo(TimeSlot o) {
        int retVal = 0;

        if (this.timeStampStart.before(o.timeStampStart)) {
            retVal = -1;
        }
        if (this.timeStampStart.after(o.timeStampStart)) {
            retVal = 1;
        }

        return retVal;
    }

    public Timestamp calcTimestamp(Timestamp baseTimeStamp, String property) {
        int hour;
        int minute;
        int daysToAdd;
        Timestamp retVal;

        daysToAdd = getDaysToAdd(property.substring(0, 3));
        hour = Integer.parseInt(property.substring(4, 6));
        minute = Integer.parseInt(property.substring(6, 8));

        retVal = calcNewTimestamp(baseTimeStamp, daysToAdd, hour, minute);
        System.out.println("timeStampStart: " + retVal);
        return retVal;

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
