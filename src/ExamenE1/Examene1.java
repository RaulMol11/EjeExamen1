/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenE1;

import java.util.Scanner;

/**
 *
 * @author raulm
 */
public class Examene1 {
     public static void main(String[] args) {
       int dia1,mes1,año1;Scanner x = new Scanner(System.in);
       System.out.println("Dia: "); dia1 =x.nextInt(); 
       System.out.println("Mes: "); mes1 =x.nextInt();
       System.out.println("Año: "); año1 =x.nextInt();
       
       Fecha mostrarFecha= new Fecha(dia1,mes1,año1);
       System.out.println("Fecha: "+mostrarFecha.getDia()+"/"+mostrarFecha.getMes()+"/"+mostrarFecha.getAño());
       mostrarFecha.setDia(dia1);
       mostrarFecha.setMes(mes1);
       mostrarFecha.setAño(año1);
    }
    
}
