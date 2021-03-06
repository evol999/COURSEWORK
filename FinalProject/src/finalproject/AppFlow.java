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
class AppFlow {

    /**
     * @return the selection
     */
    public Processes getSelection() {
        return selection;
    }

    /**
     * @param selection the selection to set
     */
    public void setSelection(Processes selection) {
        this.selection = selection;
    }

    private Processes selection;

    void runFlow() {
        UserInput menuUser = new UserInput();
        menuUser.setText("Are you a Visitor or a Patient?");
        menuUser.setOption("Patient");  //  1.
        menuUser.setOption("Visitor");  //  2.
        menuUser.setOption("Administrator");  //  3.
        menuUser.setOption("Exit");  //  4.
        menuUser.run();
        if (1 == menuUser.getSelection()) {
            processUser();
        }
        if (2 == menuUser.getSelection()) {
            processVisitor();
        }
        if (3 == menuUser.getSelection()) {
            processAdmin();
        }
    }

    private void processVisitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processUser() {
        UserInput menuUser = new UserInput();
        menuUser.setText("Are you registered?");
        menuUser.setOption("Yes");  //  1.
        menuUser.setOption("No");  //  2.
        menuUser.run();
        if (1 == menuUser.getSelection()) {
            bookAppointmentUser();
        }
        if (2 == menuUser.getSelection()) {
            registerUser();
        }
    }

    private void bookAppointmentUser() {
        // Enter ID
        //
        String name = "Beto", greeting;

        greeting = "Hello Mr. " + name + " what would you like to do?";
        UserInput menuUser = new UserInput();
        menuUser.setText(greeting);
        menuUser.setOption("Book appointment by area of expertise");  //  1.
        menuUser.setOption("Book appointment by physician");  //  2.
        menuUser.setOption("Cancel appointment");  //  3.
        menuUser.setOption("Attend appointment");  //  4.
        menuUser.setOption("Report missing appointment");  //  4.
        menuUser.run();
        if (1 == menuUser.getSelection()) {
            bookByArea();
        }
        if (2 == menuUser.getSelection()) {
            bookByPhysician();
        }

    }

    private void registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bookByArea() {
        Menu menuUser = new Menu();
        ArrayList<String> Areas = new ArrayList<>();

        menuUser.setText("");
        menuUser.setOption("Yes");  //  1.
        menuUser.setOption("No");  //  2.
        menuUser.run();
    }

    private void bookByPhysician() {
        setSelection(Processes.BOOK_BY_PHY);
    }

    private void processAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Processes {
        EXIT,
        BOOK_BY_PHY
    }

}
