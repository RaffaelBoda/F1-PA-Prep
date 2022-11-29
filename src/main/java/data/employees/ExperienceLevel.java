package data.employees;

public enum ExperienceLevel {
    BEGINNER(20_000),
    MEDIUM(40_000),
    EXPERT(100_000),
    RANDOM(1000);

    private double salary;

    ExperienceLevel(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
