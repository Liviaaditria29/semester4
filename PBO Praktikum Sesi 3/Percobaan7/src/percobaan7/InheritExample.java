/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan7;

/**
 *
 * @author Lenovo
 */
class Bapak {
    int a;
    int b;

    void show_variabel(){
        System.out.println("Nilai a=" + a);
        System.out.println("Nilai b=" + b);
    }
}

class Anak extends Bapak {
    int c;

    void show_variabel() {
        super.show_variabel();
        System.out.println("Nilai c=" + c);
    }
}

public class InheritExample {
    public static void main(String[] args) throws Exception {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        
        objectBapak.a = 1;
        objectBapak.b = 1;
        System.out.println("Object Bapak (Superclass):");

        objectBapak.show_variabel();
        objectAnak.c = 5;
        System.out.println("Object anak (Superclass dari anak)");
        objectAnak.show_variabel();
    }
}
