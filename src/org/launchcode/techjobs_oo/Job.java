package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    @Override
    public String toString(){
        String format = "ID: " + getId() + "\n";
        if (getName() != null || getName() != "") {
            format += "Name: " + getName() + "\n";
        }
        else{
            format += "Name: Data not available\n";
        }
        if (getEmployer().getValue() != null && getEmployer().getValue() != "") {
            format += "Employer: " + getEmployer().getValue() + "\n";
        }
        else{
            format += "Employer: Data not available\n";
        }
        if (getLocation().getValue() != null && getLocation().getValue() != "") {
            format += "Location: " + getLocation().getValue() + "\n";
        }
        else{
            format += "Location: Data not available\n";
        }
        if(getPositionType().getValue() != null && getPositionType().getValue() != "") {
            format += "Position Type: " + getPositionType().getValue() + "\n";
        }
        else {
            format += "PositionType: Data not available\n";
        }
        if (getCoreCompetency().getValue() != null && getCoreCompetency().getValue() != "") {
            format += "Core Competency: " + getCoreCompetency().getValue();
        }
        else{
            format += "Core Competency: Data not available";
        }

        return format;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
