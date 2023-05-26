package b151practices.day_07_Practice;

import java.util.Arrays;

public class C04_Array {
    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,-5,-6};


        int idx=0;
        int brr[]=new int[arr.length];
        for(int w:arr){// arr.deki her bir elemani foreach ile aldik
            brr[idx]=w*-1;// her elemanin negatif degerini sirasiyla brr.ye assign ettik
            idx++;
        }
        System.out.println(Arrays.toString(brr));







    }
}
