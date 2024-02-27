/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesi2;

/**
 *
 * @author Lenovo
 */
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP() {
        return jenis_hp;
    }
    
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2022); // contoh jenis HP dan tahun pembuatan
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}