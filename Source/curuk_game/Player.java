/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curuk_game;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player {
    private int kanan;
    ImageIcon[] SkinKanan = new ImageIcon[5];
    ImageIcon[] SkinKiri = new ImageIcon[5];
    ImageIcon[] SkinKanan_h = new ImageIcon[5];
    ImageIcon[] SkinKiri_h = new ImageIcon[5];
    JLabel[] labelNyawa = new JLabel[5];
    private String Skin;
    private int kiri;
    private int nyawa;
    private int time;
    
    public Player(int kanan, int kiri, int nyawa, int time, String Skin) {
        this.kanan = kanan;
        this.kiri = kiri;
        this.nyawa = nyawa;
        this.time = time;
        this.Skin = Skin;
    }

    public int getKanan() {
        return kanan;
    }

    public int getKiri() {
        return kiri;
    }

    public int getNyawa() {
        return nyawa;
    }

    public int getTime() {
        return time;
    }
    
    public String getSkin(){
        return this.Skin;
    }

    public void setKanan(int kanan) {
        this.kanan = kanan;
    }

    public void setKiri(int kiri) {
        this.kiri = kiri;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    
    public void setSkin(String Skin){
        this.Skin = Skin;
    }
   
    // author:irsyad
    // Menambah jumlah jari di tangan T 
    public void addjari(int jumlah,String T){
        if("kanan".equals(T)&&kanan!=0){
            kanan=kanan+jumlah;
        }
        else if("kiri".equals(T)&&kiri!=0){
            kiri=kiri+jumlah;
        }
    }
    
    public void pindah(String T){
        if("kiri".equals(T)){
            if(kanan==0){ // tangan sudah mati
                nyawa=nyawa-1;
            }
            kanan=kanan+1;
            kiri=kiri-1;
        }
        else if("kanan".equals(T)){
            if(kiri==0){ // tangan sudah mati
                nyawa=nyawa-1;
            }
            kiri=kiri+1;
            kanan=kanan-1;
        }
    }
    
    // author:irsyad
    // Pindah cek jumlah jari ke tangan T 
    public boolean cek(String T){
        if("kiri".equals(T)){
            if(kanan==0&&kiri==4){
                return true;
            }
        }
        else{
            if(kiri==0&&kanan==4){
                return true;
            }
        }
        return false;
    }
    
    
    //kondisi apakah bisa pindah ke sebelah
    public boolean isBisaPindah(String T){
        //
        //||  
        
        if(T=="kanan"){
            if(kanan==0||kiri==kanan-1||(kiri==1&&kanan==1) || ((kanan==kiri-1)&&(kiri<kanan)) || (kanan!=0&&kiri==4)||(kanan==1&&kiri!=0)  ){
                return false;
            }
        }else{
            if(kiri==0||kanan==kiri-1||(kiri==1&&kanan==1) || ((kiri==kanan-1)&&(kanan<kiri)) || (kanan==4&&kiri!=0) || (kiri==1&&kanan!=0)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isDead(){
        if(kanan==0&&kiri==0){
            return true;
        }
        else {
            return false;
        }
    }
}


