/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabraenreverso;

import java.util.Scanner;

/**
 *
 * @author Nixon
 */
public class PalabraEnReverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //metodo for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        String reverso = "";
        
        for (int i = palabra.length() - 1; i >=0; i--) {
            reverso += palabra.charAt(i);
        }
        System.out.println("El reverso es: " + reverso);
          
            //metodo while
//        Scanner scanner = new Scanner (System.in);
//        System.out.print("Ingrese la palabra: ");
//        String palabra = scanner.nextLine();
//        String reverso = "";
//        int i = palabra.length() - 1;
//        
//        while (i >= 0) {
//            reverso += palabra.charAt(i);
//            i--;
//        }
//        System.out.print("El reverso de la palabra: " + reverso);

            //metodo do-while
//          Scanner scanner = new Scanner (System.in);
//          System.out.print("Ingrese la palabra: ");
//          String palabra = scanner.nextLine();
//          String reverso = "";
//          int i = palabra.length() - 1;
//          
//          do {
//              reverso += palabra.charAt(i);
//              i--;
//          } while (i >= 0);
//          System.out.println("El reverso de la palabra es: " + reverso);
          
        
    }
        
    
}
