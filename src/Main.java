import java.util.Scanner;

/**
 * Created by Nicole on 2/3/2017.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        String answer;

        //loop to keep translating if the user enters "yes"
        do {
            System.out.println("Enter a word to translate: ");
            String word = scan.next();

            //translate the word
            String translated = translate(word);

            //output it
            System.out.println(translated);

            System.out.print("Do you want to continue? yes/no ");

            //get the response, turn it lower case
            answer = scan.next().toLowerCase();

        } while (answer.equals("yes"));

        scan.close();
    }

    public static String translate(String word) {
        //find the first vowel
        int vowel = findVowel(word);
        //if it's an invalid word
        if (vowel == -1) {
            return "invalid word";

            //if it's at pos. 0
            //add "way" to the end
        } else if (vowel == 0) {
            return word + "way";
            //else
            //take the substring from the vowel to the end
            //add the substring from 0 until vowel pos. - 1
            //add "ay"

        } else {
            return word.substring(vowel, word.length()) + word.substring(0, vowel) + "ay";
        }
    }

    public static int findVowel(String word) {

        //for loop i from position 0 to 4 (or end of word)
        //for loops create a sequential counter for you
        //use charAt() to get the letter
        //if it's a 'or' 'e' or 'i' or 'o' or 'u'
        //return position(variable i)

        for  (int i = 0; i < word.length(); i++) {
          if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e' || (word.charAt(i) == 'i'
                  || (word.charAt(i) == 'o' || (word.charAt(i) == 'u')) {
                return i;
          }

           //if not vowel found
            return -1;

        }

    }


















