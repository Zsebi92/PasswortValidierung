import javax.swing.*;
import java.sql.Array;

public class PasswortValid {

    public static void main(String[] args) {

        // Eingabe Aufforderung
        String eingabe = JOptionPane.showInputDialog("Bitte gebe dein Passwort ein");
        System.out.println(pwLength(eingabe));

    }

    public static String pwLength(String passwort){


        if(passwort.length() >= 8){
            return passwort;
        }
        else{
            return "Passwort zu kurz";
        }
    }

    public static boolean checkForNum(String passwort){

        // Array für Zahlen zum checken
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};




    }
}
