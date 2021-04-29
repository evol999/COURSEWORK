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

    private ArrayList<Expertise> expertiseList;

    public Physician() {
        expertiseList = new ArrayList<Expertise>();
    }

    /**
     * @return the expertiseList
     */
    public ArrayList<Expertise> getExpertiseList() {
        return expertiseList;
    }

    /**
     * @param expertiseList the expertiseList to set
     */
    public void setExpertiseList(ArrayList<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }

    void parseTimeSlots(String property) {
        this.timeTable.parseTimeSlots(property);
    }

    void parseExpertise(String property) {
        int indexOfTreatments;
//        Physioterapy["Neural mobilisation", "Massage"]; Osteopathy["Mobilisation of the spine and joints", "Pool rehabilitation"]
        String[] expertises = property.split(";");
        for (String expertise : expertises) {
            System.out.println(expertise);
//            checks for treatments
            indexOfTreatments = expertise.trim().indexOf('[');
            if (-1 == indexOfTreatments) // No treatments
            {
                addExpertise(expertise.trim());
            } else // there are treatments
            {
                addExpertise(expertise.trim().substring(0, indexOfTreatments));

//                addTreatments();
            }

        }

//        System.out.println("Unsorted array start:");
//        for (TimeSlot temp : tsList) {
//            System.out.println(temp.getTimeStampStart());
//        }
//        System.out.println("Unsorted array end");
//        sortTimeSlots();
//        System.out.println("Sorted array start:");
//        for (TimeSlot temp : tsList) {
//            System.out.println(temp.getTimeStampStart());
//        }
//        System.out.println("Sorted array end");
    }

    private void addExpertise(String substring) {
        Expertise tempExpertise = new Expertise();

        System.out.println("Expertise added: " + substring);
        tempExpertise.setSpecialityName(substring);
        expertiseList.add(tempExpertise);
    }
}
