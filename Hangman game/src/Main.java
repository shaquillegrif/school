import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filepath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));
        

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordstate.add('_');
        }
        System.out.println("##################");
        System.out.println("welcome to Hangman");
        System.out.println("##################");

        while(wrongGuesses < 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");

            for (char c : wordstate) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("correct guess");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordstate.set(i, guess);

                    }
                }
                if(!wordstate.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("you win");
                    System.out.println("the word was: " + word);
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println("incorrect guess");
            }
        }
        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("game over");
            System.out.println("the word is " + word);
        }

        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){

        return switch (wrongGuesses){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       o
                      
                      
                      """;
            case 2 -> """
                       o
                       |
                      
                      """;
            case 3 -> """
                       o
                      /|
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
