/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author Lenovo
 */
    public class objekMobil {
        public static void main(String[] args) {
            MobilDiesel md = new MobilDiesel("Toyota", 300, 0, "Solar");
            MobilBensin mb = new MobilBensin("Avanza", 200, 0, "Pertamax");

            md.infoMobilDiesel();
            mb.infoMobilBensin();
    }
}