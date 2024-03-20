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
public class Student extends Person {
    private List<String> courses;
    private List<Integer> grades;

    public Student(String name, String address) {
        super(name, address); // Memanggil constructor Person
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public double getAverageGrade() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void printGrades() {
    System.out.println("Nilai " + getName() + ":");
    for (int i = 0; i < courses.size() && i < grades.size(); i++) {
        System.out.println(courses.get(i) + ": " + grades.get(i));
    }
}



    @Override
    public String toString() {
        return "Student: " + getName() + " (" + getAddress() + ") (" + getAverageGrade() + ")";
    }
}
