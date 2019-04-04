package com.emeraldhieu.simpleobserver;

public class Driver {

    public static void main(String[] args) {
        AsyncTask task = new AsyncTask();
        task.addOnCompleteListener(() -> System.out.println("Toggling button..."));
        task.execute();
    }
}
