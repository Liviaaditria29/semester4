/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericcollection;

/**
 *
 * @author Lenovo
 */
/*

@author Lenovo
 */


public class MahasiswaKu<T, U, V> {

    private T nim;
    private U name;
    private V clas;

    public MahasiswaKu() {
    }

    public MahasiswaKu(T nim, U name, V clas) {
        this.nim = nim;
        this.name = name;
        this.clas = clas;
    }

    public T getNim() {
        return nim;
    }

    public void setNim(T nim) {
        this.nim = nim;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public V getClas() {
        return clas;
    }

    public void setClas(V clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "MahasiswaKu{" +
                "nim='" + nim + '\'' +
                ", name='" + name + '\'' +
                ", clas=" + clas +
                '}';
    }
}
