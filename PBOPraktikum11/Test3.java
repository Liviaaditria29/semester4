/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
    public class Test3 {
        public void methodA(){
            System.out.println("Method A");
        }
        public void methodB() throws IOException
        {
            System.out.println(20/0);
            System.out.println("Method B");
        }
        }
class Utama
{
    public static void main(String[] args)
    {
        try {
            Test3 o=new Test3();
            o.methodA();
            o.methodB();
            System.out.println("Ini selalu dicetak");
            ;       } catch (IOException ex) {
            Logger.getLogger(Utama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//penggunaan throws digunakan untuk memberi tahu pemanggil bahwa metode mungkin akan melemparkan pengecualian tertentu. 


//Metode main dalam kelas Utama tidak lagi menggunakan deklarasi throws IOException. Sebaliknya, ia menangani pengecualian dengan blok try-catch.
//blok try, yang berarti program akan mencoba menjalankan metode tersebut, dan jika terjadi pengecualian, akan ditangkap oleh blok catch.
//Blok catch menangkap semua jenis pengecualian (Exception) dan mencetak pesan kesalahan.
//Blok finally akan selalu dijalankan, baik terjadi pengecualian maupun tidak.