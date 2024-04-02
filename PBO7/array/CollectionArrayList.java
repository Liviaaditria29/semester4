/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Lenovo");
        arrayList.add("MacBook");
        arrayList.add("Toshiba");

        System.out.println("Laptop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}

