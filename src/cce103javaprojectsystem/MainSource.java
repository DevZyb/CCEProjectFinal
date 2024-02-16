/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cce103javaprojectsystem;

/**
 *
 * @author Admin
 */
public class MainSource {
    public static void main(String[] args){
        
        //Loading Screen Code
        loadingFrame objFrame = new loadingFrame();
        Dashboard mA = new Dashboard();
        objFrame.setVisible(true);
        try{
            for(int i = 0; i <= 100; i++){
                Thread.sleep(35);
                objFrame.jLabel2.setText(Integer.toString(i) + "%");
                objFrame.jProgressBar1.setValue(i);
                if(i == 100){
                    objFrame.setVisible(false);
                    mA.setVisible(true);
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
    }
}
