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
public class Speciality {

    /**
     * @return the specialityName
     */
    public String getSpecialityName() {
        return specialityName;
    }

    /**
     * @param specialityName the specialityName to set
     */
    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    /**
     * @return the treatments
     */
    public ArrayList<String> getTreatments() {
        return treatments;
    }

    /**
     * @param treatments the treatments to set
     */
    public void setTreatments(ArrayList<String> treatments) {
        this.treatments = treatments;
    }

    private String specialityName;
    private ArrayList<String> treatments;

}
