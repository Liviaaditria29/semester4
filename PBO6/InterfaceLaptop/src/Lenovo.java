/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Lenovo implements Laptop {
    
    private boolean is_power_on;
    private int volume;

    public Lenovo() {
        this.volume = 50;
    }

    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Lenovo ThinkPad");
    }

    public void powerOff() {
        if (is_power_on) {
            is_power_on = false;
            System.out.println("Shutdown is process...");
        }
    }

    public void volumeUp() {
        if (is_power_on) {
            if (this.volume < MAX_VOL) {
                this.volume += 10;
                System.out.println("Volume is " + this.getVolume());
            } else {
                System.out.println("Volume is Full ");
            }
        }
    }

    public void volumeDown() {
        if (is_power_on) {
            if (this.volume > MIN_VOL) {
                this.volume -= 10;
                System.out.println("Volume is " + this.getVolume());
            } else {
                System.out.println("Volume is 0% ");
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

