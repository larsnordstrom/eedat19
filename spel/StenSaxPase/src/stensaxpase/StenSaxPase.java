/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stensaxpase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class StenSaxPase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Random används för slumpa fram tal.
        Random random = new Random();
        // Scanner för att hantera inmatningar.
        Scanner input = new Scanner(System.in);

        // Spelarnas namn
        String[] players = {"", ""};

        // Spelarnas poäng.
        int[] scores = {0, 0};

        // Alternativen för spelet.
        String[] options = {"Sten", "Sax", "Påse"};
        String[] playerChoice = {"", ""};
        
        // Håller koll på om man spelar, reglerar om spelet skall avslutas eller fortsätta.
        boolean isPlaying = true;

        // Game loop
        do {
            System.out.println("Hur många spelare (max 2st) : ");

            int numPlayers = input.nextInt();

            if (numPlayers == 2) {
                // Namnge spelare 1.
                System.out.println("Skriv delatagare 1 namn : ");
                players[0] = input.next();

                System.out.println("Skriv delatagare 2 namn : ");
                players[1] = input.next();

            }
            if (numPlayers == 1) {
                System.out.println("Skriv spelar 1 namn : ");
                players[0] = input.next();
                players[1] = "Jarvis";
                System.out.print("Lycka till " + players[0] + ", ");
                System.out.println("du utmanar " + players[1] + "! ");

            }
            // Game play loop, körs till någon vunnit.
            while (true) {

                if (numPlayers == 2) {
                    // Två spelare.
                    System.out.println(players[0] + " :\n 1.Sten\n 2.Sax\n 3.Påse\n");
                    playerChoice[0] = options[input.nextInt() - 1];

                    System.out.println(players[1] + " :\n 1.Sten\n 2.Sax\n 3.Påse\n");
                    playerChoice[1] = options[input.nextInt() - 1];

                } else {
                    // Single spelare mot datorn.
                    System.out.println(players[0] + " :\n 1.Sten\n 2.Sax\n 3.Påse\n");
                    playerChoice[0] = options[input.nextInt() - 1];
                    
                    // random.nextInt(3) slumpar fram ett tal mellan 0 och 2.
                    playerChoice[1] = options[random.nextInt(3)];

                }

                // Visa vad varje spelare gjort.
                System.out.println(players[0] + " " + playerChoice[0] + "-" + playerChoice[1] + " " + players[1]);

                // Kontrollera vem som vann rundan.
                if ((playerChoice[0].equals("Sten") && playerChoice[1].equals("Sax")) || (playerChoice[0].equals("Sax") && playerChoice[1].equals("Påse")) || (playerChoice[0].equals("Påse") && playerChoice[1].equals("Sten"))) {

                    scores[0] = scores[0] + 1;
                    System.out.println("");

                } else if (playerChoice[0].equals(playerChoice[1])) {

                    // Oavgjort
                } else {
                    // Spelare två eller Computer.
                    scores[1] = scores[1] + 1;

                }

                // Kontrollera om någon vunnit matchen
                if (scores[0] == 3) {
                    // Spelare 1 vann.
                    System.out.println(players[0] + " vann över " + players[1] + " med " + scores[0] + "-" + scores[1]);
                    break;
                } else if (scores[1] == 3) {
                    // Spelare 2 vann.
                    System.out.println(players[1] + " vann över " + players[0] + " med " + scores[1] + "-" + scores[0]);
                    break;
                } else {
                    // Skriv ut ställningen om ingen vunnit
                    System.out.println("Poäng : " + players[0] + " " + scores[0] + "-" + scores[1] + " " + players[1]);
                }
            }

            // Frågar om spelet ska fortsätta.
            System.out.println("Fortsätt spela Y/N");
            String doExit = input.next();

            // Om input från ovan är N.
            if (doExit.equalsIgnoreCase("N")) {

                // Ändra isPlaying till false för att avsluta loopen
                isPlaying = false;
                // Meddelar att spelet är avslutat.
                System.out.println("Tack för spelet!!");
            }else {
                // Nollställ poäng och spelarnas namn och antal spelare.
                scores[0] = 0;
                scores[1] = 0;
                players[0] = "";
                players[1] = "";
                numPlayers = 0;
                
                System.out.println("Ny omgång!\n");
            }

        } while (isPlaying);

    }

}
