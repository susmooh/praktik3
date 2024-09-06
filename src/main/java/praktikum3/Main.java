/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Hewan kucing = new Hewan("Mimikmeek",3);        
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Mobil BMW = new Mobil("BMW","Model1",1999,"pink");
        BMW.displayInfo();
        BMW.startEngine();
        
        Mobil Mercy = new Mobil("Mercy","Keren",2020,"pink");
        Mercy.setWarna("IJO");
        Mercy.setModel("Model Baru");
        Mercy.displayInfo();
        Mercy.startEngine();
    }
}
