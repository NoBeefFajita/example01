package example01.l220413;

public class Exam04 {

    public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {

        if (x.length != y.length || x.length != z.length) return false;
        for(int i = 0; i < x.length; i++) {
            if(x[i].length != y[i].length || x[i].length != z[i].length) return false;
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return true;
    }

    public static void printMatrix(int[][] x, int[][] y, int[][] z) {

        System.out.println("행렬a");
        for (int[] ints : x) {
            for (int n : ints) {
                System.out.print(n);
            }
            System.out.println();
        }

        System.out.println("행렬b");
        for (int[] ints : y) {
            for (int n : ints) {
                System.out.print(n);
            }
            System.out.println();
        }

        System.out.println("행렬c");
        for (int[] ints : z) {
            for (int n : ints) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] x = {{1, 2, 3},
                     {4, 5, 6}};
        int[][] y = {{6, 3, 4},
                     {5, 1, 2}};
        int[][] z = new int[2][3];

        if(addMatrix(x,y,z)) {
            printMatrix(x,y,z);
        }
    }
}
