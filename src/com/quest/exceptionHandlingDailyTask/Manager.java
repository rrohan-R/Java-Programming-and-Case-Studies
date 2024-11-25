package com.quest.exceptionHandlingDailyTask;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, double salary, int teamSize) throws IllegalArgumentException, InvalidInputException {
        super(name, age, salary);
        validateTeamSize(teamSize);
        this.teamSize = teamSize;
        }

    private static void validateTeamSize(int teamSize) {
        if (teamSize < 1) {
            throw new IllegalArgumentException("Team size must be greater than 0");
        }
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize)throws IllegalArgumentException {
        validateTeamSize(teamSize);
            this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }




}
