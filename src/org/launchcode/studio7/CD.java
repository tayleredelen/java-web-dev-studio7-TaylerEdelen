package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    //implement the typical constructor of BaseDiscc
    public CD() {
        super(700, 500); //set directly since most CDs are the same
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.getSpinSpeed() + " rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if(this.readData().length() >= this.getStorageCapacity()) return true;
        else return false;
    }


    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
