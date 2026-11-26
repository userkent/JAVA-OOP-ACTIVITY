package AsyncACT16;

import AsyncACT16.AbsChild;

// Main class of the program
public class AsyncACT {

    // Main method where the program starts
    public static void main(String[] args) {

        // Creates an object of AbsChild
        AbsChild myDog = new AbsChild();

        // Calls the sound method
        myDog.sound();

        // Calls the inherited sleep method
        myDog.sleep();
    }
}

