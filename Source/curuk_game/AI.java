/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curuk_game;

/**
 *
 * @author FS
 */
public class AI {
    String []Level = {"Easy","Medium","Hard"};
    String currLevel;
    String pilihanAI1, pilihanAI2;
    int NoFinger;
    Player_2 AIPlayer;
    
    public AI(int Number){
        this.resetpilihan();
        this.NoFinger = 0;
        this.currLevel = this.Level[Number];
    }
    
    public void resetpilihan(){
        this.pilihanAI1 = "kosong";
        this.pilihanAI2 = "kosong";
    }
    
    public void getTangan(){
        switch(currLevel){
            case "Easy":
                this.Easy();
                break;
            case "Medium":
                this.Medium();
                break;
            case "Hard":
                this.Hard();
                break;
        }
    }
    
    
    // Silahkan Lanjutkan
    public boolean KondisiBenar(){
        // Algoritma mengecek pilihanAI benar atau tidak
        if(this.pilihanAI1.equals("kanan")&&AIPlayer.getKanan()==0){// AI memilih tangan kanan tetapi jarinya kosong mengakibatkan kondisi false
            return false;
        }
        return true;
    }
    
    public void Easy(){
        // PilihanAI1 : "Tangan kanan" , "Tangan Kiri"  Tangan dari AI
        // pilihanAI2 : "Tangan kanan" , "Tangan Kiri" , "Sebelah"
        int pilihTangan,pilihTujuan;
        
        
        do{ // random tangan
            pilihTangan= (int)(Math.random()*2)+1;
            pilihTujuan= (int)(Math.random()*3)+1;
            
            this.pilihanAI1 = convertPilihanAI1(pilihTangan); // Silahkan buat Algortima untuk men-generate pilihanAI1
            this.pilihanAI2 = convertPilihanAI1(pilihTujuan); // Silahkan buat Algortima untuk men-generate pilihanAI1
            if(this.pilihanAI2.equals("Sebelah")){
                this.NoFinger = 0; //Silahkan buat algoritma random antara 1 - 2
            }
        }while(!this.KondisiBenar()); // Mengencek Apakah kondisi tangan memenuhi
    }
    
    public void Medium(){
        
    }
    
    public void Hard(){
        
    }
    
    
    public String convertPilihanAI1(int a){
        String temp=null;
        switch(a){
            case 1:
               temp="kanan";
            break;
            case 2:
               temp="kiri";
            break;     
        }
        return temp;
    }
    
    public String convertPilihanAI2(int a,String b){
        String temp=null;
        switch(a){
            case 1:
                temp="kanan";
            break;
            case 2:
                temp="kiri";
            break;
            case 3:
                if("kiri".equals(b)){
                    temp="kanan";
                }else{
                    temp="kiri";
                }
                       
            break;
        }
    
        return temp;
    }
    
    
   
    
}
