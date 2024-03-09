/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grade;

/**
 *
 * @author Lenovo
 */



public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;

    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public String getGrade() {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
