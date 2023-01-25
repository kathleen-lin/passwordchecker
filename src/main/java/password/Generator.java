package password;

import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        
    int pwLength = Integer.parseInt(args[0]);
    Character[] password = new Character[pwLength];
    boolean[] filled = new boolean[pwLength];
    for (int i = 0; i < pwLength; i++){
        filled[i] = false;
    }

    Random rand = new Random();

    while (true)
    {
        int indexLower = rand.nextInt(pwLength);

        if (!filled[indexLower]){

            password[indexLower] = Constants.LOWERCASE[rand.nextInt(Constants.LOWERCASE.length)];
            filled[indexLower] = true;
            break;
        } 

    }

    while (true)
    {
        int indexUpper = rand.nextInt(pwLength);

        if (!filled[indexUpper]){

            password[indexUpper] = Constants.UPERCASE[rand.nextInt(Constants.UPERCASE.length)];
            filled[indexUpper] = true;
            break;
        } 

    }

    while (true)
    {
        int indexNumber = rand.nextInt(pwLength);

        if (!filled[indexNumber]){

            password[indexNumber] = Constants.NUMBER[rand.nextInt(Constants.NUMBER.length)];
            filled[indexNumber] = true;
            break;
        } 

    }

    while (true)
    {
        int indexSpecial = rand.nextInt(pwLength);

        if (!filled[indexSpecial]){

            password[indexSpecial] = Constants.SPECIALCHAR[rand.nextInt(Constants.SPECIALCHAR.length)];
            filled[indexSpecial] = true;
            break;
        } 

    }


    for (int i = 0; i < password.length; i++){
        if (!filled[i]){
            // fill it with a character
            password[i] = Constants.ALL[rand.nextInt(Constants.ALL.length)];
            filled[i] = true;
        } else {
            continue;
        }
    }

    for (int i = 0; i < password.length; i++){
        System.out.print(password[i]);
    }
    }   
}