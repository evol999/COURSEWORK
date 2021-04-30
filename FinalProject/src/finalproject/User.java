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

    protected String fullName;
    protected TimeTable tTappointments;

    public User() {
        tTappointments = new TimeTable();
    }

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
     * @return the tTappointments
     */
    public TimeTable gettTappointments() {
        return tTappointments;
    }

    /**
     * @param tTappointments the tTappointments to set
     */
    public void settTappointments(TimeTable tTappointments) {
        this.tTappointments = tTappointments;
    }

}
