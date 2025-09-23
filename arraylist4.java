import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
 

    
 public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     
     ArrayList<String> frutas = new ArrayList<>();
     ArrayList<Integer> precio = new ArrayList<>();
     
     char continuar;
     int cont = 0, suma = 0, precioin;
     
     do{
         
        
        System.out.println("Ingrese la fruta # "+(cont + 1)+": ");
        frutas.add(in.nextLine());
        
        System.out.println("Ingrese el precio de la "+(frutas.get(cont))+": ");
        precioin = in.nextInt();
        precio.add(precioin);
        
        suma= suma + precioin;
        
        System.out.println("Desea seguir ingresando frutas (s para si y n para no): ");
        
        continuar = in.next().charAt(0);
        in.nextLine();
        cont++;
     }while(continuar == 's');
     
     for (int i=0; i< frutas.size(); i++){
     System.out.println("Frutas: "+ frutas.get(i)+ " precio: "+ precio.get(i));
     }
     
     System.out.println("Total = "+suma);
     
     
 }
    
    
    
    
}
