/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);

        arrayDeque.addLast(4);
        arrayDeque.addLast(5);

        System.out.println("\nArrayDeque:");
        for (Integer num : arrayDeque) {
            System.out.println(num);
        }
    }
}

