/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Exception5 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}

//Blok try digunakan untuk membungkus kode yang mungkin menimbulkan exception, dalam hal ini, pembagian oleh nol.
//Blok catch digunakan untuk menangkap dan menangani exception yang dilempar oleh blok try. Dalam program ini, terdapat dua blok catch, yang pertama menangkap ArithmeticException dan yang kedua menangkap Exception 
