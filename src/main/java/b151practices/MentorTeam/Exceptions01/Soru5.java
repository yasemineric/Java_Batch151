package b151practices.MentorTeam.Exceptions01;

public class Soru5 {
    public static void main(String[] args) {

        String s = "abcd";
        try {
            Object obj = new String("12");
            System.out.println(obj);
            s = (String)obj;
        }catch(ClassCastException e){
            System.out.println("Good");
        }
        System.out.println(s);
    }
}
