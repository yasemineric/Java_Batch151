package b151practices.day01practise;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {
        /*
         12345 sayısını rakamları toplamını bulunuz
         int num = 12345;
int a = num%10;
int b= (num/10)%10;
int c= (num/100)%10;
int d= (num/1000)%10;
int e= (num/10000)%10;

System.out.println(a+b+c+d+e);
         */
        int x=12345;
        int birler=x%10;//5
        int onlar=(x/10)%10;//4
        int yüzler=(x/100)%10;//3
        int binler=(x/1000)%10;//2
        int onbinler=(x/10000);//1
        System.out.println(birler+onlar+yüzler+binler+onbinler);



    }//main
}//class
