package b151practices.MentorTeam.overriding;

public class Test extends Test06 {
    public void go() {
        System.out.println("Bad");
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
}
