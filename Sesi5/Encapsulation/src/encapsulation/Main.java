/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukkan data mahasiswa
        System.out.println("Masukkan nama mahasiswa: ");
        String name = scanner.nextLine();

        System.out.println("Masukkan alamat mahasiswa: ");
        String address = scanner.nextLine();

        // Buat objek Student dengan nama dan alamat yang diperlukan
        Student student1 = new Student(name, address);

        // Masukkan jumlah mata kuliah yang diambil
        System.out.println("Masukkan jumlah mata kuliah yang diambil " + student1.getName() + ": ");
        int numCourses = scanner.nextInt();

        // Masukkan data mata kuliah dan nilai
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            String course = scanner.next();
            System.out.println("Masukkan nilai mata kuliah " + course + ": ");
            int grade = scanner.nextInt();
            student1.addCourse(course);
            student1.addCourseGrade(course, grade);
        }

        // Masukkan data dosen
        System.out.println("Masukkan nama dosen: ");
        scanner.nextLine(); // membersihkan buffer
        name = scanner.nextLine();

        System.out.println("Masukkan alamat dosen: ");
        address = scanner.nextLine();

        // Buat objek Teacher dengan nama dan alamat yang diperlukan
        Teacher teacher1 = new Teacher(name, address);

        // Masukkan jumlah mata kuliah yang diampu
        System.out.println("Masukkan jumlah mata kuliah yang diampu " + teacher1.getName() + ": ");
        numCourses = scanner.nextInt();

        // Masukkan data mata kuliah yang diampu
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            String course = scanner.next();
            teacher1.addCourse(course);
        }

        // Cetak informasi student dan dosen
        System.out.println(student1);
        System.out.println(teacher1);

        // Cetak nilai student
        student1.printGrades();
    }
}