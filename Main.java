/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Win 10
 */
public class Main {
    public static void main (String[] args){
        
            
        System.out.println("Samsung");
            
        
        SamsungS6 s6 = new SamsungS6();
        System.out.println("Merk Samsung Tipe Samsung S6");
        s6.ukuran();
        s6.kamera();
        s6.baterai();
        System.out.println("");
        
        SamsungS7 s7 = new SamsungS7();
        System.out.println("Merk Samsung Tipe Samsung S7");
        s7.ukuran();
        s7.kamera();
        s7.baterai();
        System.out.println("");
        
        SamsungS8 s8 = new SamsungS8();
        System.out.println("Merk Samsung Tipe Samsung S8");
        s8.ukuran();
        s8.kamera();
        s8.baterai();
        System.out.println("");
        
        Asus as = new Asus();
        as.Asus();
        System.out.println("");
        
        Oppo op = new Oppo();
        op.Oppo();
        System.out.println("");
        
        Lenovo lv = new Lenovo();
        lv.Lenovo();
        System.out.println("");
    }
}
