import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzle {
    Random rand = new Random();

    // Implement the getTenRolls method
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(21));
        }
        return rolls;
    }

    //Implement the getRandomLetter method
    public char getRandomLetter() {
        String alpha = "azertynbvcxwmlkjhgfdsquiop";
        int num = rand.nextInt(26); 
        return alpha.charAt(num);
    }

    //..... the generatePassword method
    public String generatePassword() {
        String newStr = "";
        for (int i = 0; i < 8; i++) { 
            char letter = getRandomLetter();
            newStr += letter;
        }
        return newStr;
    }

    //... the getNewPasswordSet method
    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            String pw = generatePassword();
            passwords.add(pw);
        }
        return passwords;
    }

    //Ninja Bonus: Implement the shuffle method
    public ArrayList<Integer> shuffle(ArrayList<Integer> array) {
        Collections.shuffle(array, rand);
        return array;
    }

    //Main method to test the implemented methods
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();

        //Test getTenRolls
        ArrayList<Integer> rolls = puzzle.getTenRolls();
        System.out.println("Ten Rolls: " + rolls);

        //Test getRandomLetter
        char randomLetter = puzzle.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        //Test generatePassword
        String password = puzzle.generatePassword();
        System.out.println("Generated Password: " + password);

        //Test getNewPasswordSet
        ArrayList<String> passwordSet = puzzle.getNewPasswordSet(5);
        System.out.println("Password Set: " + passwordSet);

        //Test shuffle method
        ArrayList<Integer> shuffledRolls = puzzle.shuffle(rolls);
        System.out.println("Shuffled Rolls: " + shuffledRolls);
    }
}
