package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

   // private int id;
     //   private static int nextId = 1;
   // private String value;

    //constructor 1 no arguments, assigns the value of nextId to the id field. It then increments nextId. Thus, every new Employer object will get a different ID number
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }

    //constructor 2 which calls constructor 1 to make sure the ID gets set and also sets the value
//    public Employer(String value) {
//        this();
//        this.value = value;
//    }


    public Employer(String value) {
        super(value);
    }


    // Custom toString, equals, and hashCode methods:

    //custom toString() that'll return the value as a string instead of a location in memory
//    @Override
//    public String toString() {
//        return value;
//    }

    // equals makes sure it's tested on the basis of its ID
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

    // hashCode used to return unique integer value
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters: Only getter for ID, but both for value

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
