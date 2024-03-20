/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Teacher extends Person {
    private List<String> courses;

    public Teacher(String name, String address) {
        super(name, address); // Memanggil constructor Person
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + " (" + getAddress() + ")";
    }
}