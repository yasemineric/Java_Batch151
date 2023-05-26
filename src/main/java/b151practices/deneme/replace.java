package b151practices.deneme;

public class replace {
    public static void main(String[] args) {
        String str = "seyhan yavuz";
        System.out.println(str.replace("s", "S"));
        System.out.println(str.replace("y", "Y"));

        System.out.println(str.replaceAll("s", "S"));
        System.out.println(str.replaceAll("y", "Y"));

        System.out.println(str.replace('s', 'S'));
        System.out.println(str.replace('y', 'Y'));

        //System.out.println(str.replaceAll('s', 'S'));
        //System.out.println(str.replaceAll('y', 'Y'));

        String b = "Ali 12 ?_";
        System.out.println(b.replaceAll("\\w", "*"));
        System.out.println(b.replaceAll("\\W", "*"));


        String s = "Java is Java";
        System.out.println(s.indexOf("va", 2));

        //function(2, 3);
        function(1.2, 3);


    }

   /*
    public static void function(float i, int j){

        System.out.println("Good");
    }
    public static void function(double i, double j){
        System.out.println("Bad");
    }

    */

    public static void function(float i, int j){
        System.out.println("Good");
    }
    public static void function(double i, double j){
        System.out.println("Bad");
    }
}
