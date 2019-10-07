package main.java.lesson2;

public class Task1 {
    private String name;
    private int age;
    private String ageGroup;


    public Task1(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setAgeGroup(this.getAge());
    }

    private String getName() {
        if (name == null) {
            return " not defined";
        }
            return name;
    }

    private int getAge() {
        return age;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    private void setName(String name) {
        int namelength = name.length();
        if (name.trim().equals("") || (namelength < 3 || namelength > 50)) {
            System.out.println("Name: \"" + name + "\" can't be this");
            return;
        }
        String capitalname = name.substring(0, 1).toUpperCase() + name.substring(1);

        this.name = capitalname;
        return;

    }

    private void setAge(int age) {
        if (age < 1) {
            System.out.println("This age: \"" + age + "\" should be more than 0");
        } else if (age > 100) {
            System.out.println("This age: \"" + age + "\" should be less than 100");
        } else {
            this.age = age;
        }
    }

    private String setAgeGroup(int age) {
        if (age < 15) {
            this.ageGroup = "child";
        } else if (age < 26) {
            this.ageGroup = "student";
        } else if (age < 65) {
            this.ageGroup = "worker";
        } else {
            this.ageGroup = "pensioner";
        }
        return ageGroup;
    }


    void print() {
        System.out.println();
        System.out.println("Name is: " + getName());
        System.out.println("Age is: " + getAge());
        System.out.println("AgeGroup is: " + getAgeGroup());
    }
}