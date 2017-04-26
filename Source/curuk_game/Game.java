/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curuk_game;

public class Game {
    private String tangan;
    private int giliran;
    private int ang1;
    private int ang2;
    private String ClickHand1 = "kosong"; // Klik tangan Awal
    private String ClickHand2 = "kosong"; // Klik tangan yang akan dituju
    
    
    public Game(){
        
    }
    
    public Game(String tangan,int giliran){
        this.tangan=tangan;
        this.giliran=giliran;
    }

    public String getTangan() {
        return tangan;
    }

    public int getGiliran() {
        return giliran;
    }

    public void setTangan(String tangan) {
        this.tangan = tangan;
    }

    public void setGiliran(int giliran) {
        this.giliran = giliran;
    }

    public int getAng1() {
        return ang1;
    }

    public int getAng2() {
        return ang2;
    }

    public void setAng1(int ang1) {
        this.ang1 = ang1;
    }

    public void setAng2(int ang2) {
        this.ang2 = ang2;
    }
    
    public String getClickHand1(){
        return this.ClickHand1;
    }
    
    
    public void setClickHand1(String Hand){
        this.ClickHand1 = Hand;
    }
    
    
    public String getClickHand2(){
        return this.ClickHand2;
    }
    
    public void setClickHand2(String Hand){
        this.ClickHand2 = Hand;
    }
    
    
}
