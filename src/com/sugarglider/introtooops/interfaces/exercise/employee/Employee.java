package com.sugarglider.introtooops.interfaces.exercise.employee;

public class Employee implements Manager,Director{


    @Override
    public void submitReports() {
        Manager.super.submitReports();
    }

    @Override
    public void generateReports() {
        System.out.println("report generation started " );
    }

    public static void main(String[] args) {
        Manager manager = new Employee();
        manager.generateReports();

        new Employee().submitReports();

        Director director = new Employee();
        director.generateReports();
    }
}
