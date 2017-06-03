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
public class SamsungS8 implements Samsung {
    
    @Override
    public void ukuran(){
        System.out.println("Ukuran Samsung S8 6 in");
    }
    
    @Override
    public void kamera(){
        System.out.println("Kamera Samsung S8 20 mp ");
    }
    
    @Override
    public void baterai (){
        System.out.println("Baterai Samsung S8 4500 mAh");
    }
}
