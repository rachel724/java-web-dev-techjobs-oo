package org.launchcode.techjobs_oo;

public class JobField {
    private int id;
    private static int nextId = 1;

    public JobField() {
        id = nextId;
        nextId++;
    }
}
