package b151practices.deneme;

public class JavaK_Varargs_05 {
    public static void main(String args[]) {
        m1(10);
        m1(11, 12, 13, 14);
    }
    static void m1(int... a) {
        System.out.println("==> " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



