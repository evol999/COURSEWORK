/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

/**
 *
 * @author evol9
 */
public class Initialize {

    public static void printProperties(Properties prop) {
        prop.keySet().stream().map(key -> key + ": " + prop.getProperty(key.toString())).forEach(System.out::println);
    }
    private boolean initOK;
    private Properties prop;
    private ArrayList<Physician> physicians;

    public Initialize() {
        prop = new Properties();
        boolean finalVal;
        physicians = new ArrayList<>();

        finalVal = loadFile("config.properties");
        finalVal &= loadPhysicians();
        setInitOK(finalVal);

        System.out.println("Hello from Init");
    }

    /**
     * @return the physicians
     */
    public ArrayList<Physician> getPhysicians() {
        return physicians;
    }

    /**
     * @param physicians the physicians to set
     */
    public void setPhysicians(ArrayList<Physician> physicians) {
        this.physicians = physicians;
    }

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

    private boolean loadFile(String fileName) {
        boolean retVal = false;
        try (InputStream input = Initialize.class.getClassLoader().getResourceAsStream(fileName)) {
            if (null == input) {
                System.out.println("Init file missing fatal error");
            } else {
                retVal = true;
            }
            getProp().load(input);
//            printProperties(getProp());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return retVal;
    }

    private boolean loadPhysicians() {
        boolean retVal = false;
        Physician tempPhysician = new Physician();
        int totalPhysicians = 0;
        String sIndex;
        String keyString;
        ArrayList<String> physicianKeyList = new ArrayList<>();
        for (Object key : getProp().keySet()) {
            if (key.toString().startsWith("physicians")) {
                physicianKeyList.add(key.toString());
                System.out.println("Added: " + key);
            }
        }
//        every physician has 6 properties
        totalPhysicians = physicianKeyList.size() / 6;

        for (int i = 0; i < totalPhysicians; i++) {
            sIndex = String.format(".%02d.", i + 1);
            keyString = "physicians" + sIndex;
            System.out.println(keyString);
            tempPhysician.setIdNumber(Integer.parseInt(prop.getProperty(keyString + "id")));
            tempPhysician.setFullName(prop.getProperty(keyString + "name"));
            tempPhysician.setAddress(prop.getProperty(keyString + "address"));
            tempPhysician.setPhoneNumber(prop.getProperty(keyString + "phonenumber"));

//            tempPhysician.setAddress();
        }

        Collections.sort(physicianKeyList);
        System.out.println(physicianKeyList);

//        enum keys = this.prop.keys();
        retVal = true;

        return retVal;
    }

}
