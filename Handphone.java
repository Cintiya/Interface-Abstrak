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
   public class Handphone {
   private String merk;
   private String warna;
   private int harga;
   
   public String getMerk(){
       return merk;
   }
   public void setMerk(String merk){
       this.merk = merk;
   }
   
   public String getWarna(){
       return warna;
   }
   public void setWarna(String warna){
       this.warna = warna;
   }
   
   public int getHarga(){
       return harga;
   }
   public void setHarga(int harga){
       this.harga= harga;
   }
}
