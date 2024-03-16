/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Lenovo
 */

//OVERRIDING

class PeralatanSekolah {
   
    public void deskripsi() {
        System.out.println("Ini adalah sebuah peralatan sekolah.");
    }
}


class Buku extends PeralatanSekolah {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah buku.");
    }
}

//Pensil
class Pensil extends PeralatanSekolah {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah pensil.");
    }
}

//Pulpen
class Pulpen extends PeralatanSekolah {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sebuah pulpen.");
    }
}

public class AlatTulis {
    public static void main(String[] args) {
        PeralatanSekolah peralatan1 = new Buku();
        PeralatanSekolah peralatan2 = new Pensil();
        PeralatanSekolah peralatan3 = new Pulpen();
        
        peralatan1.deskripsi(); // Output: Ini adalah sebuah buku.
        peralatan2.deskripsi(); // Output: Ini adalah sebuah pensil.
        peralatan3.deskripsi(); // Output: Ini adalah sebuah pulpen.
    }
}

