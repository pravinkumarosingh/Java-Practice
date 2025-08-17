package com.sugarglider.introtooops.interfaces.exercise.employee;

public interface Manager {

    default void submitReports(){
        System.out.println("report submission started for manager");
    }

    void generateReports();

}
