package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Job job = (Job) o;
//        return id == job.id;
//    }


    @Override
    public String toString() {
        String output;
        output = "\n" +
                "ID: " + this.id +"\n" +
                "Name: ";

        if (this.name == ""){
            output += "Data not available" + "\n";
        } else{
            output += this.name + "\n";
        }

        output += "Employer: ";

        if (this.employer.getValue() == ""){
            output += "Data not available" + "\n";
        } else{
            output += this.employer.getValue() + "\n";
        }

        output += "Location: ";

        if (this.location.getValue() == ""){
            output += "Data not available" + "\n";
        } else{
            output += this.location.getValue() + "\n";
        }

        output += "Position Type: ";

        if (this.positionType.getValue() == ""){
            output += "Data not available" + "\n";
        } else{
            output += this.positionType.getValue() + "\n";
        }

        output += "Core Competency: ";

        if (this.coreCompetency.getValue() == ""){
            output += "Data not available" + "\n";
        } else{
            output += this.coreCompetency.getValue() + "\n";
        }

        return output;

//        return "\n" +
//                "ID: " + this.id +"\n" +
//                "Name: " + this.name + "\n" +
//                "Employer: " + this.employer.getValue() + "\n" +
//                "Location: " + this.location.getValue() + "\n" +
//                "Position Type: " + this.positionType.getValue() + "\n" +
//                "Core Competency: " + this.coreCompetency.getValue() + "\n";
//        return "Job{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employer=" + employer +
//                ", location=" + location +
//                ", positionType=" + positionType +
//                ", coreCompetency=" + coreCompetency +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
