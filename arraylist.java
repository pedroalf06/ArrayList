/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pood;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class arraylist {
 

    
 public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     ArrayList<String> frutas = new ArrayList<>();
     ArrayList<Integer> precio = new ArrayList<>();
     
     char continuar;
     int cont = 0;
     
     do{
         
        
        System.out.println("Ingrese la fruta # "+(cont + 1)+": ");
        frutas.add(in.nextLine());
        
        System.out.println("Ingrese el precio de la "+(frutas.get(cont))+": ");
        precio.add(in.nextInt());
        
     
        System.out.println("Desea seguir ingresando frutas (s para si y n para no): ");
        
        continuar = in.next().charAt(0);
        in.nextLine();
        cont++;
     }while(continuar == 's');
     
     for (int i=0; i< cont; i++){
     System.out.println("Frutas: "+ frutas.get(i)+ " precio: "+ precio.get(i));
     }
     
     
     
 }
    
    
    
    
}
