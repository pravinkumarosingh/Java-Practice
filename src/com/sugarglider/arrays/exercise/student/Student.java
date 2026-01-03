package com.sugarglider.arrays.exercise.student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
    Student(String name, int... listOfMarks){
        this.name = name;
        for(int mark:listOfMarks) {
            this.listOfMarks.add(mark);
        }
    }

    public String getName(){
        return name;
    }

    public int getNumberOfMarks(){
        return listOfMarks.size();
    }

    public ArrayList<Integer> getMarks(){
        return listOfMarks;
    }

    public BigDecimal getAverageOfMarks(){
        int sum=0;
        for (int mark:listOfMarks){
            sum+=mark;
        }


        return new BigDecimal(sum).divide(new BigDecimal(listOfMarks.size()),3, RoundingMode.UP);
    }

    public void addNewMark(int mark){
        listOfMarks.add(mark);
    }

    public void removeMark(int index){
         listOfMarks.remove(index);
    }

    public int getMaximumMark(){
        listOfMarks.sort(Comparator.naturalOrder());
        return listOfMarks.get(listOfMarks.size()-1);
    }

    public int getMinimumMark(){

        return listOfMarks.get(0);

    }

}
