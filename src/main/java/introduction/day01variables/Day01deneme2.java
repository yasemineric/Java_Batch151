package introduction.day01variables;

public class Day01deneme2 {
    static void swapValuesWithoutUsingThirdVariable(int m, int n) {
        m = m - n;
        n = m + n;
        m = n - m;

        System.out.println("Value of m is " + m + " and Value of n is " + n);
    }

    public static void main(String[] args) {
        int m=9,n=5;
        swapValuesWithoutUsingThirdVariable(m,n);
    }


}

