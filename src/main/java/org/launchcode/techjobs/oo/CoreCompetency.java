package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    //First Part of Graded Assignment; Before Refactoring with Abstract Class JobField
//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }
//
//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }

    //Refactoring for using Abstract Class JobField
    public CoreCompetency() {
      super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods-- Prior to refactoring for Abstract Class JobField

//    @Override
//    public String toString() {
//        return value;
//    }

    //Must leave the equals method within the specific class as it is dependent upon checking the class type before
    // casting the object "o" to type CoreCompetency
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }


    //First part of graded assignment prior to refactoring
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

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

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

}
