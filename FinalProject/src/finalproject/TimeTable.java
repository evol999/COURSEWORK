/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author evol9
 */
public class TimeTable {

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

    public TimeTable(ArrayList<TimeSlot> tsList) {
        this.tsList = tsList;
    }
    private ArrayList<TimeSlot> tsList;
    
    
}