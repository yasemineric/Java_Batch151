package b151practices.deneme;

import java.util.Scanner;

public class M05_Deneme {
    /*
    Kullanicidan  yasini ve kilosunu alaliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Alt");
        int alt=input.nextInt();
        System.out.println("Bitte geben Sie Ihr Gewicht");
        int gwht=input.nextInt();

        String blutSpenden= alt<18?"Sie können ihr Blut nicht spenden":gwht<50?"Sie können ihr Blut nicht spenden":"Sie können ihr Blut  spenden";
        System.out.println(blutSpenden);





    }
}
