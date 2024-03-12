/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan6;

/**
 *
 * @author Lenovo
 */
class B extends A {
    B(){
        System.out.println("Konstruktor B dijalankan");
        var_a = "Var_a dari class B";
        var_b = "Var_a dari class B";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Objek A dibuat");
        A aa = new A();
        System.out.println("Menampilkan nama variabel dari object aa");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");

        System.out.println("Objek B dibuat");
        B bb = new B();
        System.out.println("Menampilkan nama variabel dari object bb");
        System.out.println(bb.var_a);
        System.out.println(bb.var_b);
        System.out.println(bb.var_c);
        System.out.println(bb.var_d);
        System.out.println("");

    }
}
