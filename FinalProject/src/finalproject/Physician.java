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

    private ArrayList<String> specialtyList;

    /**
     * @return the specialtyList
     */
    public ArrayList<String> getSpecialtyList() {
        return specialtyList;
    }

    /**
     * @param specialtyList the specialtyList to set
     */
    public void setSpecialtyList(ArrayList<String> specialtyList) {
        this.specialtyList = specialtyList;
    }
}
