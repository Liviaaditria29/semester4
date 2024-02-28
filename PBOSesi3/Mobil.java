/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public class Mobil {
    protected String merk;
    protected int harga, kecepatan;

    /**
     * konstruktor
     * Method yang namanya = class
     * Tidak boleh menggunakan void
     * Tidak boleh ada return value
     * Digunakan hanya 1x
     * Digunakan untuk inisialisasi
     */
    Mobil(String merk, int harga, int kecepatan){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    
    void setMerk (String brand) {
        this.merk = brand;
    }

    void setHargaKecepatan(int harga, int kecepatan) {
        this.harga = harga;
        this.kecepatan = kecepatan;
    }

    String getMerk() {
        return merk;
    }

    int getHarga() {
        return harga;
    }

    int getKecepatan() {
        return kecepatan ;
    }
    
    void infoMobil() {
        System.out.println("Merk Mobil:" + getMerk());
        System.out.println("Harga:" + getHarga());
        System.out.println("Kecepatan:" + getKecepatan());
        
    }
}
