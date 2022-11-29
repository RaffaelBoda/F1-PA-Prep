package service;

import data.Team;
import data.car.Car;
import data.car.CarParts;
import data.employees.Employee;
import data.employees.ExperienceLevel;

public class SimulateSeason {

    private Team team;

    public double calculatePartCost(){
        double partsCost;

        CarParts tires = CarParts.TIRES;
        CarParts engine = CarParts.ENGINE;

        partsCost = (tires.getPartCost() + engine.getPartCost()) * 22 ;

        return partsCost;
    }

    public double calculateEmployeeCost(){
        double employeeCost;
        ExperienceLevel experienceLevelBeginner = ExperienceLevel.BEGINNER;
        ExperienceLevel experienceLevelMedium = ExperienceLevel.MEDIUM;
        ExperienceLevel experienceLevelExpert = ExperienceLevel.EXPERT;
        ExperienceLevel experienceLevelRandom = ExperienceLevel.RANDOM;

        employeeCost = ((experienceLevelBeginner.getSalary() + experienceLevelMedium.getSalary() + experienceLevelExpert.getSalary())
                + (experienceLevelRandom.getSalary()*6) ) * 22;

        return employeeCost;
    }

    public double calculateProfit(){
        double profit;
        double cost;
        double raceMoney = 25_000_000;
        double employeeCost = calculateEmployeeCost();
        double carPartCost = calculatePartCost();

        cost = employeeCost + carPartCost;
        profit = raceMoney - cost;
        System.out.println("Employee cost = " + employeeCost);
        System.out.println("Parts cost = " + carPartCost);
        System.out.println("Profit = " + profit);
        return profit;
    }
}
