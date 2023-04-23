package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    //First Part of Graded Assignment; Before Refactoring with Abstract Class JobField
//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Location(String aValue){
//        this();
//        this.value = aValue;
//    }


    //Refactoring for using Abstract Class JobField
    public Location() {
      super();
    }

    public Location(String aValue){
        super(aValue);
    }
    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.


    // Custom toString, equals, and hashCode methods -- Prior to refactoring for Abstract Class JobField

//    @Override
//    public String toString() {
//        return value;
//    }

    //Must leave the equals method within the specific class as it is dependent upon checking the class type before
    // casting the object "o" to type Location
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
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
