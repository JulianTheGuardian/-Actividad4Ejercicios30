/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P12Telefono {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        NumberFormat decimales = NumberFormat.getInstance();
        decimales.setMaximumFractionDigits(5);
        
        String dia;
        String jornada;
        int minutos;
        double precioMin;
        double precioImp = 0;
        double precio;
        boolean pass = true;
        
        System.out.println("Ingrese el dia de la semana que se realizo la llamada.");
        dia = scan.nextLine().toLowerCase();
        
        System.out.println("Ingrese los minutos que duro la llamada, en caso de no ser exactos redondee.");
        minutos = scan.nextInt();
        
        System.out.println("Ingrese la jornada en la que se realizo la llamada.\n1-Mañana\n2-Tarde");
        jornada = scan.next().toLowerCase();
        
        
        if(minutos <= 5){
            precioMin = minutos;
        }
        else if(minutos <= 8){
            precioMin = 5;
            minutos = minutos-5;
            precioMin = (double) (precioMin + (minutos*0.8));
        }
        else if(minutos <= 10){
            precioMin = (double) (5 + 2.4);
            minutos = minutos-8;
            precioMin = (double) (precioMin + (minutos*0.7));
        }
        else{
            precioMin = (double) (5 + 2.4 + 1.4);
            minutos = minutos-10;
            precioMin = (double) (precioMin + (minutos*0.5));
        }
        
        
        if(dia.equals("domingo")){
            precioImp = (double) (precioMin*3)/100;
        }
        else if(jornada.equals("1")){
            precioImp = (double) (precioMin*15)/100;
        }
        else if(jornada.equals("2")){
            precioImp = (double) (precioMin*10)/100;
        }
        else{
            pass = false;
            System.out.println("Jornada o dia no validos.");
        }
        
        if(pass){
            precio = (double) precioMin + precioImp;
            System.out.println("Por la llamada realizada, usted debe de pagar:");
            System.out.println("Por tiempo: " + decimales.format(precioMin));
            System.out.println("Por impuestos: " + decimales.format(precioImp));
            System.out.println("En total: " + decimales.format(precio));
        }
    }
}
