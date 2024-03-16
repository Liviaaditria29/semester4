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

class BangunRuang {
    //Volume Kubus
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    //Volume Balok
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
}

public class VolumeBangunRuang {
    public static void main(String[] args) {
        BangunRuang bangun = new BangunRuang();

        // Menghitung volume kubus
        double volumeKubus = bangun.hitungVolume(5.0);
        System.out.println("Volume kubus: " + volumeKubus);

        // Menghitung volume balok
        double volumeBalok = bangun.hitungVolume(3.0, 4.0, 5.0);
        System.out.println("Volume balok: " + volumeBalok);
    }
}

