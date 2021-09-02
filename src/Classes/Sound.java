/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Random;


public class Sound {
    private AudioClip clip;
        
        Random rand = new Random();
        public static int nromusic;
        
        
        public static Sound fund = new Sound("/Sound/Cozinha.wav");
        
        
        
        private Sound(String nome){
            try{
            clip = Applet.newAudioClip(Sound.class.getResource(nome));
        }
            catch(Throwable e){
                
            }
        }
        
        public void play(){
            try{
            new Thread(){
                public void run(){
                    
                    clip.play();
                }
            }.start();
        }
            catch(Throwable e){
                
            }
        }  
        
        public void loop(){
            try{
            new Thread(){
                public void run(){
                    clip.loop();
                }
            }.start();
        }
            catch(Throwable e){
                
            }
}
        public void stop(){
            try{
            new Thread(){
                public void run(){
                    clip.stop();
                }
            }.start();
        }
            catch(Throwable e){
                
            }
}
}
