/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author Julian
 */
public class P08Cronometro {
    
    public static void main(String[] args) throws InterruptedException{
        
        int horas;
        int min = 0;
        int seg = 0;
        
        for (horas = 0; horas < 24; seg++) {
            
            System.out.println(horas + ":" + min + ":" + seg);
            
            if(seg > 59){
                min = min+1;
                seg = 0;
            }
            
            if(min > 59){
                horas = horas+1;
                min = 0;
            }
            Thread.sleep(1*1000);
        }
        
        System.out.println("Como dejaste la PC encendida 24 horas con el cronometro asi, dejala descansar bro.");
    }
}
