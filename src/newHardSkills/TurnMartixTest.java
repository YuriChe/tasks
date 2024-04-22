package newHardSkills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static newHardSkills.TurnMartix.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurnMartixTest {
    static int sizeMatrix;
    static int[][] matrix;
    static int[][] matrixTranspose;

    @BeforeEach
    void setUp() {
        sizeMatrix = 3;
        TurnMartix.sizeMatrix = 3;
        matrix = new int[sizeMatrix][sizeMatrix];
        int num = 1;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = num++;
            }
        }
        matrixTranspose = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    }

    @Test
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
        assertArrayEquals(matrix[2], new int[]{9, 6, 3});
    }

    @Test
    public void transpose3() {
        transpose(matrix);
        int i = 0;
        for (int[] line : matrixTranspose) {
            System.out.println(Arrays.toString(line));
            assertArrayEquals(matrix[i], line);
            i++;
        }

    }

    @Test
    public void changeLines3() {
        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        changeLines(matrix);
        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        assertArrayEquals(matrix[1], new int[]{6, 5, 4});
    }


    @Test
    public void turnLeftTest() {
        turnLeft(matrix);
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        assertArrayEquals(matrix[2], new int[]{1, 4, 7});
    }
}