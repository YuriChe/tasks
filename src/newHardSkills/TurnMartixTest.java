package newHardSkills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static newHardSkills.TurnMartix.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurnMartixTest {
    static int sizeMatrix;
    static long[][] matrix;
    static long[][] matrixTranspose;

    @BeforeEach
    void setUp() {
        sizeMatrix = 3;
        TurnMartix.sizeMatrix = 3;
        matrix = new long[sizeMatrix][sizeMatrix];
        int num = 1;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = num++;
            }
        }
        matrixTranspose = new long[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    }

    @Test
    public void rightTurn3() {
        turnRightCodeForCheck(matrix);
        assertArrayEquals(matrix[2], new long[]{9, 6, 3});
    }

    @Test
    public void turnRight() {
        transpose(matrix);
        changeLines(matrix);
        assertArrayEquals(matrix[2], new long[]{9, 6, 3});
    }

    @Test
    public void transpose3() {
        transpose(matrix);
        int i = 0;
        for (long[] line : matrixTranspose) {
            assertArrayEquals(matrix[i], line);
            i++;
        }
    }

    @Test
    public void changeLines3() {
        changeLines(matrix);
        assertArrayEquals(matrix[1], new long[]{6, 5, 4});
    }

    @Test
    public void turnLeftTest() {
        turnLeft(matrix);
        assertArrayEquals(matrix[2], new long[]{1, 4, 7});
    }
}