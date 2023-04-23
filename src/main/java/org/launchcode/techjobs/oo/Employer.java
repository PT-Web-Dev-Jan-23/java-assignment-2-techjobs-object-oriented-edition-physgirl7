package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {


    //First Part of Graded Assignment; Before Refactoring with Abstract Class JobField
//    private int id;
//    private static int nextId = 1;
//    private String value;


//    public Employer() {
//        id = nextId;
//        nextId++;
//     }


//    public Employer(String value) {
//        this();
//        this.value = value;
//    }


    //Refactoring for using Abstract Class JobField
    public Employer() {
       super();
    }

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods -- Prior to refactoring for Abstract Class JobField

//    @Override
//    public String toString() {
//        return value;
//    }

    //Must leave the equals method within the specific class as it is dependent upon checking the class type before
    // casting the object "o" to type Employer
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }


    //First part of graded assignment prior to refactoring
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:

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
