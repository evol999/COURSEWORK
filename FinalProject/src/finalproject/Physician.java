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

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    private ArrayList<Expertise> expertiseList;
    private String room;

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
//        Physioterapy["Neural mobilisation", "Massage"]; Osteopathy["Mobilisation of the spine and joints", "Pool rehabilitation"]
        int indexTreatments;
        int indexEndTreatments;
        String[] expertises = property.split(";");
        for (String expertise : expertises) {
            Expertise tempExpertise = new Expertise();
            System.out.println("Expertise to add: " + expertise.trim());
//            checks for treatments
            indexTreatments = expertise.trim().indexOf('[');
            if (-1 == indexTreatments) // No treatments
            {
                tempExpertise.setSpecialityName(expertise.trim());
            } else // there are treatments
            {
                tempExpertise.setSpecialityName(expertise.trim().substring(0, indexTreatments));
                indexEndTreatments = expertise.trim().indexOf(']');
                addTreatments(tempExpertise, expertise.trim().substring(indexTreatments + 1, indexEndTreatments));
            }
            expertiseList.add(tempExpertise);
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

    private void addTreatments(Expertise tempExpertise, String substring) {
        String[] treatments = substring.split(",");
        for (String treatment : treatments) {
            tempExpertise.addTreatment(treatment.trim());
            System.out.println("added treatment: " + treatment.trim());
        }
    }
}
