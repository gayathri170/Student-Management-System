package com.studentmanagement;

public class Student extends Person {

    private String department;

    public Student(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "ID: " + id +
                        ", Name: " + name +
                        ", Department: " + department
        );
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
