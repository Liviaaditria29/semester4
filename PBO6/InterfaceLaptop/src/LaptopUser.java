/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class LaptopUser {

    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    void turnOnLaptop() {
        this.laptop.powerOn();
    }

    void turnOffLaptop() {
        this.laptop.powerOff();
    }

    void makeLaptopLouder() {
        this.laptop.volumeUp();
    }

    void makeLaptopSilent() {
        this.laptop.volumeDown();
    }
}

