/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import finalproject.TimeSlot.Days;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author evol9
 */
public class Physician extends ClubMember {

    /**
     * @return the tsFreeTime
     */
    public ArrayList<TimeSlot> getTsFreeTime() {
        return tsFreeTime;
    }

    /**
     * @param tsFreeTime the tsFreeTime to set
     */
    public void setTsFreeTime(ArrayList<TimeSlot> tsFreeTime) {
        this.tsFreeTime = tsFreeTime;
    }

    private ArrayList<Expertise> eExpertiseList;
    private ArrayList<TimeSlot> tsFreeTime;
    private String room;

    public Physician() {
        eExpertiseList = new ArrayList<>();
        tsFreeTime = new ArrayList<>();
    }

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

    /**
     * @return the eExpertiseList
     */
    public ArrayList<Expertise> geteExpertiseList() {
        return eExpertiseList;
    }

    /**
     * @param eExpertiseList the eExpertiseList to set
     */
    public void seteExpertiseList(ArrayList<Expertise> eExpertiseList) {
        this.eExpertiseList = eExpertiseList;
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
            eExpertiseList.add(tempExpertise);
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

    public void populateWeek(String startEndHours) {
        ArrayList<String> slots = new ArrayList<>();
        int startHour;
        int endHour;
        String tempString;

        startHour = Integer.parseInt(startEndHours.substring(0, 2));
        endHour = Integer.parseInt(startEndHours.substring(5, 7));

        System.out.println("startHour= " + startHour);
        System.out.println("endHour= " + endHour);

        Days days[] = Days.values();

        for (Days day : days) {
            if (day.equals(Days.SUN)) {
                continue;
            }
            System.out.println("creating for " + day.name());
            for (int i = startHour; i < endHour; i++) {
                tempString = day.name() + String.format(" %02d00 %02d00", i, i + 1);
                System.out.println(tempString);
                slots.add(tempString);
            }
            for (String slot : slots) {
                this.timeTable.addTimeSlot(slot);
            }
        }
    }

    public void setConsultationHours(String property) {
        String[] timeSlots = property.split(";");
        Timestamp slotTimeStamp;

//        TimeSlot
        for (String strTimeSlot : timeSlots) {
//            System.out.println(strTimeSlot);

            for (TimeSlot timeSlot : this.timeTable.getTsList()) {
                slotTimeStamp = timeSlot.calcTimestamp(timeTable.getBaseTimeStamp(), property);
                if (timeSlot.getTimeStampStart().equals(slotTimeStamp)) {
                    System.out.println("found");
                }
            }
        }

        // convert to time stamp
        // search slot
        // if found remove add two with flag set
        // sort timeSlots
        // if not found add two
    }

}
