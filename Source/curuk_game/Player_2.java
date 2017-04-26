/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curuk_game;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Player_2 extends Player{
    
     public Player_2(int kanan, int kiri, int nyawa, int time, String Skin){
        super(kanan,kiri,nyawa,time,Skin);
    }
     
     
     public void setSkinDefault(ImageIcon[] nyawa) {
       for(int i=0;i<5;i++){
            this.SkinKanan[i] = flipImage("src/Skin Tangan/Tangan/" + super.getSkin() +"/T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri[i]= flipImage("src/Skin Tangan/Tangan/" + super.getSkin() + "/T_Kiri_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKanan_h[i]= flipImage("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri_h[i]= flipImage("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kiri_" + i +".png");
        }
        
        for(int i=0 ;i<nyawa.length;i++){
            nyawa[i]= new ImageIcon("src/game/kesempatan.png") ;
        }
    }
     
     public void setSkinMonster(ImageIcon[] nyawa) {
       for(int i=0;i<5;i++){
            this.SkinKanan[i] = flipImage("src/Skin Tangan/Tangan/" + super.getSkin() +"/skin1_P1_kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri[i]= flipImage("src/Skin Tangan/Tangan/" + super.getSkin() + "/skin1_P1_kiri_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKanan_h[i]= flipImage("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kanan_" + i +".png");
        }
        
        for(int i=0;i<5;i++){
            this.SkinKiri_h[i]= flipImage("src/Skin Tangan/indikator/" + super.getSkin() + "/I_T_Kiri_" + i +".png");
        }
        
        for(int i=0 ;i<nyawa.length;i++){
            nyawa[i]= new ImageIcon("src/game/kesempatan.png") ;
        }
    }
     
     
     public void setPosisiTangan(JLabel kanan,JLabel kanan_h,JLabel kiri,JLabel kiri_h){
        kanan.setBounds(543, 191, 469, 147);
        kanan_h.setBounds(515, 183, 522, 165);
        kiri.setBounds(543, 374, 469, 147);
        kiri_h.setBounds(515, 364, 522, 165);
        
    }
     
    public ImageIcon flipImage(String nameFile){ // Mem - Flip Image tangan
        BufferedImage simg = null;
        BufferedImage mimg;
        File f = null;
        ImageIcon tmp;
        int width;
        int height;
        
        //File object
    
        //read source image file
        try{
            f = new File(nameFile);
            simg = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
        //get source image dimension
        width = simg.getWidth();
        height = simg.getHeight();
        mimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                mimg.setRGB(width - x - 1, height - y - 1, simg.getRGB(x, y));
            }
        }
        tmp = new ImageIcon(mimg);
        
        return tmp;
    }
  
}
