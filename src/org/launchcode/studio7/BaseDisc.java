
package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {

    //class variables
    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;
    private final int storageCapacityInMB; //final since capacity will never change, so no setter needed
    private final int spinSpeedInRPM; //final since speed will never change, so no setter needed

    // constructor setting initial disc to blank, creating discInfo HashMap, and sets isInserted to false
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;
        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;
        this.discInfo.put("Storage capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin speed", String.valueOf(spinSpeed));
    }

    // overloaded constructor to take in titlee
    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }

    //getters & setters
    public boolean isInserted() { return this.isInserted; }
    public int getStorageCapacity() { return this.storageCapacityInMB; }

    public int getSpinSpeed() { return this.spinSpeedInRPM; }


    //methods
    protected void writeData(String data){ //made protected so children can access
        this.discData += data;
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }

    public void insert() {
        this.isInserted = true;
    }



}











