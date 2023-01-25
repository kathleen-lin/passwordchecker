package password;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // set the rules
        int minLength = Integer.parseInt(args[0]);
        //System.out.println(pwLength);


        // take in the input
        System.out.print(">>> ");
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();



        // first check: does the length fits
        if (password.length() < minLength){
            System.out.println("Password is too short");
        }

        Password pw = new Password(password);
        // pw passed length check, check if has the required rules
        int lowerCaseCount = 0, upperCaseCount = 0, specialCharacerCount = 0, numberCount = 0;

        for (int i = 0; i < password.length(); i++){
            if (pw.checkCondition(password.charAt(i), Constants.SPECIALCHAR )){
                specialCharacerCount++;
            } 
            if (pw.checkCondition(password.charAt(i), Constants.LOWERCASE )){
                lowerCaseCount++;
            } 
            if (pw.checkCondition(password.charAt(i), Constants.UPERCASE )){
                upperCaseCount++;
            }
            if (pw.checkCondition(password.charAt(i), Constants.NUMBER )){
                numberCount++;
            }

        }    

        // if any of the int is 0, the pw is not eligible

        if (lowerCaseCount == 0){
            System.out.println("Password needs at least one lowercase");
        }
        if (upperCaseCount == 0){
            System.out.println("Password needs at least one uppercase");
        }
        if (specialCharacerCount == 0){
            System.out.println("Password needs at least one special character");
        }
        if (numberCount == 0){
            System.out.println("Password needs at least one numer");
        }

        if ((lowerCaseCount > 0) && (upperCaseCount > 0) && (specialCharacerCount > 0) && (numberCount > 0)){
            System.out.println("You have a strong password");
        }
        
        //System.out.printf("%d, %d, %d, %d", lowerCaseCount,upperCaseCount, specialCharacerCount, numberCount);


        




    }
}
