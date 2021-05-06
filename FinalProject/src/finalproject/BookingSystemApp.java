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
public class BookingSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Physician> physicians = new ArrayList<>();
        ArrayList<Expertise> tempExpertise = new ArrayList<>();
        ArrayList<String> treatments = new ArrayList<>();

        // TODO code application logic here
        Initialize init = new Initialize();
        if (!init.isOK()) {
            System.out.println("There was a problem during initialization");
        }
        physicians = init.getPhysicians();

        AppFlow uI = new AppFlow();
        uI.runFlow();
        switch (uI.getSelection()) {
            case BOOK_BY_PHY:
                uI.bookByPhysician(physicians);
            case EXIT:
            default:
                System.out.println("There was a problem during initialization");
        }

//        physicians = init.getPhysicians();
//        for (Physician test : physicians) {
//            System.out.println("Name: " + test.fullName);
//            tempExpertise = test.getExpertiseList();
//            for (Expertise lineline : tempExpertise) {
//                System.out.println("Speciality: " + lineline.getSpecialityName());
//                for (String treatment : lineline.getTreatments()) {
//                    System.out.println("Treatment: " + treatment);
//                }
//            }
//        }
    }
}
