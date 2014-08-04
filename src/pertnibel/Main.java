package pertnibel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author waikiki
 * @author mrdaemon
 */
public class Main {

    public static void main(String[] args){
        String playerName;
        boolean playerIsMale;

        System.out.println("Tout commence dans la cite de Pertnibel... ");
        // TODO: imprimer l'introduction du jeu

        /* Setup input buffer */
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.print("De quel nom etes vous affubles? ");
            playerName = input.readLine();
            playerIsMale = readGender(input);
        } catch (IOException ex) {
            System.err.println("Une personne sur la voie cause une " +
                    "interruption du service sur la ligne Orange.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
    }

    private static boolean readGender(BufferedReader input)
            throws IOException{
        String answer;
        while(true){
            System.out.println("Êtes vous un aventurier ou une aventurière?");
            System.out.println("  1) Un Aventurier");
            System.out.println("  2) Une Aventurière");
            answer = input.readLine();
            if(answer.equals("1")) {
                return true;
            } else if(answer.equals("2")) {
                return false;
            } else {
                System.err.println("Il me semble que la question était " +
                        "claire.\nOu voyez vous \"" + answer +
                        "\" parmi les choix de réponse?");
            }
       }
    }

}
