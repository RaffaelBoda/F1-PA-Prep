package service;

import data.Team;
import data.car.Car;
import data.car.CarParts;
import data.employees.Employee;
import data.employees.ExperienceLevel;

import java.util.List;

public class SimulateSeason {

    public double calculatePartCost(Team team, int numberOfRaces) {
        return team.getCars().stream()
                .map(Car::getCarParts)
                .flatMap(List::stream)
                .mapToDouble(CarParts::getPartCost)
                .sum() * numberOfRaces;
    }

    public double calculateEmployeeCost(Team team, int numberOfRaces) {
        return team.getEmployees().stream()
                .map(Employee::getExperienceLevel)
                .mapToDouble(ExperienceLevel::getSalary)
                .sum() * numberOfRaces;
    }

    public double calculateProfit(int earnings, Team team, int numberOfRaces) {
        double employeeCost = calculateEmployeeCost(team, numberOfRaces);
        double carPartCost = calculatePartCost(team, numberOfRaces);
        double cost = employeeCost + carPartCost;
        double profit = earnings - cost;
        System.out.println("Employee cost = " + String.format("%.2f", employeeCost));
        System.out.println("Parts cost = " + String.format("%.2f", carPartCost));
        System.out.println("Profit = " + String.format("%.2f", profit));
        return profit;
    }
}
