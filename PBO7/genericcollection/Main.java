/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericcollection;

/**
 *
 * @author Lenovo
 */

public class Main {

    public static void main(String[] args) {
        MahasiswaKu<String, String, Integer> m = new MahasiswaKu<>();

        m.setNim("20220040176");
        m.setName("liviaaditria");
        m.setClas(22);

        System.out.println(m.getNim()); // 1102020
        System.out.println(m.getName()); // Ferdi
        System.out.println(m.getClas()); // 21
    }
}

