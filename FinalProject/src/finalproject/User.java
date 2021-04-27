/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author evol9
 */
public class User {

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the timeTable
     */
    public TimeTable getTimeTable() {
        return timeTable;
    }

    /**
     * @param timeTable the timeTable to set
     */
    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }
    private String fullName;
    private TimeTable timeTable;

}
