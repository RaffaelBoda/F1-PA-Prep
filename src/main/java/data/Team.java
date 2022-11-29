package data;

import data.car.Car;
import data.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Car> listOfCars;
    private List<Employee> listOfEmployees;

    public Team() {
        listOfEmployees = new ArrayList<>();
        listOfCars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return listOfCars;
    }

    public void setCars(List<Car> cars) {
        this.listOfCars = cars;
    }

    public void addCars(Car... cars) {
        for (Car car : cars) {
            addCar(car);
        }
    }

    public void addCar(Car car) {
        this.listOfCars.add(car);
    }

    public void addEmployee(Employee employee) {
        this.listOfEmployees.add(employee);
    }

    public void addEmployee(Employee... employees) {
        for (Employee employee : employees) {
            addEmployee(employee);
        }
    }

    public List<Employee> getEmployees() {
        return listOfEmployees;
    }

    public void setEmployees(List<Employee> employees) {
        this.listOfEmployees = employees;
    }
}
