package javaders.day12switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //Ex: Ekrana 5 kere "Hi" yazdirin
        //1 Weg:Nict vorsclagbar
        // (Repetition)Kod yazarken tekrar hos karsilanmaz. (clean code)
        // (Dynamic)Dinamik kodlar olmali
        // (Fix) Tamir ve update kolay yapilabilmeli(maintainable)

       /* System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Weg:
        //Wenn die gleiche Scritten widerholen müssen werden, benutzt man "loop"
        // 1) for-loop
        // 2)while-loop
        // 3)do-while-loop
        // 4) for-each-loop

         1)for loop
        for(// Baslangic degeri  ; Loop Calisma sarti   ; Arttirma-Azaltma ){
        calisacak kodlar}
         */
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }

        //Ex: 11den 14 kadar tum sayilari ekrana yazdirin

        for(int i=11;i<15;i++){   // for loop da "i" kullanmak bir teamul haline gelmis. standart gibi
            System.out.println(i);
        }

        //Ex:40dan
        for(int i=40;i>22;i--){
            if(i%2==0){
            System.out.println(i);
            }
        }
        //Ex: 18den 56.yatum tek sayilari yazdir. Tek sayilari süzmek icin if kullaniriz, sarta baglariz
        for(int i=18; i<57; i++){
            if(i%2!=0){ // i%2==1 yazmak cok da uygun degil
                System.out.print(i + " ");// yanyana yazdirir
            }
        }

    }//main
}//class
