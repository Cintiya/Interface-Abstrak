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
public class Oppo {
     
    public void Oppo(){
        System.out.println("Oppo");
        
	Handphone hp = new Handphone();
	hp.setMerk("Oppo");
	System.out.println("Merk Handphone : "+hp.getMerk());
        hp.setWarna("Pink");
	System.out.println("Warna Handphone : "+hp.getWarna());
        hp.setHarga(4000000);
        System.out.println("Harga Handphone : "+hp.getHarga());
} 
    
}
