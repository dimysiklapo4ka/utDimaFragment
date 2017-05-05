package ua.init.team.fragments.models;

/**
 * Created by dev on 05.05.17.
 */

public class Student {

    private int id;

    private String name;

    private String age;

    private String skils;


    public Student( String name, String age, String skils) {
        this.name = name;
        this.age = age;
        this.skils = skils;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSkils() {
        return skils;
    }

    public void setSkils(String skils) {
        this.skils = skils;
    }
}
