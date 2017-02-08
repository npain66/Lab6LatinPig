import java.util.Scanner;

/**
 * Created by Nicole on 2/7/2017.
 */
public class Practice {
    public static void main(String[] args) {
        //output a count from 1 to 1000
        for (int i = 1; i <= 1000; i++) System.out.println(i);

        //output a count from 200 to 0 by fours (200 196 192... 0)
        for (int i = 200; i >= 0; i -= 4) System.out.println(i);

        //take an int from user
        //keep prompting then for an int until it's between 1 AND 10
        Scanner scan = new Scanner(System.in);
        {
            int number;
            do {
                System.out.print("Please enter an integer between 1 and 10");
                number = scan.nextInt();
            } while (number < 1 || number > 10);

            System.out.println("Thank you; your number is " + number);

            String sentence = "Hello world";
            //output the contents of sentence until the first space
            //find a space
            int firstSpace;
            firstSpace = sentence.indexOf('');
            //get the contents up until the first space
            // note: this will not include the space in substring
            String firstWord = sentence.substring(0, firstSpace);
            //output
            System.out.println(firstWord);

            //System.out.println();
            String w = firstWord ("this weeks with any sentence");
            System.out.println(w);

            //write a method that takes a String argument and returns the first word
            //call the method firstWord
            public static String firstWord(Strings) {

            //find a space
            int firstSpace = s.indexOf('');

            //get the contents up until the first space
            // note: this will not include the space in substring
            String firstSpace = s.substring(0, firstSpace);

            //output
            return firstWord;
        }


        }



    }
}
