/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curuk_game;

import javax.swing.*;


public class UI {
    
     public void setTampilAngka(JLabel a,ImageIcon[] angka,int n){
        a.setIcon(angka[n]);
    }
    
    
    public void setTampilTangan(JLabel tangan,int n,ImageIcon[] a){ // tampilkan tangan dengan jumlah n jari
        int i=0;
        boolean found=false;
        while(i<a.length && !found){
            if(i==n){
               tangan.setIcon(a[i]);
               found=true;
            }
            i++;
        }
    }
    
    public void setTampilTangan_h(JLabel tangan_h,ImageIcon[] a_h,int n){
        int i=0;
        boolean found=false;
        while(i<a_h.length && !found){
            if(i==n){
               tangan_h.setIcon(a_h[i]);
               found=true;
            }
            i++;
        }
    }
   
    
    public void setTampilNyawa(JLabel a[], int n,ImageIcon[] nyawa){ // tampilkan n nyawa 
       for(int i=0;i<5;i++){
            if(i < n){
                a[i].setIcon(nyawa[i]);
                a[i].setVisible(true);
            }
            else{
                a[i].setIcon(nyawa[i]);
                a[i].setVisible(false);
            }
        }
    }
    
    public void setLabelAngkaKocok(ImageIcon[] angka){
        for(int i=0;i<angka.length;i++){
            angka[i]=new ImageIcon("src/angka/"+i+".png");
        }
    }
  
    public void TransparantButton(JButton but){
        
        //trasnparan button play
        but.setOpaque(false);
        but.setContentAreaFilled(false);
        but.setBorderPainted(false); 
    }
    
    public void TransparantToggle(JToggleButton but){
        
        //trasnparan button play
        but.setOpaque(false);
        but.setContentAreaFilled(false);
        but.setBorderPainted(false); 
    }
    
    public void setDisable(JLabel l){
        l.setVisible(false);
    }
    
    public void setEnable(JLabel l){
        l.setVisible(true);
    }
    
    public void WinnerUI(JButton Rematch,JButton Back,JLabel Background,JTextField p1TimeField,JTextField p2TimeField){
        Rematch.setVisible(true);
        Back.setVisible(true);
        Background.setEnabled(false);
        p1TimeField.setEnabled(false);
        p2TimeField.setEnabled(false);
    }
}
