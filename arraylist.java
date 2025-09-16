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
     
     for (int i=0; i<3; i++){
        
        System.out.println("Ingrese la fruta # "+(i + 1)+": ");
        frutas.add(in.nextLine());
     
     }
     
     for (int i=0; i<3; i++){
     System.out.println("Frutas: "+ frutas.get(i));
     }
     
     
     
 }
    
    
    
    
}
