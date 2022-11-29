package data.employees;

public abstract class Employee {
    private String name;
    private int age;
    private ExperienceLevel experienceLevel;


    public Employee(String name, int age, ExperienceLevel experienceLevel) {
        this.name = name;
        this.age = age;
        this.experienceLevel = experienceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
