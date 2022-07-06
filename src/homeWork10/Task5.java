package homeWork10;

public class Task5 {
    // есть массив например на 10 элементов, убрать повторяющиеся, распечатать массив без дублекатов
    public static void main(String[] args) {
        int[] massiv = {1, 1, 2, 2, 3, 3, 4, 5, 6, 6};
        int n = massiv.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (massiv[j] != massiv[i]) {
                    if (m != j) {
                        massiv[m] = massiv[j];
                    }
                    m++;
                }
            }
        }
        if (n != massiv.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = massiv[i];

            massiv = b;
        }
        for (int x : massiv) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


