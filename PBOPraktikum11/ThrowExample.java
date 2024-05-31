/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ThrowExample {
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;// Baris ini tidak lagi dikerjakan;
        //System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
        try
        {
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: "+e);
        }
    }
}

//Blok try digunakan untuk membungkus kode yang mungkin menimbulkan NullPointerException, dalam hal ini, pemanggilan metode demo().
//Blok catch menangkap NullPointerException yang dilempar oleh metode demo(). Ini memungkinkan program untuk menangani exception dan melanjutkan eksekusi dengan cara yang terkontrol.