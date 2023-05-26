package b151practices.Replit.array;

public class ReplitTrArray11 {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
         */
        double result1=0;
        double result2=0;
        double result3=0;
        int i=0;
        int s=0;
        int[] binary1={1,0,0,0,1,0};
        int[] binary2={1,1,0,0,1,0};
            for(int k= binary1.length-1;k>-1;k--) {
                result1 =result1+ (binary1[k] * Math.pow(2, i));
                i++;
            }System.out.println(result1);

            for (int t = binary2.length - 1; t > -1; t--){
             result2 += (binary2[t] * Math.pow(2, s));
            s++;}
        System.out.println(result2);
        result3=result1+result2;
/*
int mod;
                String result = "";
                while (number > 0)
                {
                        mod = number % 2;
                        number /= 2;
                        result = String.valueOf(mod) + result;
                }
                return result;
        }
 */

        String binaryS="";
        int newInt =(int)result3;
        for (int j = newInt; j >0; j=j/2) {
            if(j%2==0){
                binaryS=0+binaryS;
            }else{
                binaryS=1+binaryS;
            }
        }
        System.out.println(binaryS);




    }
}
