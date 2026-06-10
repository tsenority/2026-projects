package org.example.studentrestapi.model;

public class Student {
    private int id;
    private String name;
    private String course;

    //We need both the constructor and getter and setter methods in most spring projects.
    //Constructor to set all the properties of object in one line But cant change the value later.
    //Getter and Setter to change the value of objects later. Flexibility.

    public Student() { //Need both the constructors: without and without parameters
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
