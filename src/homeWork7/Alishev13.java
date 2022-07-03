package homeWork7;

public class Alishev13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; // одномерный массив
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matrix[2][1]);
        System.out.println(matrix[0][0]);
        int[][] matrix2 = {{1, 0, 4}, {3, 2, 5, 4}, {7, 8, 9}};
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        String[][] masiv = {{"Привет,", " как дела", "?"}, {"Hello,", " how are you doing", "?"}};
        for (int a = 0; a < masiv.length; a++) {
            for (int b = 0; b < masiv[a].length; b++) {
                System.out.print(masiv[a][b]);
            }
            System.out.println();
        }
    }
}
