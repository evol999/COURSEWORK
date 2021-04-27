/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author evol9
 */
public class Initialize {
    boolean initOK;

    public Initialize() {
        this.initOK = false;
        this.initOK = loadFile("config.properties");
        System.out.println("Hello from Init");
    }
    private boolean loadFile(String fileName){
        boolean retVal = false;
        Properties prop = new Properties();
        try (InputStream input = Initialize.class.getClassLoader().getResourceAsStream(fileName)) {
            if(null == input)
                System.out.println("Init file missing fatal error");
            else
                retVal = true;
        prop.load(input);
        printProperties(prop);
        } catch (IOException ex){
            ex.printStackTrace();
        }

        

        
        return retVal;
    }
    public static void printProperties(Properties prop) {
        prop.keySet().stream().map(key -> key + ": " + prop.getProperty(key.toString())).forEach(System.out::println);
    }
            
}
