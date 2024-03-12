/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Lenovo
 */
class Parent {
    public int x = 5;
}

class Child extends Parent {
    public int x = 10;
    public void Info(int x){
        System.out.println("Nilai x sebagai parameter: " + x);
        System.out.println("Data member x di class Child = " + this.x);
        System.out.println("Data member x di class Parent = " + super.x);
    }
}

public class NilaiX {
    public static void main(String[] args) throws Exception {
        Child test = new Child();
        test.Info(20);
    }
}