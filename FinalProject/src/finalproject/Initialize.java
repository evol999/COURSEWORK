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

    /**
     * @return the initOK
     */
    public boolean isOK() {
        return initOK;
    }

    /**
     * @param initOK the initOK to set
     */
    private void setInitOK(boolean initOK) {
        this.initOK = initOK;
    }

    /**
     * @return the prop
     */
    public Properties getProp() {
        return prop;
    }

    /**
     * @param prop the prop to set
     */
    private void setProp(Properties prop) {
        this.prop = prop;
    }
    private boolean initOK;
    private Properties prop;

    public Initialize() {
        prop = new Properties();
        boolean finalVal;
        
        finalVal = loadFile("config.properties");
        finalVal &= loadPhysicians();
        this.initOK = finalVal;
        
        System.out.println("Hello from Init");
    }
    private boolean loadFile(String fileName){
        boolean retVal = false;
        try (InputStream input = Initialize.class.getClassLoader().getResourceAsStream(fileName)) {
            if(null == input)
                System.out.println("Init file missing fatal error");
            else
                retVal = true;
            getProp().load(input);
        printProperties(getProp());
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return retVal;
    }
    
    private boolean loadPhysicians(){
        boolean retVal = false;
        
        return retVal;
    }
    public static void printProperties(Properties prop) {
        prop.keySet().stream().map(key -> key + ": " + prop.getProperty(key.toString())).forEach(System.out::println);
    }
            
}
