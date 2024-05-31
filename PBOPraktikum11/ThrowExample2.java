/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ThrowExample2 {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Exception");
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}

//Blok try digunakan untuk membungkus kode yang mungkin menimbulkan exception.
//Blok catch menangani exception yang dilempar dalam blok try, memungkinkan program untuk terus berjalan tanpa crash.
//esan yang diberikan oleh e.getMessage(), e.toString(), dan e.printStackTrace() memberikan informasi detail tentang exception, yang sangat berguna untuk penanganan kesalahan.

