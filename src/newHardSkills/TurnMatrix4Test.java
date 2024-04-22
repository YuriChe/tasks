package newHardSkills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static newHardSkills.TurnMartix.*;
import static newHardSkills.TurnMartix.turnLeft;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TurnMatrix4Test {


    static int sizeMatrix;
    static int[][] matrix;
    static int[][] matrixTranspose;

    @BeforeEach
    void setUp() {
        sizeMatrix = 4;
        TurnMartix.sizeMatrix = 4;
        matrix = new int[sizeMatrix][sizeMatrix];
        int num = 1;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = num++;
            }
        }
        matrixTranspose = new int[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
    }

    public void rightTurn3() {
        rightTurn(matrix);
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        assertArrayEquals(matrix[2], new int[]{9, 6, 3});
    }

    @Test
    public void turnRight() {
        transpose(matrix);
        changeLines(matrix);
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        assertArrayEquals(matrix[3], new int[]{16, 12, 8, 4});
    }

    @Test
    public void transpose4() {
        transpose(matrix);
        int i = 0;
        for (int[] line : matrixTranspose) {
            System.out.println(Arrays.toString(line));
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
        assertArrayEquals(matrix[1], new int[]{8, 7, 6, 5});
    }


    @Test
    public void turnLeftTest() {
        turnLeft(matrix);
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        assertArrayEquals(matrix[3], new int[]{1, 5, 9, 13});
    }
}
