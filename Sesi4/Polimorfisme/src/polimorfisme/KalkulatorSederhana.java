/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Lenovo
 */

//OVERLOADING

class KalkulatorSederhana {
    // Overloading method tambah
    public int tambah(int a, int b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading method kurang
    public int kurang(int a, int b) {
        return a - b;
    }

    public int kurang(int a, int b, int c) {
        return a - b - c;
    }

    // Overloading method kali
    public int kali(int a, int b) {
        return a * b;
    }

    public int kali(int a, int b, int c) {
        return a * b * c;
    }

    // Overloading method bagi
    public int bagi(int a, int b) {
        return a / b;
    }

    public int bagi(int a, int b, int c) {
        return a / b / c;
    }

    public static void main(String[] args) {
        KalkulatorSederhana kalkulator = new KalkulatorSederhana();

        System.out.println("Tambah: " + kalkulator.tambah(2, 3));
        System.out.println("Tambah: " + kalkulator.tambah(2, 3, 4));

        System.out.println("Kurang: " + kalkulator.kurang(5, 3));
        System.out.println("Kurang: " + kalkulator.kurang(5, 3, 4));

        System.out.println("Kali: " + kalkulator.kali(2, 3));
        System.out.println("Kali: " + kalkulator.kali(2, 3, 4));

        System.out.println("Bagi: " + kalkulator.bagi(10, 2));
        System.out.println("Bagi: " + kalkulator.bagi(10, 2, 5));
    }
}
