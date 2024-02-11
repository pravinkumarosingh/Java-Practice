package com.sugarglider.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Team <T>{
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins=0;
    private int totalLoses=0;
    private int totalTies=0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMembers(T teamMember){
        if(!teamMembers.contains(teamMember)){
            teamMembers.add(teamMember);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLoses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";

        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore){
            totalTies++;
            message = "tied";
        } else {
            totalLoses++;
        }

        return message;
    }

    @Override
    public  String toString(){
        return teamName + "  (Ranked " + ranking() + ")";
    }
}
