import data.Team;
import data.car.Car;
import data.car.CarParts;
import data.employees.*;
import service.SimulateSeason;

public class Main {
    public static void main(String[] args){
        Employee[] employees = new Employee[]{
                new Driver("Alonso",40, ExperienceLevel.EXPERT),
                new Driver("Riciardo", 30, ExperienceLevel.MEDIUM),
                new Driver("Mick", 20, ExperienceLevel.BEGINNER),
                new PitCrewMember("Emad",37 , ExperienceLevel.RANDOM),
                new PitCrewMember("El",36 , ExperienceLevel.RANDOM),
                new PitCrewMember("Markus",26 , ExperienceLevel.RANDOM),
                new PitCrewMember("Martin",35 , ExperienceLevel.RANDOM),
                new Engineers("Noah",20,ExperienceLevel.RANDOM),
                new Engineers("Mark",29,ExperienceLevel.RANDOM)
        };
        Car[] cars = new Car[]{
          new Car(CarParts.ENGINE, CarParts.TIRES),      
          new Car(CarParts.ENGINE, CarParts.TIRES)      
        };
        Team team = new Team();
        team.addEmployee(employees);
        team.addCars(cars);
        SimulateSeason simulateSeason = new SimulateSeason();
        simulateSeason.calculateProfit(25_000_000, team, 22);
    }
}
