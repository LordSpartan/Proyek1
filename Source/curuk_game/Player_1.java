/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curuk_game;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Player_1 extends Player{
  
 
    public Player_1(int kanan, int kiri, int nyawa, int time, String Skin){
        super(kanan,kiri,nyawa,time,Skin);
    }
    
    public void setSkinDefault(ImageIcon[] nyawa) {
        for(int i=0;i<5;i++){
            this.SkinKanan[i] = new ImageIcon("src/Skin Tangan/Tangan/" + super.getSkin() +"/T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri[i]= new ImageIcon("src/Skin Tangan/Tangan/" + super.getSkin() + "/T_Kiri_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKanan_h[i]= new ImageIcon("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri_h[i]= new ImageIcon("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kiri_" + i +".png");
        }
        
        for(int i=0 ;i<nyawa.length;i++){
            nyawa[i]= new ImageIcon("src/game/kesempatan 2.png") ;
        }
        
    }
    
    public void setSkinMonster(ImageIcon[] nyawa) {
        for(int i=0;i<5;i++){
            this.SkinKanan[i] = new ImageIcon("src/Skin Tangan/Tangan/" + super.getSkin() +"/skin1_P1_kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri[i]= new ImageIcon("src/Skin Tangan/Tangan/" + super.getSkin() + "/skin1_P1_kiri_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKanan_h[i]= new ImageIcon("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri_h[i]= new ImageIcon("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kiri_" + i +".png");
        }
        
        for(int i=0 ;i<nyawa.length;i++){
            nyawa[i]= new ImageIcon("src/game/kesempatan 2.png") ;
        }
        
    }
    
    public void setPosisiTangan(JLabel kanan,JLabel kanan_h,JLabel kiri,JLabel kiri_h){
        kanan.setBounds(-60, 374, 467, 147);
        kanan_h.setBounds(-80, 364, 509, 161);
        kiri.setBounds(-60, 191, 467, 146);
        kiri_h.setBounds(-80, 183, 510, 161);
    }

}
