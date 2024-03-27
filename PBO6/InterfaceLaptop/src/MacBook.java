/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MacBook implements Laptop {
    private boolean is_power_on;
    private int volume;

    public MacBook() {
        this.volume = 50;
    }

    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("MacBook Pro");
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
                System.out.println("Volume is " + this.volume);
            } else {
                System.out.println("Volume is Full ");
            }
        }
    }

    public void volumeDown() {
        if (is_power_on) {
            if (this.volume > MIN_VOL) {
                this.volume -= 10;
                System.out.println("Volume is " + this.volume);
            } else {
                System.out.println("Volume is 0% ");
            }
        }
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOL && volume <= MAX_VOL) {
            this.volume = volume;
            System.out.println("Volume is set to " + this.volume);
        } else {
            System.out.println("Invalid volume level. Please enter a value between 0 and 100.");
        }
    }
}
