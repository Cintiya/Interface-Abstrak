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
public class Asus {
    
     public void Asus(){
         System.out.println("Asus");

	Handphone hp = new Handphone();
	hp.setMerk("Asus");
	System.out.println("Merk Handphone : "+hp.getMerk());
        hp.setWarna("Merah");
	System.out.println("Warna Handphone : "+hp.getWarna());
        hp.setHarga(3000000);
        System.out.println("Harga Handphone : "+hp.getHarga());
} 
}
