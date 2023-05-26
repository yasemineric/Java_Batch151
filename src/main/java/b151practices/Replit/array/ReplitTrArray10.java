package b151practices.Replit.array;

import java.util.Scanner;

public class ReplitTrArray10 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
Test Data:
sentence -> "Java is fun"
reversed **-> "**fun is Java**"**
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cumle yaziniz");
        String sentence = input.nextLine();
        String reversed = "";
        String words[] = sentence.split(" ");

        for (int i = words.length - 1; i > -1; i--) {
            reversed=reversed+words[i]+" ";
        }
        System.out.println("**"+reversed+"**");
    }
}
