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
public class BookingSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Initialize init = new Initialize();
        if(!init.initOK)
  //       showMenu();
        System.out.println("There was a problem during initialization");
        
    }
    
}
