/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.InputStream;

/**
 *
 * @author evol9
 */
public class Initialize {
    boolean initOK;

    public Initialize() {
        this.initOK = false;
        this.initOK = loadFile("config.ini");
        System.out.println("Hello from Init");
    }
    private boolean loadFile(String fileName){
        boolean retVal = false;
        InputStream input = this.getClass().getResourceAsStream(fileName);
        if(null == input)
            System.out.println("Init file missing fatal error");
        else
            retVal = true;
        return retVal;
    }
            
}
