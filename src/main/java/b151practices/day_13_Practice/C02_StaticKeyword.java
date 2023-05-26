package b151practices.day_13_Practice;

public class C02_StaticKeyword {
    //Bu Class calistiginda Output ne olur. Calisma mantigi nedir.
    static int y;
    int x;

    public C02_StaticKeyword(int i) {
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        C02_StaticKeyword obj1 =new C02_StaticKeyword(2);// Class iceriissnde Parametreli cons. olusturunca
        C02_StaticKeyword obj2=new C02_StaticKeyword(3);// default constructor öldü. o yüzden Parametreli olusturmamiz lazim.

        System.out.println(obj1.x+ ", "+obj2.x+", "+ obj2.y);

    }

}
