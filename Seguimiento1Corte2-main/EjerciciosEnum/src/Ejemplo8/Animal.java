package Ejemplo8;

public class Animal {
    private String name;
    private int age;
    private String feedingType;

    public Animal(String name, int age, String feedingType) {
        this.name = name;
        this.age = age;
        this.feedingType = feedingType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFeedingType() {
        return feedingType;
    }
}
