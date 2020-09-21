/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinputs;

import java.util.Scanner;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class ScannerInputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv ditt förnamn : ");
        String myName = input.nextLine();
        
        System.out.println("Skriv din ålder : ");
        int myAge = input.nextInt();
        
        System.out.println("Hej : " + myName);
        System.out.println("Du är " + myAge + "år");
          
    }
    
}
