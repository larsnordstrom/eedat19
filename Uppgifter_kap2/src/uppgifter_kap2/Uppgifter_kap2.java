/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgifter_kap2;

import java.util.Scanner;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class Uppgifter_kap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //double talA = 2.1;
        //double talB = 3.1;
        //double summa = talA + talB;
        //System.out.println("TalA är : " + talA);
        //System.out.println("TalB är : " + talB);
        //System.out.println("Summan är : " + summa);
        Scanner input = new Scanner(System.in);

        //System.out.println("Skriv ett tal : ");
        //double tal = input.nextDouble();
        //double kvadraten = tal * tal;
        //System.out.println("Kvadraten är : " + kvadraten);
        System.out.println("Skriv din ålder : ");

        int yourAge = input.nextInt();
        int decennium = yourAge / 10;

        int nollning = (decennium - 1) * 10;
        int yearsLeft = nollning - yourAge;

        //int yearsToNextBirthday = (yourAge / 10) * 10 + 10;
        //int yearsLeft = yearsToNextBirthday - yourAge;

        //System.out.println("Du är " + yourAge + " och du fyller " + yearsToNextBirthday + " om " + yearsLeft);

    }

}
