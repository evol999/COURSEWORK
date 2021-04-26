/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Timestamp;

/**
 *
 * @author evol9
 */
public class TimeSlot {

    public TimeSlot(Timestamp timeStampStart, Timestamp timeStampEnd, Boolean isAvailable) {
        this.timeStampStart = timeStampStart;
        this.timeStampEnd = timeStampEnd;
        this.isAvailable = isAvailable;
    }

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
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    private Timestamp timeStampStart;
    private Timestamp timeStampEnd;
    private Boolean isAvailable;
    
}
