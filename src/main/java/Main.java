import data.Team;
import data.car.Car;
import data.car.CarParts;
import data.employees.*;
import service.SimulateSeason;

public class Main {
    public static void main(String[] args){

        SimulateSeason simulateSeason = new SimulateSeason();
        Team team = new Team();
        Car car1 = new Car();
        Car car2 = new Car();
        Driver driver1 = new Driver("Alonso",40, ExperienceLevel.EXPERT);
        Driver driver2 = new Driver("Riciardo", 30, ExperienceLevel.MEDIUM);
        Driver driver3 = new Driver("Mick", 20, ExperienceLevel.BEGINNER);
        PitCrewMember pitCrewMember1 = new PitCrewMember("Emad",37 , ExperienceLevel.RANDOM);
        PitCrewMember pitCrewMember2 = new PitCrewMember("El",36 , ExperienceLevel.RANDOM);
        PitCrewMember pitCrewMember3 = new PitCrewMember("Markus",26 , ExperienceLevel.RANDOM);
        PitCrewMember pitCrewMember4 = new PitCrewMember("Martin",35 , ExperienceLevel.RANDOM);
        Engineers engineers1 = new Engineers("Noah",20,ExperienceLevel.RANDOM);
        Engineers engineers2 = new Engineers("Mark",29,ExperienceLevel.RANDOM);
        car1.setCarParts(CarParts.ENGINE);
        car1.setCarParts(CarParts.TIRES);
        car2.setCarParts(CarParts.ENGINE);
        car2.setCarParts(CarParts.TIRES);
        team.addCar(car1);
        team.addCar(car2);
        team.addEmployee(driver1,driver2,driver3,pitCrewMember1,pitCrewMember2,pitCrewMember3,pitCrewMember4,engineers1,engineers2);
        simulateSeason.calculateProfit();


    }
}
