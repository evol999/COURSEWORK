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
public class Physician extends ClubMember {

    private ArrayList<Speciality> specialtyList;

    /**
     * @return the specialtyList
     */
    public ArrayList<Speciality> getSpecialtyList() {
        return specialtyList;
    }

    /**
     * @param specialtyList the specialtyList to set
     */
    public void setSpecialtyList(ArrayList<Speciality> specialtyList) {
        this.specialtyList = specialtyList;
    }
}
