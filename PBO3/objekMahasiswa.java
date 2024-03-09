/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grade;

/**
 *
 * @author Lenovo
 */


import java.util.List;
import java.util.Scanner;

public class objekMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mendapatkan data mahasiswa dari input
        List<Mahasiswa> mahasiswas = MahasiswaGrade.inputMahasiswa(scanner);

        // Menampilkan informasi mahasiswa
        MahasiswaGrade.infoMahasiswa(mahasiswas);
    }
}
