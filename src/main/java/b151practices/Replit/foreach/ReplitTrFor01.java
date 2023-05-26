package b151practices.Replit.foreach;

public class ReplitTrFor01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
e.g:
char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
         */
        String name = "John came late";
        int counter=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'){
                counter=counter+1;
            }
        }System.out.println("Number of a = "+counter);




    }
}
