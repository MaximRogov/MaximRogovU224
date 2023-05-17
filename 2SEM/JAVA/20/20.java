import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int m = 5; 
        int n = 4; 

        int[][] array = new int[m][n];

        int value = 1;
        int minRow = 0;
        int maxRow = m - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (value <= m * n) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                array[i][maxCol] = value++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                array[maxRow][i] = value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                array[i][minCol] = value++;
            }
            minCol++;
        }

        try {
            FileWriter writer = new FileWriter("output.txt");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
