package pertnibel.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Utilitarian class providing interaction with the player behind
 * the keyboard.
 * Represents the screen and provides interaction methods.
 * @author Alexandre Gauthier
 */
public class Screen {
    public static BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in));
    public static BufferedWriter stdout = new BufferedWriter(
            new OutputStreamWriter(System.out));

    /**
     * Read a line from standard input (the user)
     * @return line  line as entered by the user
     */
    public static String getLine(){
        String line;
        try {
            line = stdin.readLine();
        } catch(IOException ex) {
            System.err.println("Internal Error: " +
                    "Reading line from stdin failed.");
            System.err.println(ex.getMessage());
            return null; // return empty string.
        }
        return line;
    }

    /**
     * Prompt the user and retrieve the answer.
     * @param prompt  question to ask
     * @return answer
     */
    public static String ask(String prompt){
        String answer;
        System.out.print(prompt);
        try {
            answer = stdin.readLine();
        } catch(IOException ex) {
            System.err.println("Internal Error: " +
                    "Reading line from stdin failed.");
            System.err.println(ex.getMessage());
            return null;
        }
        return answer;
    }
}
