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

    public Job() {
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

    @Override
    public String toString() {
        String errorMessage = "Data not available";
        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + (name != null?name:errorMessage)+ "\n" +
                "Employer: " + (employer!= null?employer:errorMessage) + "\n" +
                "Location: " + (location!= null?location:errorMessage) + "\n" +
                "Position Type: " + (positionType!= null?positionType:errorMessage) + "\n" +
                "Core Competency: " + (coreCompetency!= null?coreCompetency:errorMessage) +
                '\n';
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
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

    public Employer getEmployer() {return employer; }

    public void setEmployer(Employer employer) {this.employer = employer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }
}
