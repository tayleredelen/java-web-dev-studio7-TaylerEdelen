package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    //implement the overloaded constructor of BaseDiscc
    public DVD(String title) {
        super(4, 1600, title); //set storageCapacity and spinSpeed since DVDs are usually same
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getSpinSpeed() + " rpm.");
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