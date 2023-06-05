package ua.hillel.kravchenko.lesson17;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.hillel.kravchenko.lessons.lesson17.Main;

import static org.junit.Assert.assertEquals;

public class TestDoubleAverage {

    @Test
    public void test1() {
        Assertions.assertTrue(Main.doubleAverage(new int[]{1, 2, 3, 4}) == 2.5);
    }

    @Test
    public void test2() {
        double index = Main.doubleAverage(null);
        assertEquals(0, index);
    }

    @Test
    public void test3() {
        double index = Main.doubleAverage(new int[0]);
        assertEquals(0, index);
    }

    @Test
    public void test4() {
        Assertions.assertEquals(-1, Main.matrixSquire(null));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(0, Main.matrixSquire(new int[0][0]));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(1, Main.matrixSquire(new int[4][4]));
    }
}
