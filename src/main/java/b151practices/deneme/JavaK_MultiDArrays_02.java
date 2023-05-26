package b151practices.deneme;

public class JavaK_MultiDArrays_02 {
    public static void main(String[] args) {
        int[][] x = {{1, 2}, {3, 4, 5}};
        System.out.println(m(x));
    }
    public static int m(int[][] m) {
        int result = 3;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result += m[i][j];
                System.out.println(result);
            }
        }
        return result;
    }
}
