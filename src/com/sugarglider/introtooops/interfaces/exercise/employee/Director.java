package com.sugarglider.introtooops.interfaces.exercise.employee;

public interface Director {

    default void submitReports(){
        System.out.println("report submission started for director");
    }

    void generateReports();

}
