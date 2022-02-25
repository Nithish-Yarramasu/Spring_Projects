package com.starterproj.DependencyStarterXML;
/*Bean A*/
public class Person {

    private String name;
    private int age;
    private  Car drives;

    public Person() {
    }

    public Car getDrives() {
        return drives;
    }

    public void setDrives(Car drives) {
        this.drives = drives;
    }

    public String isDriving(){
        return this.drives.getName();
    }

    public String getName() {
        return name;
    }

    public Car likesCar(){
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void getDefaultName(){
        System.out.println("This is the default Name ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int Id;

}
