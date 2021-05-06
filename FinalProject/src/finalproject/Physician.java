/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import finalproject.TimeSlot.Days;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author evol9
 */
public class Physician extends ClubMember {

    private ArrayList<Expertise> eExpertiseList;
    private ArrayList<TimeSlot> tsFreeTime;
    private ArrayList<TimeSlot> tsConsultationHours;
    private String room;
    private String workingHours;

    public Physician() {
        eExpertiseList = new ArrayList<>();
        tsFreeTime = new ArrayList<>();
        tsConsultationHours = new ArrayList<>();
    }

    /**
     * @return the workingHours
     */
    public String getWorkingHours() {
        return workingHours;
    }

    /**
     * @param workingHours the workingHours to set
     */
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

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
        this.tTappointments.parseTimeSlots(property);
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

//    public void populateWeek(String startEndHours) {
//        ArrayList<String> slots = new ArrayList<>();
//        int startHour;
//        int endHour;
//        String tempString;
//
//        startHour = Integer.parseInt(startEndHours.substring(0, 2));
//        endHour = Integer.parseInt(startEndHours.substring(5, 7));
//
//        System.out.println("startHour= " + startHour);
//        System.out.println("endHour= " + endHour);
//
//        Days days[] = Days.values();
//
//        for (Days day : days) {
//            if (day.equals(Days.SUN)) {
//                continue;
//            }
//            System.out.println("creating for " + day.name());
//            for (int j = startHour; j < endHour; j++) {
//                tempString = day.name() + String.format(" %02d00 %02d00", j, j + 1);
//                System.out.println(tempString);
//                slots.add(tempString);
//            }
//            for (String slot : slots) {
//                this.tTappointments.addTimeSlot(slot);
//            }
//        }
//    }
    public void setConsultationHours(String property) {
        String[] timeSlots = property.split(";");
        TimeSlot timeSlot;
//        TimeSlot
        for (String strTimeSlot : timeSlots) {
            timeSlot = new TimeSlot(tTappointments.getBaseTimeStamp(), strTimeSlot);
            this.tsConsultationHours.add(timeSlot);
        }

        // convert to time stamp
        // search slot
        // if found remove add two with flag set
        // sort timeSlots
        // if not found add two
    }

    public void setFreeTime() {
        TimeSlot tsTemp;
        Timestamp baseTimeStamp = tTappointments.getBaseTimeStamp();
        Days[] aDays;
        String strDay;
        String strInput;

        aDays = Days.values();

//        populate weeks
        for (int i = 0; i < 4; i++) {
            // populate days
            for (int j = 1; j < 7; j++) {
                strDay = aDays[j].toString();
                System.out.println("i: " + j);
                System.out.println("baseTimeStamp: " + baseTimeStamp);
                strInput = strDay + " " + workingHours;
                System.out.println("strInput: " + strInput);
                tsTemp = new TimeSlot(baseTimeStamp, strInput);
                tsFreeTime.add(tsTemp);
            }
            baseTimeStamp = tTappointments.incTimestampOneWeek(baseTimeStamp);
        }
        for (TimeSlot timeslot : tsConsultationHours) {
            tsFreeTime = tTappointments.removeSlot(tsFreeTime, timeslot);
        }
    }

    public ArrayList<String> getFreeTime() {
        ArrayList<String> timeInfo = new ArrayList<>();
        String formattedDate;
        String strTemp;

        timeInfo.add(this.fullName);
        timeInfo.add(this.room);
        timeInfo.add("MONTH DAY FROM TO");
        for (TimeSlot timeSlot : this.tsFreeTime) {
//            strTemp = timeSlot.getTimeStampStart().toString() + timeSlot.getTimeStampEnd().toString();
            System.out.println(timeSlot.getTimeStampStart().toString() + timeSlot.getTimeStampEnd().toString());
//            Date date = new Date();
//            date.setTime(timeSlot.getTimeStampStart().getTime());
            formattedDate = new SimpleDateFormat("EE ").format(timeSlot.getTimeStampStart().getTime());
            strTemp = new SimpleDateFormat("MM/dd").format(timeSlot.getTimeStampStart().getTime());
            formattedDate += strTemp;
            formattedDate += " FROM ";
            strTemp = new SimpleDateFormat("HH:mm").format(timeSlot.getTimeStampStart().getTime());
            formattedDate += strTemp + " TO ";
            strTemp = new SimpleDateFormat("HH:mm").format(timeSlot.getTimeStampEnd().getTime());
            formattedDate += strTemp;
//            timeInfo.add(strTemp);
            timeInfo.add(formattedDate);
        }
        return timeInfo;
    }

    public void updateFreeTime() {

    }

}
