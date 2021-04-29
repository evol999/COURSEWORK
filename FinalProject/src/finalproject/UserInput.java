/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author evol9
 */
class UserInput {

    void loop() {
        Menu menuUser = new Menu();
        menuUser.setText("Are you a Visitor or a Patient?");
        menuUser.setOption("Patient");  //  1.
        menuUser.setOption("Visitor");  //  2.
        menuUser.run();
        if (1 == menuUser.getSelection()) {
            processUser();
        }
        if (2 == menuUser.getSelection()) {
            processVisitor();
        }
    }

    private void processVisitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processUser() {
        Menu menuUser = new Menu();
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
        Menu menuUser = new Menu();
        menuUser.setText(greeting);
        menuUser.setOption("Book appointment by area of expertise");  //  1.
        menuUser.setOption("Book appointment by physician");  //  2.
        menuUser.run();
    }

    private void registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
