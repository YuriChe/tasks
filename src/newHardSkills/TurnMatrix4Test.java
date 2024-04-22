package newHardSkills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static newHardSkills.TurnMartix.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurnMatrix4Test {

    static int sizeMatrix;
    static long[][] matrix;
    static long[][] matrixTranspose;

    @BeforeEach
    void setUp() {
        sizeMatrix = 4;
        TurnMartix.sizeMatrix = 4;
        matrix = new long[sizeMatrix][sizeMatrix];
        int num = 1;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = num++;
            }
        }
        matrixTranspose = new long[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
    }

    @Test
    public void turnRight() {
        transpose(matrix);
        changeLines(matrix);
        /*for (long[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }*/
        assertArrayEquals(matrix[3], new long[]{16, 12, 8, 4});
    }

    @Test
    public void transpose4() {
        transpose(matrix);
        int i = 0;
        for (long[] line : matrixTranspose) {
            assertArrayEquals(matrix[i], line);
            i++;
        }
    }

    @Test
    public void changeLines4() {
        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        changeLines(matrix);
        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        assertArrayEquals(matrix[1], new long[]{8, 7, 6, 5});
    }

    @Test
    public void turnLeftTest() {
        turnLeft(matrix);
        for (long[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        assertArrayEquals(matrix[3], new long[]{1, 5, 9, 13});
    }
}
