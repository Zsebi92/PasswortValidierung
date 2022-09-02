import javax.swing.*;
import java.sql.Array;
import java.util.Scanner;

public class PasswortValid {

    public static void main(String[] args) {

    //Final
        System.out.println("Bitte gebe ein Passwort ein: ");


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(pwDenied(input));
    }

    public static boolean pwCheckForLength(String password){
        if(password.length() <= 8){
            return false;
        }
        return true;
    }

    public static boolean pwCheckForNumber(String password){
        char[] newArray = password.toCharArray();

        for (int i = 0 ; i < newArray.length; i++){
            if(Character.isDigit(newArray[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean pwCheckForLowerCase(String password){
        char[] newArray = password.toCharArray();

        for (int i = 0 ; i < newArray.length; i++){
            if(Character.isUpperCase(newArray[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean pwCheckForUpperCase(String password){
        char[] newArray = password.toCharArray();

        for (int i = 0 ; i < newArray.length; i++){
            if(Character.isUpperCase(newArray[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean pwUnsafe(String password){
        String[] badPasswords = new String[4];
        badPasswords[0] = "Passwort1";
        badPasswords[1] = "Abc123456";
        badPasswords[2] = "123456789";

        if(password == badPasswords[0] || password == badPasswords[1] || password == badPasswords[2]){
            return true;
    }

        return false;

    }
    
    public static String pwDenied(String input){
        if(pwCheckForLength(input) == false){
            return "Dein Passwort ist zu kurz!!!";
        } else if (pwCheckForNumber(input) == false) {
            return "Dein Passwort hat keine Zahl!!!";
        } else if (pwCheckForLowerCase(input) == false) {
            return "Dein Passwort hat keinen klein Buchstaben!!!";
        } else if (pwCheckForUpperCase(input) == false) {
            return "Dein Passwort hat keinen gross Buchstaben!!!";
        } else if(pwUnsafe(input) == false){
            return "Das Passwort ist zu unsicher!!!";
        }
        return "Dein Passwort: " + input + "wurde akzeptiert";
    }
}
